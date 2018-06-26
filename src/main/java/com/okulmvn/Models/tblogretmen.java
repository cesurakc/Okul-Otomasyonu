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

public class tblogretmen {
    @Id
    @SequenceGenerator(name="tb_sq",sequenceName="sq_tblogretmen_id",allocationSize=1,initialValue=1 )
    
    @GeneratedValue(generator="tb_sq")
    private int id;
    private String adi;
    private String soyadi;
    private String telefon;
    private String adres;
    private String brans;
    private Integer silid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public Integer getSilid() {
        return silid;
    }

    public void setSilid(Integer silid) {
        this.silid = silid;
    }
    
}
