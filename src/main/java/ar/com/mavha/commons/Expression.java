package ar.com.mavha.commons;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Implementación genérica de expresiones y predicados de consultas
 * @author Paulo Cesar Canale
 */
public class Expression {

    private String key;
    private Operator operator;
    private Object value;
    private Expression[] expressions;
    private Expression expression;
    private ComparableExpression comparableExpression;

    private Expression() {
    }

    private Expression(Operator operator, ComparableExpression comparableExpression) {
        this.operator = operator;
        this.comparableExpression = comparableExpression;
    }

    private Expression(String key, Operator operator, Object value) {
        this.key = key;
        this.operator = operator;
        this.value = value;
    }

    private Expression(Operator operator, Expression expression) {
        this.operator = operator;
        this.expression = expression;
    }

    private Expression(Operator operator, Expression... expressions) {
        this.operator = operator;
        this.expressions = expressions;
    }

    public static Expression equal(String key, Object value) {
        return new Expression(key, Operator.EQUAL, value);
    }

    public static Expression notEqual(String key, Object value) {
        return new Expression(key, Operator.NOT_EQUAL, value);
    }

    public static <E extends Comparable<E>> Expression greaterThan(String key, E value) {
        return new Expression(Operator.GREATER_THAN, new ComparableExpression<>(key, Operator.EQUAL, value));
    }

    public static <E extends Comparable<E>> Expression greaterThanOrEqualTo(String key, E value) {
        return new Expression(Operator.GREATER_THAN_OR_EQUAL_TO, new ComparableExpression<>(key, Operator.GREATER_THAN_OR_EQUAL_TO, value));
    }

    public static <E extends Comparable<E>> Expression lessThan(String key, E value) {
        return new Expression(Operator.LESS_THAN, new ComparableExpression<>(key, Operator.LESS_THAN, value));
    }

    public static <E extends Comparable<E>> Expression lessThanOrEqualTo(String key, E value) {
        return new Expression(Operator.LESS_THAN_OR_EQUAL_TO, new ComparableExpression<>(key, Operator.LESS_THAN_OR_EQUAL_TO, value));
    }

    public static <E extends Comparable<E>> Expression like(String key, Comparable<E> value) {
        return new Expression(key, Operator.LIKE, value);
    }

    public static Expression not(Expression expression) {
        return new Expression(Operator.NOT, expression);
    }

    public static Expression and(Expression... expressions) {
        return new Expression(Operator.AND, expressions);
    }

    public static Expression or(Expression... expressions) {
        return new Expression(Operator.OR, expressions);
    }

    public static <E extends Comparable<E>> Expression between(String key, E value, E valueTwo) {
        return new Expression(Operator.BETWEEN, new ComparableExpression<>(key, Operator.BETWEEN, value, valueTwo));
    }

    public static Expression join(String key, Object value) {
        return new Expression(key, Operator.JOIN, value);
    }

    public <R> Predicate toPredicate(CriteriaBuilder criteriaBuilder, Root<R> root) {
        switch (operator) {
            case EQUAL:
                return criteriaBuilder.equal(root.get(key), value);
            case NOT_EQUAL:
                return criteriaBuilder.notEqual(root.get(key), value);
            case GREATER_THAN:
                return comparableExpression.toPredicate(criteriaBuilder, root);
            case GREATER_THAN_OR_EQUAL_TO:
                return comparableExpression.toPredicate(criteriaBuilder, root);
            case LESS_THAN:
                return comparableExpression.toPredicate(criteriaBuilder, root);
            case LESS_THAN_OR_EQUAL_TO:
                return comparableExpression.toPredicate(criteriaBuilder, root);
            case LIKE:
                return criteriaBuilder.like(root.get(key).as(String.class), String.valueOf(value));
            case BETWEEN:
                return comparableExpression.toPredicate(criteriaBuilder, root);
            case AND:
                List<Predicate> predicatesAND = new ArrayList<>();
                for (Expression expressionAND : expressions) {
                    predicatesAND.add(expressionAND.toPredicate(criteriaBuilder, root));
                }
                return criteriaBuilder.and(predicatesAND.toArray(new Predicate[0]));
            case OR:
                List<Predicate> predicatesOR = new ArrayList<>();
                for (Expression expressionOR : expressions) {
                    predicatesOR.add(expressionOR.toPredicate(criteriaBuilder, root));
                }
                return criteriaBuilder.or(predicatesOR.toArray(new Predicate[0]));
            case NOT:
                return criteriaBuilder.not(expression.toPredicate(criteriaBuilder, root));
            case JOIN:
                return criteriaBuilder.equal(root.join(key), value);
            default:
                return null;
        }
    }

    static class ComparableExpression<T extends Comparable<T>> {

        private String key;
        private Operator operator;
        private T value;
        private T valueTwoBetween;

        public ComparableExpression() {
        }

        public ComparableExpression(String key, Operator operator, T value) {
            this.key = key;
            this.operator = operator;
            this.value = value;
        }

        public ComparableExpression(String key, Operator operator, T value, T valueTwoBetween) {
            this.key = key;
            this.operator = operator;
            this.value = value;
            this.valueTwoBetween = valueTwoBetween;
        }

        public <E extends Comparable<E>> ComparableExpression<E> greaterThan(String key, E value) {
            return new ComparableExpression<>(key, Operator.GREATER_THAN, value);
        }

        public <E extends Comparable<E>> ComparableExpression<E> greaterThanOrEqualTo(String key, E value) {
            return new ComparableExpression<>(key, Operator.GREATER_THAN_OR_EQUAL_TO, value);
        }

        public <E extends Comparable<E>> ComparableExpression<E> lessThan(String key, E value) {
            return new ComparableExpression<>(key, Operator.LESS_THAN, value);
        }

        public <E extends Comparable<E>> ComparableExpression<E> lessThanOrEqualTo(String key, E value) {
            return new ComparableExpression<>(key, Operator.LESS_THAN_OR_EQUAL_TO, value);
        }

        public <E extends Comparable<E>> ComparableExpression<E> between(String key, E value, E valueTwo) {
            return new ComparableExpression<>(key, Operator.BETWEEN, value, valueTwo);
        }

        public <R> Predicate toPredicate(CriteriaBuilder criteriaBuilder, Root<R> root) {
            switch (operator) {
                case GREATER_THAN:
                    return criteriaBuilder.greaterThan(root.<T>get(key), value);
                case GREATER_THAN_OR_EQUAL_TO:
                    return criteriaBuilder.greaterThanOrEqualTo(root.<T>get(key), value);
                case LESS_THAN:
                    return criteriaBuilder.lessThan(root.<T>get(key), value);
                case LESS_THAN_OR_EQUAL_TO:
                    return criteriaBuilder.lessThanOrEqualTo(root.<T>get(key), value);
                case BETWEEN:
                    return criteriaBuilder.between(root.<T>get(key), value, valueTwoBetween);
                default:
                    return null;
            }
        }

    }

    private enum Operator {

        EQUAL("="),
        NOT_EQUAL("!="),
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL_TO("<="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL_TO(">="),
        LIKE("LIKE"),
        BETWEEN("BETWEEN"),
        NOT("NOT"),
        AND("AND"),
        OR("OR"),
        JOIN("JOIN");

        private Operator(String token) {
            this.token = token;
        }

        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static List<Expression> createEmptyList() {
        return new ArrayList<>();
    }
}
