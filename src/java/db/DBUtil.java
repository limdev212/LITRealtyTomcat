/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alan.Ryan
 */
public class DBUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LITRealtyTomcatPU");

    /**
     * @return the emf
     */
    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
