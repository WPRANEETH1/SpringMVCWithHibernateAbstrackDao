package com.itfaculty.progress.model;
// Generated Feb 3, 2017 11:29:05 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Receptionists generated by hbm2java
 */
@Entity
@Table(name="receptionists"
    ,catalog="nawalokahospital"
)
public class Receptionists  implements java.io.Serializable {


     private Integer receptionistId;
     private String receptionistFirstname;
     private String receptionistLastname;
     private String receptionistUsername;
     private String receptionistPassword;

    public Receptionists() {
    }

    public Receptionists(String receptionistFirstname, String receptionistLastname, String receptionistUsername, String receptionistPassword) {
       this.receptionistFirstname = receptionistFirstname;
       this.receptionistLastname = receptionistLastname;
       this.receptionistUsername = receptionistUsername;
       this.receptionistPassword = receptionistPassword;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="receptionist_id", unique=true, nullable=false)
    public Integer getReceptionistId() {
        return this.receptionistId;
    }
    
    public void setReceptionistId(Integer receptionistId) {
        this.receptionistId = receptionistId;
    }

    
    @Column(name="receptionist_firstname", nullable=false, length=100)
    public String getReceptionistFirstname() {
        return this.receptionistFirstname;
    }
    
    public void setReceptionistFirstname(String receptionistFirstname) {
        this.receptionistFirstname = receptionistFirstname;
    }

    
    @Column(name="receptionist_lastname", nullable=false, length=100)
    public String getReceptionistLastname() {
        return this.receptionistLastname;
    }
    
    public void setReceptionistLastname(String receptionistLastname) {
        this.receptionistLastname = receptionistLastname;
    }

    
    @Column(name="receptionist_username", nullable=false, length=100)
    public String getReceptionistUsername() {
        return this.receptionistUsername;
    }
    
    public void setReceptionistUsername(String receptionistUsername) {
        this.receptionistUsername = receptionistUsername;
    }

    
    @Column(name="receptionist_password", nullable=false)
    public String getReceptionistPassword() {
        return this.receptionistPassword;
    }
    
    public void setReceptionistPassword(String receptionistPassword) {
        this.receptionistPassword = receptionistPassword;
    }




}


