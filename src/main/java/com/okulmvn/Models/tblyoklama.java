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

public class tblyoklama {
    @Id
    @SequenceGenerator(name="tblsq",sequenceName="tblyoklama",allocationSize=1,initialValue=1)
    @GeneratedValue(generator="tblsq")
    private int id;
    private int devamsizliknedenid;
    private String ogrenciid;
    private String devamsizliktarihi;
    private String devamsizliksaatleri;
    private String aciklama;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDevamsizliknedenid() {
        return devamsizliknedenid;
    }

    public void setDevamsizliknedenid(int devamsizliknedenid) {
        this.devamsizliknedenid = devamsizliknedenid;
    }

    public String getOgrenciid() {
        return ogrenciid;
    }

    public void setOgrenciid(String ogrenciid) {
        this.ogrenciid = ogrenciid;
    }

    public String getDevamsizliktarihi() {
        return devamsizliktarihi;
    }

    public void setDevamsizliktarihi(String devamsizliktarihi) {
        this.devamsizliktarihi = devamsizliktarihi;
    }

    public String getDevamsizliksaatleri() {
        return devamsizliksaatleri;
    }

    public void setDevamsizliksaatleri(String devamsizliksaatleri) {
        this.devamsizliksaatleri = devamsizliksaatleri;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    
    
}
