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
public class tblsinif {
    
    @Id
    @SequenceGenerator(name="tblsql",sequenceName="tblsiniflar",allocationSize=1,initialValue=1)
    @GeneratedValue(generator="tblsql")
        private int id;
    private String sinifadi;
    private String bulundugukat;
    private int derssaati;
    private int silid;


    public String getSinifadi() {
        return sinifadi;
    }

    public void setSinifadi(String sinifadi) {
        this.sinifadi = sinifadi;
    }

    public String getBulundugukat() {
        return bulundugukat;
    }

    public void setBulundugukat(String bulundugukat) {
        this.bulundugukat = bulundugukat;
    }

    public int getDerssaati() {
        return derssaati;
    }

    public void setDerssaati(int derssaati) {
        this.derssaati = derssaati;
    }

    public int getId() {
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
