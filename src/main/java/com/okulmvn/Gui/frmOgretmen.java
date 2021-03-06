/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Gui;

import com.okulmvn.Dal.tblogretmenDAO;
import com.okulmvn.Models.tblbolum;
import com.okulmvn.Models.tblogretmen;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesur
 */
   
public class frmOgretmen extends javax.swing.JFrame {

    /**
     * Creates new form frmOgretmen
     */
    public static int secilenid;
    public static int tblsecilen;
     List<tblogretmen> ogretmenliste=new ArrayList<tblogretmen>();
     tblogretmenDAO db= new tblogretmenDAO();
     
    public frmOgretmen() {
        initComponents();
        ogretmenliste=db.listele(new tblogretmen());
        tablodoldur();
        tblOgretmen.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuduzenle = new javax.swing.JMenuItem();
        menusil = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtadi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsoyadi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadres = new javax.swing.JTextField();
        btnyenikayit = new javax.swing.JButton();
        btnkaydet = new javax.swing.JButton();
        btnguncelle = new javax.swing.JButton();
        btniptal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOgretmen = new javax.swing.JTable();

        menuduzenle.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\güncelle.png")); // NOI18N
        menuduzenle.setText("menuduzenle");
        menuduzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuduzenleActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuduzenle);

        menusil.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\iptal.png")); // NOI18N
        menusil.setText("menusil");
        menusil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menusil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Öğretmen ");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 100));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Adi");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 66, -1, -1));

        txtadi.setEditable(false);
        txtadi.setBackground(new java.awt.Color(108, 122, 137));
        txtadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadiActionPerformed(evt);
            }
        });
        jPanel2.add(txtadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 66, 144, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Soyadı");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 66, -1, -1));

        txtsoyadi.setEditable(false);
        txtsoyadi.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtsoyadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 66, 144, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Telefon");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 117, -1, -1));

        txttelefon.setEditable(false);
        txttelefon.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txttelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 117, 144, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Adres");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 120, -1, -1));

        txtadres.setEditable(false);
        txtadres.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtadres, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 117, 144, -1));

        btnyenikayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\yeni kayit.png")); // NOI18N
        btnyenikayit.setText("Yeni Kayıt");
        btnyenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyenikayitActionPerformed(evt);
            }
        });
        jPanel2.add(btnyenikayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 50));

        btnkaydet.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\kayit.png")); // NOI18N
        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });
        jPanel2.add(btnkaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 120, 50));

        btnguncelle.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\güncelle.png")); // NOI18N
        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });
        jPanel2.add(btnguncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, 50));

        btniptal.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\iptal.png")); // NOI18N
        btniptal.setText("İptal");
        btniptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniptalActionPerformed(evt);
            }
        });
        jPanel2.add(btniptal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 120, 50));

        tblOgretmen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Adı", "Soyadı", "Telefon", "Adres"
            }
        ));
        tblOgretmen.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tblOgretmen);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 570, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 760, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnyenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyenikayitActionPerformed
           btnyenikayit.setEnabled(false);
           btnkaydet.setEnabled(true);
           btniptal.setEnabled(true);
           txtac();
      
    }//GEN-LAST:event_btnyenikayitActionPerformed

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
       
        if(txtadi.getText().equals("")|| txtsoyadi.getText().equals("") || txttelefon.getText().equals("")||txtadres.getText().equals(""))
        {
            
            JOptionPane.showMessageDialog(null, "Lütfen Boş alanları doldurunuz");
            
        }
        else
        {
       tblogretmen tbl= new tblogretmen();
       tbl.setAdi(txtadi.getText());
       tbl.setSoyadi(txtsoyadi.getText());
       tbl.setTelefon(txttelefon.getText());
       tbl.setAdres(txtadres.getText());
       tbl.setSilid(1);
       ogretmenliste.add(tbl);
       db.kaydet(tbl);
       tablodoldur();
       temizle();
        btnyenikayit.setEnabled(true);
        btnkaydet.setEnabled(false);
        btniptal.setEnabled(false);
                   
            
        }
        
        
 
       
       
       
       
    }//GEN-LAST:event_btnkaydetActionPerformed
public void temizle()
{
    txtadi.setText("");
    txtsoyadi.setText("");
    txttelefon.setText("");
    txtadres.setText("");
    
    
}
public void tablotemizle()
{
     DefaultTableModel df=(DefaultTableModel)this.tblOgretmen.getModel();
      df.getDataVector().removeAllElements();
    
    
}
    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
       tblogretmen tbl=new tblogretmen();
         tbl.setId(secilenid);
       tbl.setAdi(txtadi.getText());
       tbl.setSoyadi(txtsoyadi.getText());
       tbl.setTelefon(txttelefon.getText());
       tbl.setAdres(txtadres.getText());
       ogretmenliste.set(tblsecilen, tbl);
       db.duzenle(tbl);
       tablodoldur();
       temizle();
       
       
       
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void btniptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniptalActionPerformed
        temizle();
        btnyenikayit.setEnabled(true);
       btnkaydet.setEnabled(false);
        btnguncelle.setEnabled(false);
        btniptal.setEnabled(false);
    }//GEN-LAST:event_btniptalActionPerformed

    private void txtadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadiActionPerformed
       
    }//GEN-LAST:event_txtadiActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void menuduzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuduzenleActionPerformed
      int secilen=tblOgretmen.getSelectedRow();
      txtac();
     tblsecilen=secilen;
     secilenid=Integer.parseInt(tblOgretmen.getValueAt(secilen, 0).toString());
     txtadi.setText(tblOgretmen.getValueAt(secilen, 1).toString());
    txtsoyadi.setText(tblOgretmen.getValueAt(secilen, 2).toString());
    txttelefon.setText(tblOgretmen.getValueAt(secilen, 3).toString());
    txtadres.setText(tblOgretmen.getValueAt(secilen, 4).toString());
      
      
    }//GEN-LAST:event_menuduzenleActionPerformed
 public void satirsil(int id)
 {
     try {
         ogretmenliste.remove(id);
         JOptionPane.showMessageDialog(null, "Kayıt başarılı bir şekilde silinmiştir");
         
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "HATA!! Boş kayıt Silme İşlemi Yapamazsınız.");
     }
     
     
 }
    private void menusilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusilActionPerformed
 int reply = JOptionPane.showConfirmDialog(null, "İlgili Kaydı silmek istiyor musunuz?",
            "UYARI", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            int secilen = tblOgretmen.getSelectedRow();
            int id=Integer.parseInt(tblOgretmen.getValueAt(secilen, 0).toString());
            satirsil(secilen);
            db.ogrtsil(id);
            

           
            tablodoldur();

        }
        else {
            JOptionPane.showMessageDialog(null, "İşlem İptal Edilmiştir.");

        }      
    }//GEN-LAST:event_menusilActionPerformed
    public void satirekle()
    {
        
        DefaultTableModel dt= (DefaultTableModel)this.tblOgretmen.getModel();
        dt.setRowCount(dt.getRowCount()+1);
        this.tblOgretmen.repaint();
        
    }
    public void txtac()
    {
        
        txtadi.setEditable(true);
        txtadi.setBackground(new java.awt.Color(255, 255, 255));
        txtsoyadi.setEditable(true);
        txtsoyadi.setBackground(new java.awt.Color(255, 255, 255));
        txttelefon.setEditable(true);
        txttelefon.setBackground(new java.awt.Color(255, 255, 255));
        txtadres.setEditable(true);
        txtadres.setBackground(new java.awt.Color(255, 255, 255));
      
        
    }
    public void satirsil()
    {
        
        
    }
    public void tablodoldur()
    {
        int i=0;
        for (tblogretmen ogrtm : ogretmenliste) {
            satirekle();
            tblOgretmen.setValueAt(ogrtm.getId(), 0+i, 0);
             tblOgretmen.setValueAt(ogrtm.getAdi(), 0+i, 1);
             tblOgretmen.setValueAt(ogrtm.getSoyadi(), 0+i, 2);
             tblOgretmen.setValueAt(ogrtm.getTelefon(), 0+i, 3);
             tblOgretmen.setValueAt(ogrtm.getAdres(), 0+i, 4);
             
             i++;
            
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmOgretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOgretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOgretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOgretmen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOgretmen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguncelle;
    private javax.swing.JButton btniptal;
    private javax.swing.JButton btnkaydet;
    private javax.swing.JButton btnyenikayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuduzenle;
    private javax.swing.JMenuItem menusil;
    private javax.swing.JTable tblOgretmen;
    private javax.swing.JTextField txtadi;
    private javax.swing.JTextField txtadres;
    private javax.swing.JTextField txtsoyadi;
    private javax.swing.JTextField txttelefon;
    // End of variables declaration//GEN-END:variables
}
