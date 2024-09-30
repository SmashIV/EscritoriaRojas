/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Modelos.Descuento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author smashiv
 */
public class DescuentoJpaController implements Serializable {

    public DescuentoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public DescuentoJpaController(){
        emf = Persistence.createEntityManagerFactory("Rojas_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Descuento descuento) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(descuento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Descuento descuento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            descuento = em.merge(descuento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = descuento.getIdDescuento();
                if (findDescuento(id) == null) {
                    throw new NonexistentEntityException("The descuento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Descuento descuento;
            try {
                descuento = em.getReference(Descuento.class, id);
                descuento.getIdDescuento();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The descuento with id " + id + " no longer exists.", enfe);
            }
            em.remove(descuento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Descuento> findDescuentoEntities() {
        return findDescuentoEntities(true, -1, -1);
    }

    public List<Descuento> findDescuentoEntities(int maxResults, int firstResult) {
        return findDescuentoEntities(false, maxResults, firstResult);
    }

    private List<Descuento> findDescuentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Descuento> cq = em.getCriteriaBuilder().createQuery(Descuento.class);
            cq.select(cq.from(Descuento.class));
            TypedQuery<Descuento> q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Descuento findDescuento(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Descuento.class, id);
        } finally {
            em.close();
        }
    }

    public int getDescuentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Descuento> rt = cq.from(Descuento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            TypedQuery<Long> q = em.createQuery(cq);
            return ( q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
