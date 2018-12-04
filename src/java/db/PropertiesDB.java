/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import db.Properties;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author James SSD
 */
public class PropertiesDB {
    
    public static List<Properties> getAllProperties() {
        EntityManager em = DBUtil.getEmf().createEntityManager();

        TypedQuery<Properties> tq = em.createNamedQuery("Properties.findAll", Properties.class);

        List<Properties> pList;
        try {
            pList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return pList;
    }
    
    public static List<Properties> getPropertiesByAgentID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Properties> tq = em.createNamedQuery("Properties.findByAgentId", Properties.class);
        
        tq.setParameter("agentId", id);

        List<Properties> pList;
        try {
            pList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return pList;

    }
    
    public static List<Properties> getRecentProperties() {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        String q = "SELECT p from Properties p ORDER BY p.dateAdded DESC";
        TypedQuery<Properties> tq = em.createQuery(q, Properties.class);
        List<Properties> list;

        try {
            list = tq.setMaxResults(6).getResultList();
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } finally {
            em.close();
        }
        return list;
    }
    
    public static Properties getPropertyByID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Properties> tq = em.createNamedQuery("Properties.findById", Properties.class);
        
        tq.setParameter("id", id);

        Properties p;
        try {
            p = tq.getSingleResult();
        } finally {
            em.close();
        }
        
        return p;

    }
    
     public static Properties getPropertyByListingNumber(int listingNum) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Properties> tq = em.createNamedQuery("Properties.findByListingNum", Properties.class);
        
        tq.setParameter("listingNum", listingNum);

        Properties p;
        try {
            p = tq.getSingleResult();
        } finally {
            em.close();
        }
        
        return p;

    }
     
     public static void insertProperty(Properties p) {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        EntityTransaction trans = em.getTransaction();

        try {
            trans.begin();
            em.persist(p);
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
    }
     
     public static void updateProperty(Properties p) {
        EntityManager em = DBUtil.getEmf().createEntityManager();
        EntityTransaction trans = em.getTransaction();

        try {
            trans.begin();
            em.merge(p);
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
    }
    
}
