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
@Table
@Entity
public class tblogrenci {
    
    
   @Id
    @SequenceGenerator(name = "tblsq12",sequenceName = "sq_tblogrenci_id",
            allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "tblsq12")
   private int id;
   private String ad;
   private String soyadi;
   private String numara;
   private String telefon;
   private String veliadi;
   private String velisoyadi;
   private String velitelefon;
   private String devamsizlik;
   private String dogumtarihi;
   private int bolumid;
   private String adres;
   private String kangrubu;
   private String cinsiyet;
   private String email;
  
   private String tc;
   private String veliadresi;

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
   private String resimyolu;
   private int sinifid;
   private int silid;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getVeliadi() {
        return veliadi;
    }

    public void setVeliadi(String veliadi) {
        this.veliadi = veliadi;
    }

    public String getVelisoyadi() {
        return velisoyadi;
    }

    public void setVelisoyadi(String velisoyadi) {
        this.velisoyadi = velisoyadi;
    }

    public String getVelitelefon() {
        return velitelefon;
    }

    public void setVelitelefon(String velitelefon) {
        this.velitelefon = velitelefon;
    }

    public String getDevamsizlik() {
        return devamsizlik;
    }

    public void setDevamsizlik(String devamsizlik) {
        this.devamsizlik = devamsizlik;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getVeliadresi() {
        return veliadresi;
    }

    public void setVeliadresi(String veliadresi) {
        this.veliadresi = veliadresi;
    }

    public int getSilid() {
        return silid;
    }

    public void setSilid(int silid) {
        this.silid = silid;
    }

    public String getKangrubu() {
        return kangrubu;
    }

    public void setKangrubu(String kangrubu) {
        this.kangrubu = kangrubu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getResimyolu() {
        return resimyolu;
    }

    public void setResimyolu(String resimyolu) {
        this.resimyolu = resimyolu;
    }

 

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getSinifid() {
        return sinifid;
    }

    public void setSinifid(int sinifid) {
        this.sinifid = sinifid;
    }

    public int getBolumid() {
        return bolumid;
    }

    public void setBolumid(int bolumid) {
        this.bolumid = bolumid;
    }

  
 
   
   
   
   
   
   
   
    
    
}
