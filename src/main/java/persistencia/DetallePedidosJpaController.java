/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Modelos.DetallePedidos;
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
public class DetallePedidosJpaController implements Serializable {

    public DetallePedidosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public DetallePedidosJpaController() {
        emf = Persistence.createEntityManagerFactory("Rojas_PU");
    }
    
    

    public void create(DetallePedidos detallePedidos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detallePedidos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DetallePedidos detallePedidos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detallePedidos = em.merge(detallePedidos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = detallePedidos.getIdDetallePedidos();
                if (findDetallePedidos(id) == null) {
                    throw new NonexistentEntityException("The detallePedidos with id " + id + " no longer exists.");
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
            DetallePedidos detallePedidos;
            try {
                detallePedidos = em.getReference(DetallePedidos.class, id);
                detallePedidos.getIdDetallePedidos();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detallePedidos with id " + id + " no longer exists.", enfe);
            }
            em.remove(detallePedidos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DetallePedidos> findDetallePedidosEntities() {
        return findDetallePedidosEntities(true, -1, -1);
    }

    public List<DetallePedidos> findDetallePedidosEntities(int maxResults, int firstResult) {
        return findDetallePedidosEntities(false, maxResults, firstResult);
    }

    private List<DetallePedidos> findDetallePedidosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<DetallePedidos> cq = em.getCriteriaBuilder().createQuery(DetallePedidos.class);
            cq.select(cq.from(DetallePedidos.class));
            TypedQuery<DetallePedidos> q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public DetallePedidos findDetallePedidos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DetallePedidos.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetallePedidosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Long> cq = em.getCriteriaBuilder().createQuery(Long.class);
            Root<DetallePedidos> rt = cq.from(DetallePedidos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            TypedQuery<Long> q = em.createQuery(cq);
            return (q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
