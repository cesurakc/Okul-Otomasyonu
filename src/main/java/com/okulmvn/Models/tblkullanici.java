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
public class tblkullanici {
    @Id
   @SequenceGenerator(name="tbsq1",sequenceName="sq_tblkullanici_id",allocationSize=1,initialValue=1 )
   @GeneratedValue(generator="tbsq1")
    private int id;
    private String kullaniciadi;
    private String sifre;
    private String kullaniciyetki;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getKullaniciyetki() {
        return kullaniciyetki;
    }

    public void setKullaniciyetki(String kullaniciyetki) {
        this.kullaniciyetki = kullaniciyetki;
    }
}
