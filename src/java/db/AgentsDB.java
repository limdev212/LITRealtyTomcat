/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import db.Agents;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author James SSD
 */
public class AgentsDB {
    
    public static List<Agents> getAllAgents() {
        EntityManager em = DBUtil.getEmf().createEntityManager();

        TypedQuery<Agents> tq = em.createNamedQuery("Agents.findAll", Agents.class);

        List<Agents> aList;
        try {
            aList = tq.getResultList();
        } finally {
            em.close();
        }
        
        return aList;
    }
    
    public static Agents getAgentByID(Integer id) {
        
        EntityManager em = DBUtil.getEmf().createEntityManager();
        
        TypedQuery<Agents> tq = em.createNamedQuery("Agents.findByAgentId", Agents.class);
        
        tq.setParameter("agentId", id);

        Agents a;
        try {
            a = tq.getSingleResult();
        } finally {
            em.close();
        }
        
        return a;

    }
    
    
    
}
