/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author cesur
 */
@Entity
@Table
public class tblbolum {
    
   @Id
   @SequenceGenerator(name="tbsq",sequenceName="sq_tblbolum_id",allocationSize=1,initialValue=1 )
   @GeneratedValue(generator="tbsq")
   private int id;
   private String alan;
private int silid;

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSilid() {
        return silid;
    }

    public void setSilid(int silid) {
        this.silid = silid;
    }
}
