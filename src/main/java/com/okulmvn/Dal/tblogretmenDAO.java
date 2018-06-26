/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Dal;

import com.okulmvn.Models.tblogretmen;
import com.okulmvn.Util.vtIsletimcisi;
import javax.swing.JOptionPane;

/**
 *
 * @author cesur
 */
public class tblogretmenDAO extends vtIsletimcisi<tblogretmen> {

    public void ogrtsil(int id)
    {
       
         tblogretmenDAO da= new tblogretmenDAO();
     
    tblogretmen tbl= da.bul(id, new tblogretmen());
    tbl.setSilid(0);
    da.duzenle(tbl);
       
    }
   
   
   
            
            
    
    
    
}
