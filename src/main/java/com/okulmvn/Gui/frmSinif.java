/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Gui;

import com.okulmvn.Dal.tblsinifDAO;
import static com.okulmvn.Gui.frmOgrenci.secilenid;

import com.okulmvn.Models.tblsinif;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesur
 */

public class frmSinif extends javax.swing.JFrame {

    /**
     * Creates new form frmSinif
     */
    public static int secilenid;
    public static int tblsecilen;
    List<tblsinif> sinifliste=new ArrayList<tblsinif>();
    tblsinifDAO db=new tblsinifDAO();
    public frmSinif() {
        initComponents();
        sinifliste=db.listele(new tblsinif());
        tablodoldur();
         tblsinif.setDefaultEditor(Object.class, null);
    
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtsinifadi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtkat = new javax.swing.JTextField();
        btnyenikayit = new javax.swing.JButton();
        btnguncelle = new javax.swing.JButton();
        btniptal = new javax.swing.JButton();
        btnkaydet = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsinif = new javax.swing.JTable();

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
        menusil.setToolTipText("");
        menusil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusilActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menusil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(248, 148, 6));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SINIF İŞLEMLERİ");
        jLabel1.setToolTipText("");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("-");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 24, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 24, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Sinif Adi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 89, -1, -1));

        txtsinifadi.setEditable(false);
        txtsinifadi.setBackground(new java.awt.Color(108, 122, 137));
        jPanel1.add(txtsinifadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 89, 135, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Bulunduğu Kat");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 89, -1, -1));

        txtkat.setEditable(false);
        txtkat.setBackground(new java.awt.Color(108, 122, 137));
        jPanel1.add(txtkat, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 89, 135, -1));

        btnyenikayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\yeni kayit.png")); // NOI18N
        btnyenikayit.setText("Yeni Kayıt");
        btnyenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyenikayitActionPerformed(evt);
            }
        });
        jPanel1.add(btnyenikayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 162, 120, 50));

        btnguncelle.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\güncelle.png")); // NOI18N
        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });
        jPanel1.add(btnguncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 162, 120, 50));

        btniptal.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\iptal.png")); // NOI18N
        btniptal.setText("İptal");
        btniptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniptalActionPerformed(evt);
            }
        });
        jPanel1.add(btniptal, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 162, 120, 50));

        btnkaydet.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\kayit.png")); // NOI18N
        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });
        jPanel1.add(btnkaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 162, 120, 50));

        tblsinif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Sinif Adi", "Bulunduğu Kat"
            }
        ));
        tblsinif.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tblsinif);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 510, 91));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void txtac()
{
    txtsinifadi.setEditable(true);
    txtkat.setEditable(true);
    
     txtsinifadi.setBackground(new java.awt.Color(255, 255, 255));
      txtkat.setBackground(new java.awt.Color(255, 255, 255));
     
    
    
}
 public void satirsil (int id)
  {
      
      try {
       
   sinifliste.remove(id);
          
   
      } catch (Exception e) {
          
          JOptionPane.showMessageDialog(null, "HATA!! Boş kayıt Silme İşlemi Yapamazsınız.");
      }
      
      
  }
    private void btnyenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyenikayitActionPerformed
       btnyenikayit.setEnabled(false);
       btnkaydet.setEnabled(true);
       btniptal.setEnabled(true);
      txtsinifadi.setEnabled(true);
      txtkat.setEnabled(true);
       txtac();
    }//GEN-LAST:event_btnyenikayitActionPerformed
public void temizle()
{
    txtsinifadi.setText("");
    txtkat.setText("");
    
}
public void satirekle()
{
    
   DefaultTableModel dt= (DefaultTableModel)this.tblsinif.getModel();
   dt.setRowCount(dt.getRowCount()+1);
   this.tblsinif.repaint();
}
public void tablodoldur()
{
    int i=0;
    for (tblsinif sft : sinifliste) {
        satirekle();
        tblsinif.setValueAt(sft.getId(), 0+i, 0);
             tblsinif.setValueAt(sft.getSinifadi(), 0+i, 1);
              tblsinif.setValueAt(sft.getBulundugukat(), 0+i, 2);
             
             
             i++;
        
    }
    
}
    private void btniptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniptalActionPerformed
         temizle();
        btnyenikayit.setEnabled(true);
       btnkaydet.setEnabled(false);
        btnguncelle.setEnabled(false);
        btniptal.setEnabled(false);
    }//GEN-LAST:event_btniptalActionPerformed

    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
          if(txtsinifadi.getText().equals("")|| txtkat.getText().equals(""))
          {
              
              JOptionPane.showMessageDialog(null,"Lütfen Boş alanları doldurunuz");
              
              
              
          }
          else
          {
              tblsinif tbl= new tblsinif();
                 tbl.setSinifadi(txtsinifadi.getText());
                 tbl.setBulundugukat(txtkat.getText());
                sinifliste.add(tbl);
                 db.kaydet(tbl);
                
                 tablodoldur();
                 temizle();
                  btnyenikayit.setEnabled(true);
                  btnkaydet.setEnabled(false);
                  btniptal.setEnabled(false);
    }//GEN-LAST:event_btnkaydetActionPerformed
    
    }
    private void menuduzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuduzenleActionPerformed
       int secilen=tblsinif.getSelectedRow();
       tblsecilen=secilen;
       secilenid=Integer.parseInt(tblsinif.getValueAt(secilen, 0).toString());
       txtsinifadi.setText(tblsinif.getValueAt(secilen, 1).toString());
       txtkat.setText(tblsinif.getValueAt(secilen, 2).toString());
       
    }//GEN-LAST:event_menuduzenleActionPerformed

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
       tblsinif tbl=new tblsinif();
       tbl.setSinifadi(txtsinifadi.getText());
       tbl.setBulundugukat(txtkat.getText());
       tbl.setId(secilenid);
       sinifliste.set(tblsecilen, tbl);
       db.duzenle(tbl);
       tablodoldur();
       
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void menusilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusilActionPerformed
         int reply = JOptionPane.showConfirmDialog(null, "İlgili Kaydı silmek istiyor musunuz?",
            "UYARI", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
         
            int secilen = tblsinif.getSelectedRow();
            int id =Integer.parseInt(tblsinif.getValueAt(secilen, 0).toString());
            satirsil(secilen);
            db.sil(id);
          
           
            

            tablodoldur();
 
        }
        else {
            JOptionPane.showMessageDialog(null, "İşlem İptal Edilmiştir.");

        }
    }//GEN-LAST:event_menusilActionPerformed

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
            java.util.logging.Logger.getLogger(frmSinif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSinif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSinif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSinif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSinif().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuduzenle;
    private javax.swing.JMenuItem menusil;
    private javax.swing.JTable tblsinif;
    private javax.swing.JTextField txtkat;
    private javax.swing.JTextField txtsinifadi;
    // End of variables declaration//GEN-END:variables
}