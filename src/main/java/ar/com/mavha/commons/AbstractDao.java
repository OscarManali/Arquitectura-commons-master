package ar.com.mavha.commons;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * Implementación genérica de DAO con todos los métodos útiles para simplificar las consultas de las entidades de negocios.
 * @author Paulo Cesar Canale
 * @param <T> Entity
 */
public abstract class AbstractDao<T> {

    /**
     * Clase del tipo
     */
    private Class<T> type;

    /**
     * Método abstracto a implementar con el objetivo de pasar la referencia de
     * la instacia del EntityManager
     *
     * @return EntityManager
     */
    protected abstract EntityManager getEntityManager();

    /**
     * Constructor por defecto con inferencia de tipo de entidad por refleccion.
     */
    public AbstractDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    /**
     * Constructor sobrecargado.
     *
     * @param beanClass Clase del tipo
     */
    public AbstractDao(Class<T> beanClass) {
        this.type = beanClass;
    }

    /**
     * Comprueba la existencia del objeto
     *
     * @param entity
     * @return
     */
    public boolean contains(T entity) {
        return getEntityManager().contains(entity);
    }

    /**
     * Contar todos
     *
     * @return
     */
    public long count() {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        criteriaQuery.select(criteriaBuilder.count(criteriaQuery.from(type)));
        return getEntityManager().createQuery(criteriaQuery).getSingleResult();
    }

    /**
     * Contar por claves y valores
     *
     * @param mapKeyValue
     * @return
     */
    public long count(Map<String, Object> mapKeyValue) {
        String jpql = "SELECT COUNT(t) FROM " + type.getName() + " t WHERE ";
        boolean b = true;
        for (String key : mapKeyValue.keySet()) {
            if (b) {
                jpql += "t." + key + " = :" + key;
                b = false;
            } else {
                jpql += " AND t." + key + " = :" + key;
            }
        }
        Query createQuery = getEntityManager().createQuery(jpql);
        mapKeyValue.entrySet().forEach((entry) -> {
            createQuery.setParameter(entry.getKey(), entry.getValue());
        });
        return (long) createQuery.getSingleResult();
    }

    /**
     * Contar por expresiones
     *
     * @param expressions
     * @return
     */
    public long count(List<Expression> expressions) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery.select(criteriaBuilder.count(root));
        List<Predicate> predicates = new ArrayList<>();
        expressions.forEach((expression) -> {
            predicates.add(expression.toPredicate(criteriaBuilder, root));
        });
        if (!predicates.isEmpty()) {
            criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        }
        return getEntityManager().createQuery(criteriaQuery).getSingleResult();
    }

    /**
     * Guardar objeto
     *
     * @param entity
     */
    public void save(Object entity) {
        getEntityManager().persist(entity);
    }

    /**
     * Guardar lista de objetos
     *
     * @param entities
     */
    public void save(List<T> entities) {
        entities.forEach((entity) -> {
            save(entity);
        });
    }

    /**
     * Actualizar objeto
     *
     * @param entity
     */
    public void update(Object entity) {
        Object merge = getEntityManager().merge(entity);
    }

    /**
     * Actualizar lista de objetos
     *
     * @param entities
     */
    public void update(List<T> entities) {
        entities.forEach((entity) -> {
            update(entity);
        });
    }

    /**
     * Actualizar por JPQL
     *
     * @param jpql
     * @param parameters
     * @return
     */
    public int executeUpdate(String jpql, Map<String, Object> parameters) {
        Query query = getEntityManager().createQuery(jpql);
        parameters.entrySet().forEach((entry) -> {
            query.setParameter(entry.getKey(), entry.getValue());
        });
        return query.executeUpdate();
    }

    /**
     * Eliminar objeto
     *
     * @param entity
     */
    public void delete(T entity) {
        getEntityManager().remove(getEntityManager().contains(entity) ? entity : getEntityManager().merge(entity));
    }

    /**
     * Eliminar todos los objetos
     *
     * @return
     */
    public int deleteAll() {
        return getEntityManager().createQuery("DELETE FROM " + type.getName()).executeUpdate();
    }

    /**
     * Eliminar objeto por clave primaria
     *
     * @param primaryKey
     */
    public void deleteWithPrimaryKey(final Object primaryKey) {
        getEntityManager().remove(getEntityManager().getReference(type, primaryKey));
    }

    /**
     * Encontrar único objeto por clave primaria
     *
     * @param primaryKey
     * @return
     */
    public T find(final Object primaryKey) {
        return getEntityManager().find(type, primaryKey);
    }

    /**
     * Encontrar único objeto por expresión
     *
     * @param mapKeyValue
     * @return
     */
    public T findSingleResult(Map<String, Object> mapKeyValue) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        for (Map.Entry<String, Object> entry : mapKeyValue.entrySet()) {
            predicates.add(criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue()));
        }
        criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        T result = null;
        try {
            result = typedQuery.getSingleResult();
        } catch (Exception exception) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, exception);
        } finally {
            return result;
        }
    }

    /**
     * Encontrar único objeto por lista de expresiones
     *
     * @param expressions
     * @return
     */
    public T findSingleResult(List<Expression> expressions) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        for (Expression expression : expressions) {
            predicates.add(expression.toPredicate(criteriaBuilder, root));
        }
        if (!predicates.isEmpty()) {
            criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        }
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        T result = null;
        try {
            result = typedQuery.getSingleResult();
        } catch (Exception exception) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, exception);
        } finally {
            return result;
        }
    }

    /**
     * Enontrar todos los objetos
     *
     * @return
     */
    public List<T> find() {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        return this.getEntityManager().createQuery(criteriaQuery.select(root)).getResultList();
    }

    /**
     * Encontrar todos los objetos y ordenarlos por atributo
     *
     * @param attributeName
     * @param asc
     * @return
     */
    public List<T> find(String attributeName, boolean asc) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery.select(root).orderBy(asc ? criteriaBuilder.asc(root.get(attributeName)) : criteriaBuilder.desc(root.get(attributeName))));
        return typedQuery.getResultList();
    }

    /**
     * Encontrar todos los objetos y ordenarlos por atributos
     *
     * @param attributeNameFirst
     * @param ascFirst
     * @param attributeNameSecond
     * @param ascSecond
     * @return
     */
    public List<T> find(String attributeNameFirst, boolean ascFirst, String attributeNameSecond, boolean ascSecond) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery.select(root)
                .orderBy(ascFirst ? criteriaBuilder.asc(root.get(attributeNameFirst)) : criteriaBuilder.desc(root.get(attributeNameFirst)))
                .orderBy(ascSecond ? criteriaBuilder.asc(root.get(attributeNameSecond)) : criteriaBuilder.desc(root.get(attributeNameSecond))));
        return typedQuery.getResultList();
    }

    /**
     * Encontrar todos los objetos y ordenarlos por atributo, ademas delimitar
     * resultados
     *
     * @param attributeName
     * @param asc
     * @param startPosition
     * @param maxResult
     * @return
     */
    public List<T> find(String attributeName, boolean asc, int startPosition, int maxResult) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery.select(root).orderBy(asc ? criteriaBuilder.asc(root.get(attributeName)) : criteriaBuilder.desc(root.get(attributeName))));
        typedQuery.setFirstResult(startPosition);
        typedQuery.setMaxResults(maxResult);
        return typedQuery.getResultList();
    }

    /**
     *
     * Encontrar todos los objetos que cumplan con las condiciones de par-valor
     *
     * @param mapKeyValue
     * @return
     */
    public List<T> find(Map<String, Object> mapKeyValue) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        for (Map.Entry<String, Object> entry : mapKeyValue.entrySet()) {
            predicates.add(criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue()));
        }
        if (!predicates.isEmpty()) {
            criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        }
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

    /**
     * Encontrar todos los objetos que cumplan con las condiciones de par-valor
     * y ordenarlos por atributo
     *
     * @param mapKeyValue
     * @param attributeName
     * @param asc
     * @return
     */
    public List<T> find(Map<String, Object> mapKeyValue, String attributeName, boolean asc) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        mapKeyValue.entrySet().forEach((entry) -> {
            predicates.add(criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue()));
        });
        criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        criteriaQuery = criteriaQuery.orderBy(asc
                ? criteriaBuilder.asc(root.get(attributeName))
                : criteriaBuilder.desc(root.get(attributeName)));
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

    /**
     * Encontrar todos los objetos que cumplan con las condiciones de par-valor
     * y ordenarlos por atributo, ademas delimitar resultados
     *
     * @param mapKeyValue
     * @param attributeName
     * @param asc
     * @param maxResult
     * @return
     */
    public List<T> find(Map<String, Object> mapKeyValue, String attributeName, boolean asc, int maxResult) {
        return find(mapKeyValue, attributeName, asc, 0, maxResult);
    }

    /**
     * Encontrar todos los objetos que cumplan con las condiciones de par-valor
     * y ordenarlos por atributo, ademas delimitar resultados
     *
     * @param mapKeyValue
     * @param attributeName
     * @param asc
     * @param startPosition
     * @param maxResult
     * @return
     */
    public List<T> find(Map<String, Object> mapKeyValue, String attributeName, boolean asc, int startPosition, int maxResult) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        mapKeyValue.entrySet().forEach((entry) -> {
            predicates.add(criteriaBuilder.equal(root.get(entry.getKey()), entry.getValue()));
        });
        criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        criteriaQuery = criteriaQuery.orderBy(asc
                ? criteriaBuilder.asc(root.get(attributeName))
                : criteriaBuilder.desc(root.get(attributeName)));
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        typedQuery.setFirstResult(startPosition);
        typedQuery.setMaxResults(maxResult);
        return typedQuery.getResultList();
    }

    /**
     * Encontrar todos los objetos por lista de expresiones
     *
     * @param expressions
     * @return
     */
    public List<T> find(List<Expression> expressions) {
        return find(expressions, false, null, false);
    }

    /**
     * Encontrar todos los objetos por lista de expresiones y ordenarlos por
     * atributo
     *
     * @param expressions
     * @param attributeName
     * @param asc
     * @return
     */
    public List<T> find(List<Expression> expressions, String attributeName, boolean asc) {
        return find(expressions, true, attributeName, asc);
    }

    /**
     * Encontrar todos los objetos por lista de expresiones, opcional ordenarlos
     * por atributo
     *
     * @param expressions
     * @param order
     * @param attributeName
     * @param asc
     * @return
     */
    private List<T> find(List<Expression> expressions, boolean order, String attributeName, boolean asc) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        expressions.forEach((expression) -> {
            predicates.add(expression.toPredicate(criteriaBuilder, root));
        });
        if (!predicates.isEmpty()) {
            criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        }
        if (order) {
            criteriaQuery = criteriaQuery.orderBy(asc
                    ? criteriaBuilder.asc(root.get(attributeName))
                    : criteriaBuilder.desc(root.get(attributeName)));
        }
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

    /**
     *
     * Encontrar todos los objetos por lista de expresiones y ordenarlos por
     * atributo, ademas delimitar resultados
     *
     * @param expressions
     * @param attributeName
     * @param asc
     * @param maxResult
     * @return
     */
    public List<T> find(List<Expression> expressions, String attributeName, boolean asc, int maxResult) {
        return find(expressions, attributeName, asc, 0, maxResult);
    }

    /**
     * Encontrar todos los objetos por lista de expresiones, ademas delimitar resultados
     *
     * @param expressions
     * @param startPosition
     * @param maxResult
     * @return
     */
    public List<T> find(List<Expression> expressions, int startPosition, int maxResults) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        expressions.forEach((expression) -> {
            predicates.add(expression.toPredicate(criteriaBuilder, root));
        });
        if (!predicates.isEmpty()) {
            criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        }
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        typedQuery.setFirstResult(startPosition);
        typedQuery.setMaxResults(maxResults);
        return typedQuery.getResultList();
    }
    
    /**
     * Encontrar todos los objetos por lista de expresiones, opcional ordenarlos
     * por atributo, ademas delimitar resultados
     *
     * @param expressions
     * @param attributeName
     * @param asc
     * @param startPosition
     * @param maxResult
     * @return
     */
    public List<T> find(List<Expression> expressions, String attributeName, boolean asc, int startPosition, int maxResult) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery();
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery = criteriaQuery.select(root);
        List<Predicate> predicates = new ArrayList<>();
        expressions.forEach((expression) -> {
            predicates.add(expression.toPredicate(criteriaBuilder, root));
        });
        if (!predicates.isEmpty()) {
            criteriaQuery = criteriaQuery.where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));
        }
        criteriaQuery = criteriaQuery.orderBy(asc
                ? criteriaBuilder.asc(root.get(attributeName))
                : criteriaBuilder.desc(root.get(attributeName)));
        TypedQuery<T> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
        typedQuery.setFirstResult(startPosition);
        typedQuery.setMaxResults(maxResult);
        return typedQuery.getResultList();
    }

    /**
     * Encontrar todos los objetos por JPQL
     *
     * @param jpql
     * @param parameters
     * @return
     */
    public List<T> find(String jpql, Map<String, Object> parameters) {
        Query query = getEntityManager().createQuery(jpql);
        parameters.entrySet().forEach((entry) -> {
            query.setParameter(entry.getKey(), entry.getValue());
        });
        return (List<T>) query.getResultList();
    }

    /**
     * Encontrar todos los objetos por JPQL, ademas delimitar resultados
     *
     * @param jpql
     * @param parameters
     * @param maxResult
     * @return
     */
    public List<T> find(String jpql, Map<String, Object> parameters, int maxResult) {
        Query query = getEntityManager().createQuery(jpql);
        parameters.entrySet().forEach((entry) -> {
            query.setParameter(entry.getKey(), entry.getValue());
        });
        query.setMaxResults(maxResult);
        return (List<T>) query.getResultList();
    }

    /**
     * Encontrar todos los objetos distintos por campo indicado
     *
     * @param <A>
     * @param field
     * @param clazz
     * @return
     */
    public <A> List<A> findDistinct(String field, Class<A> clazz) {
        String query = "SELECT DISTINCT t." + field + " FROM " + type.getName() + " t ORDER BY t." + field + "";
        return getEntityManager().createQuery(query, clazz).getResultList();
    }

    /**
     * Encontrar todos los objetos distintos por campo indicado y que cumplan
     * con las condiciones de par-valor
     *
     * @param <A>
     * @param field
     * @param clazz
     * @param mapKeyValue
     * @return
     */
    public <A> List<A> findDistinct(String field, Class<A> clazz, Map<String, Object> mapKeyValue) {
        String jpql = "SELECT DISTINCT t." + field + " FROM " + type.getName() + " AS t ";
        boolean b = true;
        for (String key : mapKeyValue.keySet()) {
            if (b) {
                jpql += " WHERE t." + key + " = :" + key;
                b = false;
            } else {
                jpql += " AND t." + key + " = :" + key;
            }
        }
        jpql += " ORDER BY t." + field + "";
        TypedQuery<A> query = getEntityManager().createQuery(jpql, clazz);
        mapKeyValue.entrySet().forEach((entry) -> {
            query.setParameter(entry.getKey(), entry.getValue());
        });
        return query.getResultList();
    }
}