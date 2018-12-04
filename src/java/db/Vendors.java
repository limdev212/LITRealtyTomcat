/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author James
 */
@Entity
@Table(name = "vendors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendors.findAll", query = "SELECT v FROM Vendors v")
    , @NamedQuery(name = "Vendors.findByVendorId", query = "SELECT v FROM Vendors v WHERE v.vendorId = :vendorId")
    , @NamedQuery(name = "Vendors.findByName", query = "SELECT v FROM Vendors v WHERE v.name = :name")
    , @NamedQuery(name = "Vendors.findByNumber", query = "SELECT v FROM Vendors v WHERE v.number = :number")
    , @NamedQuery(name = "Vendors.findByAgentid", query = "SELECT v FROM Vendors v WHERE v.agentid = :agentid")})
public class Vendors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vendorId")
    private Integer vendorId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "number")
    private String number;
    @Basic(optional = false)
    @Column(name = "agentid")
    private int agentid;

    public Vendors() {
    }

    public Vendors(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Vendors(Integer vendorId, String name, String number, int agentid) {
        this.vendorId = vendorId;
        this.name = name;
        this.number = number;
        this.agentid = agentid;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAgentid() {
        return agentid;
    }

    public void setAgentid(int agentid) {
        this.agentid = agentid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorId != null ? vendorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendors)) {
            return false;
        }
        Vendors other = (Vendors) object;
        if ((this.vendorId == null && other.vendorId != null) || (this.vendorId != null && !this.vendorId.equals(other.vendorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Vendors[ vendorId=" + vendorId + " ]";
    }
    
}
