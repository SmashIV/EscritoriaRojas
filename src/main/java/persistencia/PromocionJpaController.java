/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Modelos.Promocion;
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
public class PromocionJpaController implements Serializable {

    public PromocionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PromocionJpaController() {
        emf = Persistence.createEntityManagerFactory("Rojas_PU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Promocion promocion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(promocion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Promocion promocion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            promocion = em.merge(promocion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = promocion.getIdPromocion();
                if (findPromocion(id) == null) {
                    throw new NonexistentEntityException("The promocion with id " + id + " no longer exists.");
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
            Promocion promocion;
            try {
                promocion = em.getReference(Promocion.class, id);
                promocion.getIdPromocion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The promocion with id " + id + " no longer exists.", enfe);
            }
            em.remove(promocion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Promocion> findPromocionEntities() {
        return findPromocionEntities(true, -1, -1);
    }

    public List<Promocion> findPromocionEntities(int maxResults, int firstResult) {
        return findPromocionEntities(false, maxResults, firstResult);
    }

    private List<Promocion> findPromocionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Promocion> cq = em.getCriteriaBuilder().createQuery(Promocion.class);
            cq.select(cq.from(Promocion.class));
            TypedQuery<Promocion> q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Promocion findPromocion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Promocion.class, id);
        } finally {
            em.close();
        }
    }

    public int getPromocionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<Promocion> rt = cq.from(Promocion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            TypedQuery<Long> q = em.createQuery(cq);
            return ( q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
