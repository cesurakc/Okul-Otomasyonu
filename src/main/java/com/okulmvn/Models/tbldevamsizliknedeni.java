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
public class tbldevamsizliknedeni {
    
    @Id
    @SequenceGenerator(name="tblsq",sequenceName="tbldevamsizlikneden",allocationSize=1,initialValue=1)
    @GeneratedValue(generator="tblsq")
    private int id;
    private String neden;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNeden() {
        return neden;
    }

    public void setNeden(String neden) {
        this.neden = neden;
    }
    
}
