/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Dal;

import com.okulmvn.Models.tblsinif;
import com.okulmvn.Util.vtIsletimcisi;

/**
 *
 * @author cesur
 */
public class tblsinifDAO extends vtIsletimcisi<tblsinif>{
    
    public void sil(int id)
   {
       
       tblsinifDAO da= new tblsinifDAO();
       tblsinif tl= da.bul(id, new tblsinif());
       tl.setSilid(0);
       da.duzenle(tl);
       
   }
    public String sinifadiver(int id){
        String odaadi = bul(id, new tblsinif()).getSinifadi();
        return odaadi;
    }
   
}
