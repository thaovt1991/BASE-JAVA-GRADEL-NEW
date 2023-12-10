package jp.co.okasan.repositories.base;

import com.querydsl.core.types.dsl.PathBuilderFactory;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseRepositoryCustom {

  @PersistenceContext
  protected EntityManager em;

  private static final String PERCENT = "%";

  protected <Q> Querydsl queryDsl(Class<Q> classes) {
    return new Querydsl(em, (new PathBuilderFactory()).create(classes));
  }

  protected <Q> Page<Q> fetch(Querydsl querydsl, JPAQuery<Q> query, Pageable pageable) {
    JPQLQuery<Q> result = querydsl.applyPagination(pageable, query);
    return new PageImpl<>(result.fetch(), pageable, result.fetchCount());
  }

  protected String getValueLike(String value) {
    return PERCENT + value + PERCENT;
  }
}
