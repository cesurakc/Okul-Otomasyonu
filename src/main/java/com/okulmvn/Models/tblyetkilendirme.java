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
public class tblyetkilendirme {
    
    @Id
    @SequenceGenerator(name="tblsq",sequenceName="tblyetkilendirme",allocationSize=1,initialValue=1)
    @GeneratedValue(generator="tblsq")
    private int id;
    private String yetkiadi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYetkiadi() {
        return yetkiadi;
    }

    public void setYetkiadi(String yetkiadi) {
        this.yetkiadi = yetkiadi;
    }
    
    
}
