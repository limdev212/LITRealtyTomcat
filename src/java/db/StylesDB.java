/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import db.Styles;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author James SSD
 */
public class StylesDB {
    
    public static List<Styles> getAllStyles() {
        EntityManager em = DBUtil.getEmf().createEntityManager();

        TypedQuery<Styles> tq = em.createNamedQuery("Styles.findAll", Styles.class);

        List<Styles> aList;
        try {
            aList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return aList;
    }
    
    public static Styles getStyleByID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Styles> tq = em.createNamedQuery("Styles.findByStyleId", Styles.class);
        
        tq.setParameter("styleId", id);

        Styles s;
        try {
            s = tq.getSingleResult();
        } finally {
            em.close();
        }
        
        return s;

    }
    
    
    
}
