/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Util;


import com.okulmvn.Models.tbllog;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author cesur
 */
public class vtIsletimcisi<T> implements Icrud<T> {

   Session ss;
   Transaction tt;
   logtakip logt= new logtakip();
   
   public void SessionAc()

   {
       
       ss=NewHibernateUtil.getSessionFactory().openSession();
       tt=ss.beginTransaction();
   }
   public void SessionKapat()
   {
       
       tt.commit();
       ss.close();
   }
   
   @Override
    public boolean kaydet(T t) {
        try
        {
           SessionAc();
           ss.save(t);
           SessionKapat();
            JOptionPane.showMessageDialog(null, "Kayıt başarılı bir şekilde yapılmıştır");
            return true;
            
        }
       catch(Exception ex)
       {
           
           tbllog tbl= new tbllog();
           tbl.setSinif(tbl.getClass().toString());
           tbl.setMethod("Duzenle");
           Date dt= new Date();
            tbl.setTarih(dt);
            tbl.setHataicerigi(ex.toString());
            logt.kayit(tbl);
            JOptionPane.showMessageDialog(null, "Bir hata ile karşılaşıldı lütfen sistem yöneticinize başvurunuz");
            return false;
             
           
       }
    }

    @Override
   public boolean duzenle(T t) {
      try{
        SessionAc();
        ss.update(t);
        SessionKapat();
        return true;
      }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Düzenle");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);          
      return false;
      }
    }

    

     @Override
    public T bul(int id, T t) {
         List<T> listem;
        try{
      SessionAc();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.eq("id", id));
        
        listem = cr.list();
         SessionKapat();
        return (T)listem.get(0);
        }catch(Exception ex){
          tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Bul");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
    }

    @Override
    public List<T> listele(T t) {
   List<T> listem;
        try{
        SessionAc();
        Criteria cr = ss.createCriteria(t.getClass());
         cr.add(Restrictions.eq("silid",1));
        listem = cr.list();
        SessionKapat();
        
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);    
        return null;
        }
        
    }
 
           public List<T> ara (String kolon, String deger, T t) {
         List<T> listem;
        try{
        SessionAc();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.like(kolon, "%"+deger+"%"));
        listem = cr.list();
        SessionKapat();
        return listem;
        }catch(Exception ex){
              tbllog log = new tbllog();
          log.setSinif(t.getClass().toString());
          log.setMethod("Listele");
          Date dt = new Date();
          log.setTarih(dt);
          log.setHataicerigi(ex.toString());
          logt.kayit(log);  
          
        return null;
        
        }
    }

    @Override
    public List<T> ara(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}