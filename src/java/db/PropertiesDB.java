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
    
}
