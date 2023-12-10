package jp.co.okasan.config;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.CorsUtils;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Value("${cors.allows.origin}")
  private String origin;

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.httpBasic()
        .disable()
        .authorizeRequests()
        .requestMatchers(CorsUtils::isPreFlightRequest)
        .permitAll()
        .antMatchers("/actuator/**")
        .permitAll()
        .anyRequest()
        .permitAll()
        .and()
        .cors()
        .and()
        .csrf()
        .disable()
        // make sure we use stateless session; session won't be used to
        // store user's state.
        // TODO add JWT TokenAuthenticationEntryPoint
        // .exceptionHandling().authenticationEntryPoint(tokenAuthenticationEntryPoint).and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // TODO Add a filter to validate the tokens with every request
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();

    String[] allowOrigins = StringUtils.split(origin, ",");

    configuration.setAllowedOrigins(Arrays.asList(allowOrigins));

    configuration.addAllowedMethod("*");
    configuration.addAllowedHeader("*");
    configuration.setAllowCredentials(true);
    configuration.setMaxAge(3600L);

    UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource =
        new UrlBasedCorsConfigurationSource();
    urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", configuration);

    return urlBasedCorsConfigurationSource;
  }
}
