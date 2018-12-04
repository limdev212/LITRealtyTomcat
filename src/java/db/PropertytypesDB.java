/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import db.Propertytypes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author James SSD
 */
public class PropertytypesDB {
    
    public static List<Propertytypes> getAllPropertytypes() {
        EntityManager em = DBUtil.getEmf().createEntityManager();

        TypedQuery<Propertytypes> tq = em.createNamedQuery("Propertytypes.findAll", Propertytypes.class);

        List<Propertytypes> aList;
        try {
            aList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return aList;
    }
    
    public static Propertytypes getPropertytypesByID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Propertytypes> tq = em.createNamedQuery("Propertytypes.findByTypeId", Propertytypes.class);
        
        tq.setParameter("typeId", id);

        Propertytypes a;
        try {
            a = tq.getSingleResult();
        } finally {
            em.close();
        }
        
        return a;

    }
    
    
    
}
