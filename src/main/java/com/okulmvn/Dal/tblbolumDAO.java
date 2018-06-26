/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Dal;

import com.okulmvn.Models.tblbolum;
import com.okulmvn.Util.Icrud;
import com.okulmvn.Util.vtIsletimcisi;



/**
 *
 * @author cesur
 */
public class tblbolumDAO extends vtIsletimcisi<tblbolum>{
    public void sil(int id)
    {
        
         tblbolumDAO da= new tblbolumDAO();
         tblbolum tbl= da.bul(id, new tblbolum());
         tbl.setSilid(0);
         da.duzenle(tbl);
        
    }
 
    
}
