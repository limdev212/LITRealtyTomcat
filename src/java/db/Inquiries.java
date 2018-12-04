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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author James
 */
@Entity
@Table(name = "inquiries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inquiries.findAll", query = "SELECT i FROM Inquiries i")
    , @NamedQuery(name = "Inquiries.findByInquiryId", query = "SELECT i FROM Inquiries i WHERE i.inquiryId = :inquiryId")
    , @NamedQuery(name = "Inquiries.findByAgentId", query = "SELECT i FROM Inquiries i WHERE i.agentId = :agentId")
    , @NamedQuery(name = "Inquiries.findByPropertyId", query = "SELECT i FROM Inquiries i WHERE i.propertyId = :propertyId")
    , @NamedQuery(name = "Inquiries.findByName", query = "SELECT i FROM Inquiries i WHERE i.name = :name")
    , @NamedQuery(name = "Inquiries.findByEmail", query = "SELECT i FROM Inquiries i WHERE i.email = :email")})
public class Inquiries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "inquiryId")
    private Integer inquiryId;
    @Basic(optional = false)
    @Column(name = "agentId")
    private int agentId;
    @Basic(optional = false)
    @Column(name = "propertyId")
    private int propertyId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "message")
    private String message;

    public Inquiries() {
    }

    public Inquiries(Integer inquiryId) {
        this.inquiryId = inquiryId;
    }

    public Inquiries(Integer inquiryId, int agentId, int propertyId, String name, String email, String message) {
        this.inquiryId = inquiryId;
        this.agentId = agentId;
        this.propertyId = propertyId;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public Integer getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(Integer inquiryId) {
        this.inquiryId = inquiryId;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inquiryId != null ? inquiryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inquiries)) {
            return false;
        }
        Inquiries other = (Inquiries) object;
        if ((this.inquiryId == null && other.inquiryId != null) || (this.inquiryId != null && !this.inquiryId.equals(other.inquiryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Inquiries[ inquiryId=" + inquiryId + " ]";
    }
    
}
