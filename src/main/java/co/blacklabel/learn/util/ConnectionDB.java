package co.blacklabel.learn.util;

import co.blacklabel.learn.model.Servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

public class ConnectionDB<T> {
  private Class<T> c;
  private static EntityManager em = null;

  public ConnectionDB() {
    em = getEm();
  }

  public ConnectionDB(Class<T> c) {
    em = getEm();
    this.c = c;
  }

  public void setC(Class<T> c) {
    this.c = c;
  }

  public static EntityManager getEm() {
    if (em == null) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("tiendauDB");
      em = emf.createEntityManager();
    }
    return em;
  }

  public <E> T find(E id) {
    return em.find(c, id);
  }

  public List<T> list() {
    TypedQuery<T> consulta = em.createNamedQuery(c.getSimpleName() + ".findAll", c);
    return consulta.getResultList();
  }

  public void insert(T o) {
    try {
      em.getTransaction().begin();
      em.persist(o);
      em.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void update(T o) {
    try {
      em.getTransaction().begin();
      em.merge(o);
      em.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void delete(T o) {
    try {
      em.getTransaction().begin();
      em.remove(o);
      em.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public <E> T findByField(String fieldName, E fieldValue) {
    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(c);
    Root<T> root = criteriaQuery.from(c);
    criteriaQuery.select(root);

    ParameterExpression<String> params = criteriaBuilder.parameter(String.class);
    criteriaQuery.where(criteriaBuilder.equal(root.get(fieldName), params));

    TypedQuery<T> query = em.createQuery(criteriaQuery);
    query.setParameter(params, (String) fieldValue);

    List<T> queryResult = query.getResultList();

    T returnObject = null;

    if (!queryResult.isEmpty()) {
      returnObject = queryResult.get(0);
    }
    return returnObject;
  }

  public List<Servicio> getServicesForStore(int store){
    TypedQuery<T> query = (TypedQuery<T>) em.createQuery("select s from Servicio s where s.tienda = :store", Servicio.class);
    query.setParameter("store", store);
    return (List<Servicio>) query.getResultList();
  }
}