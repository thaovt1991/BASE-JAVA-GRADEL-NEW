package jp.co.okasan.core.server;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * convert Request param from snake_case to camelCase
 *
 * <pre>{@code example:
 *  ?param_a=1
 *  → will be map as {paramA:1}
 * }
 * </pre>
 */
@Component
public class SnakeCaseParamOncePerRequestFilter extends OncePerRequestFilter {
  private String toCamelCase(String snakeCase) {
    final var sb = new StringBuilder();
    final var isUnder = new AtomicBoolean(false);
    snakeCase
        .chars()
        .forEachOrdered(
            c -> {
              if (c == '_') {
                isUnder.set(true);
                return;
              }
              if (isUnder.getAndSet(false)) {
                if (c >= 'a' && c <= 'z') {
                  sb.append((char) (c - ('a' - 'A')));
                  return;
                }
              }
              sb.append((char) c);
            });
    return sb.toString();
  }

  @Override
  protected void doFilterInternal(
      HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    final Map<String, String[]> parameters =
        request.getParameterMap().entrySet().stream()
            .map(entry -> Map.entry(toCamelCase(entry.getKey()), entry.getValue()))
            .collect(Collectors.toConcurrentMap(Map.Entry::getKey, Map.Entry::getValue));

    filterChain.doFilter(
        new HttpServletRequestWrapper(request) {
          @Override
          public String getParameter(String name) {
            return parameters.containsKey(name) ? parameters.get(name)[0] : null;
          }

          @Override
          public Enumeration<String> getParameterNames() {
            return Collections.enumeration(parameters.keySet());
          }

          @Override
          public String[] getParameterValues(String name) {
            return parameters.get(name);
          }

          @Override
          public Map<String, String[]> getParameterMap() {
            return parameters;
          }
        },
        response);
  }
}
