/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Dal;

import com.okulmvn.Models.tblogrenci;

import com.okulmvn.Util.vtIsletimcisi;

/**
 *
 * @author cesur
 */
public class tbogrenciDAO extends vtIsletimcisi<tblogrenci> {
    
    
       public void silogrenci(int id)
   {
       
    tbogrenciDAO da= new tbogrenciDAO();
       tblogrenci tl= da.bul(id, new tblogrenci());
       tl.setSilid(0);
       da.duzenle(tl);
       
   }
}
