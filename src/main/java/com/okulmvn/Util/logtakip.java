/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Util;

import com.okulmvn.Models.tbllog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author cesur
 */
public class logtakip {
    
    Session ss;
    
    public void kayit(tbllog lg){
        try{
              ss = NewHibernateUtil.getSessionFactory().openSession();
              if(ss.isConnected())
              dbKayit(lg);             
              else
              fileKayit(lg);
        }
        catch(Exception ex){
              fileKayit(lg);
        }

    }
    
    
    private boolean dbKayit(tbllog lg){
        Transaction tt = ss.beginTransaction();
        ss.save(lg);
        tt.commit();
        ss.close();
    return true;
    }
    
    private boolean fileKayit(tbllog lg){
        try{
        File fl = new File("src//main/java//com//okulmvn//LogFiles//log.txt");
            BufferedWriter bf = new BufferedWriter(new FileWriter(fl,true));
            bf.append("Tarih..: "+lg.getTarih()+":"+
                    "Sınıf....: "+lg.getSinif()+":"+
                    "Method...: "+lg.getMethod()+":"+
                    "Hata.....: "+lg.getHataicerigi()
                    );
            bf.newLine();
            bf.close();
            
            return true;
        }
        catch(Exception ex){
            System.err.println("Hata...:"+ex.toString());
        return false;
        }
        
    
    }
}
