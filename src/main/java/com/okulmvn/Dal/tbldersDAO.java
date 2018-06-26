/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Dal;

import com.okulmvn.Models.tblders;
import com.okulmvn.Util.vtIsletimcisi;

/**
 *
 * @author cesur
 */
public class tbldersDAO extends vtIsletimcisi<tblders> {
    
    public void derssil(int id)
    {
        
        tbldersDAO da= new tbldersDAO();
        tblders tbl= da.bul(id,new tblders());
        tbl.setSilid(0);
        da.duzenle(tbl);
    }
    
}
