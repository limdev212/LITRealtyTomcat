/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import db.Inquiries;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author James SSD
 */
public class InquiriesDB {
    
    
    
    public static List<Inquiries> getInquiriesByAgentID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Inquiries> tq = em.createNamedQuery("Inquiries.findByAgentId", Inquiries.class);
        
        tq.setParameter("agentId", id);

        List<Inquiries> pList;
        try {
            pList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return pList;

    }
    
    
    
}
