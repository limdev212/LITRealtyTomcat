/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import db.Garagetypes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author James SSD
 */
public class GarageDB {
    
    public static List<Garagetypes> getAllGarageTypes() {
        EntityManager em = DBUtil.getEmf().createEntityManager();

        TypedQuery<Garagetypes> tq = em.createNamedQuery("Garagetypes.findAll", Garagetypes.class);

        List<Garagetypes> gList;
        try {
            gList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return gList;
    }
    
    public static Garagetypes getGarageTypeByID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Garagetypes> tq = em.createNamedQuery("Garagetypes.findByGarageId", Garagetypes.class);
        
        tq.setParameter("garageId", id);

        Garagetypes g;
        try {
            g = tq.getSingleResult();
        } finally {
            em.close();
        }
        
        return g;

    }
    
    
    
}
