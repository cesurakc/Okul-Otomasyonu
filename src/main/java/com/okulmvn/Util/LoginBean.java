/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Util;

import com.okulmvn.Dal.tblkullaniciDAO;
import com.okulmvn.Gui.frmAnasayfa;
import com.okulmvn.Gui.frmOgrenci;
import com.okulmvn.Models.tblkullanici;
import javax.swing.JOptionPane;

/**
 *
 * @author cesur
 */
public class LoginBean {
    
 
    
    tblkullaniciDAO db= new tblkullaniciDAO();
    
    
    public void login(String kullaniciadi,String sifre)
            
    {
        
        for (tblkullanici item : db.listele(new tblkullanici())) {
            
            if(kullaniciadi.equals(item.getKullaniciadi()) && sifre.equals(item.getSifre()))
            {
                  new frmAnasayfa().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "KUllanıcı adı yada şifreniz yanlış");
            }
            
            
            }
       
            
        
          
    
}

  
    
}
        


    
    

