package ar.com.mavha.commons;

import ar.com.mavha.commons.AbstractDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.transaction.Transactional;

/**
 *
 * Implementación genérica de Service con todos los métodos útiles implementados
 * en AbstractDao
 *
 * @see AbstractDao
 * @author Paulo Cesar Canale
 * @param <T> Entity
 */
public abstract class AbstractService<T> {

    public abstract AbstractDao<T> getDao();

    public long count() {
        return getDao().count();
    }

    public long count(Map<String, Object> mapKeyValue) {
        return getDao().count(mapKeyValue);
    }

    public long count(List<Expression> expressions) {
        return getDao().count(expressions);
    }

    @Transactional
    public void save(T entity) {
        getDao().save(entity);
    }

    @Transactional
    public void save(List<T> entities) {
        getDao().save(entities);
    }

    @Transactional
    public void update(T entity) {
        getDao().update(entity);
    }

    @Transactional
    public void update(List<T> entities) {
        getDao().update(entities);
    }

    @Transactional
    public void delete(T entity) {
        getDao().delete(entity);
    }

    @Transactional
    public void deleteAll() {
        getDao().deleteAll();
    }

    @Transactional
    public void deleteWithPrimaryKey(final Object primaryKey) {
        getDao().deleteWithPrimaryKey(primaryKey);
    }

    public T find(final Object primaryKey) {
        return getDao().find(primaryKey);
    }

    public T findSingleResult(Map<String, Object> mapKeyValue) {
        return getDao().findSingleResult(mapKeyValue);
    }

    public T findSingleResult(Expression expression) {
        ArrayList<Expression> expressions = new ArrayList<>();
        expressions.add(expression);
        return getDao().findSingleResult(expressions);
    }

    public T findSingleResult(List<Expression> expressions) {
        return getDao().findSingleResult(expressions);
    }

    public List<T> find(String attributeName, boolean asc) {
        return getDao().find(attributeName, asc);
    }

    public List<T> find(String attributeNameFirst, boolean ascFirst, String attributeNameSecond, boolean ascSecond) {
        return getDao().find(attributeNameFirst, ascFirst, attributeNameSecond, ascSecond);
    }

    public List<T> find(String attributeName, boolean asc, int startPosition, int maxResult) {
        return getDao().find(attributeName, asc, startPosition, maxResult);
    }

    public List<T> find(Map<String, Object> mapKeyValue) {
        return getDao().find(mapKeyValue);
    }

    public List<T> find(Map<String, Object> mapKeyValue, String attributeName, boolean asc) {
        return getDao().find(mapKeyValue, attributeName, asc);
    }

    public List<T> find(Map<String, Object> mapKeyValue, String attributeName, boolean asc, int maxResult) {
        return getDao().find(mapKeyValue, attributeName, asc, maxResult);
    }

    public List<T> find(Map<String, Object> mapKeyValue, String attributeName, boolean asc, int startPosition, int maxResult) {
        return getDao().find(mapKeyValue, attributeName, asc, startPosition, maxResult);
    }

    public List<T> find(Expression expression) {
        ArrayList<Expression> expressions = new ArrayList<>();
        expressions.add(expression);
        return getDao().find(expressions);
    }

    public List<T> find(Expression expression, String attributeName, boolean asc) {
        ArrayList<Expression> expressions = new ArrayList<>();
        expressions.add(expression);
        return getDao().find(expressions, attributeName, asc);
    }

    public List<T> find(List<Expression> expressions) {
        return getDao().find(expressions);
    }

    public List<T> find(List<Expression> expressions, String attributeName, boolean asc) {
        return getDao().find(expressions, attributeName, asc);
    }

    public List<T> find(List<Expression> expressions, String attributeName, boolean asc, int startPosition, int maxResult) {
        return getDao().find(expressions, attributeName, asc, startPosition, maxResult);
    }
}
