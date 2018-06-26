/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Util;

import com.okulmvn.Gui.frmAnasayfa;
import com.okulmvn.Models.tblkullanici;
import com.okulmvn.Util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author cesur
 */
public class Giris {
    
 
    public int Giris(String username,String password){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        String QUERY = "from tblkullanici";
       
        org.hibernate.Query sorgu = session.createQuery(QUERY);
        Iterator it = sorgu.iterate();
        ArrayList<tblkullanici> liste = new ArrayList();
        int giris=0;
        while (it.hasNext()) {            
             tblkullanici usr = (tblkullanici) it.next();
             liste.add(usr);
        }
        for(int i = 0;i<liste.size();i++){
            if(liste.get(i).getSifre().equals(password)&&liste.get(i).getKullaniciadi().equals(username)){
                if(liste.get(i).getKullaniciyetki().equals("1"))
                    giris=1;
                else
                    giris=2;
        }
            
        }
        return giris;
    }
}
