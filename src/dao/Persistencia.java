/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;
import modelo.domain.Persona;
import modelo.domain.Tripulante;

/**
 *
 * @author claudio Implementación Genérica de un DAO (Data Access Object) usando
 * un EntityManager que ya cumple perfectamente con el patrón DAO. En algunos
 * casos se lo suele llamar DAP (Data Access Procedure). Se han agregado los
 * siguientes métodos: - iniciarTransaccion() - confirmarTransaccion() -
 * descartarTransaccion()
 *
 * Es posible agregar un método para manejar parámetros de búsqueda usando una
 * clase basada en el patrón Utility-Builder
 */
public class Persistencia {

    private final EntityManager em;

    public Persistencia(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();
    }

    public void iniciarTransaccion() {
        em.getTransaction().begin();
    }

    public void confirmarTransaccion() {
        em.getTransaction().commit();
    }

    public void descartarTransaccion() {
        em.getTransaction().rollback();
    }

    public void insertar(Object o) {
        this.em.persist(o);
    }

    public void modificar(Object o) {
        this.em.merge(o);
    }

    public void eliminar(Object o) {
        this.em.remove(o);
    }

    public void refrescar(Object o) {
        this.em.refresh(o);
    }

    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve un objeto de tipo (T)    
    public <T extends Object> T buscar(Class<T> clase, Object id) {
        return (T) this.em.find(clase, id);
    }

    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve una lista de ese tipo (T)
    public <T extends Object> List<T> buscarTodos(Class<T> clase) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        return em.createQuery(consulta).getResultList();
    }

    // el parametro de orden a pasar se obtiene del metamodelo generado por EclipseLink
    public <T extends Object, P extends Object> List<T> buscarTodosOrdenadosPor(Class<T> clase, SingularAttribute<T, P> orden) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        consulta.orderBy(cb.asc(inicio.get(orden)));
        return em.createQuery(consulta).getResultList();
    }

    public <T extends Object> T buscarODF(Class<T> clase, Object origen, Object destino, Object fecha) {
        try {
            Query query = em.createQuery("Select v from Vuelo v where v.origen = :o AND v.destino = :d AND v.fechaSalida = :f");
            query.setParameter("o", origen);
            query.setParameter("d", destino);
            query.setParameter("f", fecha);
            return (T) query.getSingleResult();

        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean disponible(Object fila, Object columna, Object idVuelo) {

        Query query = em.createQuery("Select count (r) from Reserva r where r.vuelo.idVuelo = :idVuelo AND r.fila = :fila AND r.columna = :columna");
        query.setParameter("idVuelo", idVuelo);
        query.setParameter("fila", fila);
        query.setParameter("columna", columna);
        final Long result = (Long) query.getSingleResult();

        return result <= 0;
        
    }

}
// Referencia datos genericos:
// http://docs.oracle.com/javase/tutorial/extra/generics/methods.html
