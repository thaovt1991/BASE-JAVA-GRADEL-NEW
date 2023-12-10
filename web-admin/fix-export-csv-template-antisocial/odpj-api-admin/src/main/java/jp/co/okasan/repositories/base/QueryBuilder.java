package jp.co.okasan.repositories.base;

import com.google.common.base.Strings;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Visitor;
import com.querydsl.core.types.dsl.ComparableExpression;
import com.querydsl.core.types.dsl.SimpleExpression;
import com.querydsl.core.types.dsl.StringExpression;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;

public class QueryBuilder implements Predicate {
    private BooleanBuilder builder;

    private QueryBuilder() {
        this.builder = new BooleanBuilder();
    }

    public static QueryBuilder newQueryBuilder() {
        return new QueryBuilder();
    }

    @Override
    public Predicate not() {
        return builder.not();
    }

    @Override
    public <R, C> R accept(Visitor<R, C> v, C context) {
        return builder.accept(v, context);
    }

    @Override
    public Class<? extends Boolean> getType() {
        return Boolean.class;
    }

    public QueryBuilder and(@Nullable Predicate right) {
        builder.and(right);
        return this;
    }

    public QueryBuilder or(@Nullable Predicate right) {
        builder.or(right);
        return this;
    }

    public <T> QueryBuilder eqIfProvided(SimpleExpression<T> attribute, T value) {
        return (value == null) ? this : this.and(attribute.eq(value));
    }

    public QueryBuilder eqIfProvided(StringExpression attribute, String value) {
        return (Strings.isNullOrEmpty(value)) ? this : this.and(attribute.eq(value));
    }

    public QueryBuilder eqIfProvided(SimpleExpression<java.lang.String> attribute, String value) {
        return (value == null) ? this : this.and(attribute.eq(value));
    }

    public <T extends Comparable<T>> QueryBuilder goeIfProvided(
            ComparableExpression<LocalDateTime> attribute, LocalDateTime value) {
        return (value == null) ? this
                : this.and(attribute.goe(value));
    }

    public <T extends Comparable<T>> QueryBuilder loeIfProvided(
            ComparableExpression<LocalDateTime> attribute, LocalDateTime value) {
        return (value == null) ? this
                : this.and(attribute.loe(value));
    }
}
