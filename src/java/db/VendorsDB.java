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
public class VendorsDB {
    
    
    
    public static List<Vendors> getVendorsByID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Vendors> tq = em.createNamedQuery("Vendors.findByVendorId", Vendors.class);
        
        tq.setParameter("agentId", id);

        List<Vendors> pList;
        try {
            pList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return pList;

    }
    
    
    
}
