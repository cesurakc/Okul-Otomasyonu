/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Gui;

import com.okulmvn.Models.tblogretmen;

/**
 *
 * @author cesur
 */
public class frmPersonel extends javax.swing.JFrame {

    /**
     * Creates new form frmPersonel
     */
    public frmPersonel() {
        initComponents();
         jtablepersonel.setDefaultEditor(Object.class, null);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtadres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtgsm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsoyad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtbrans = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablepersonel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtmaas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtisegiris = new javax.swing.JTextField();
        btnyenikayit = new javax.swing.JButton();
        btnkaydet = new javax.swing.JButton();
        btnguncelle = new javax.swing.JButton();
        btniptal = new javax.swing.JButton();

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
        jPopupMenu1.add(menusil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personel ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 10, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 90));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Adres");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, 20));

        txtadres.setEditable(false);
        txtadres.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtadres, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Adı");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 94, -1, -1));

        txtad.setEditable(false);
        txtad.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Telefon");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        txtgsm.setEditable(false);
        txtgsm.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtgsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Tc");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        txttc.setEditable(false);
        txttc.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txttc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Soyadı");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        txtsoyad.setEditable(false);
        txtsoyad.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Branşı");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        txtbrans.setEditable(false);
        txtbrans.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtbrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 150, -1));

        jtablepersonel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Adı", "Soyadı", "Tc", "Branşı", "Telefon", "Adres", "Maaşı", "İşe Giriş Tarihi"
            }
        ));
        jtablepersonel.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtablepersonel);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 720, 170));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Maaşı");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        txtmaas.setEditable(false);
        txtmaas.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtmaas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("İşe Giriş Tarihi");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        txtisegiris.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtisegiris, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 150, -1));

        btnyenikayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\yeni kayit.png")); // NOI18N
        btnyenikayit.setText("Yeni Kayıt");
        btnyenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyenikayitActionPerformed(evt);
            }
        });
        jPanel2.add(btnyenikayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, 50));

        btnkaydet.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\kayit.png")); // NOI18N
        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });
        jPanel2.add(btnkaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 120, 50));

        btnguncelle.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\güncelle.png")); // NOI18N
        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });
        jPanel2.add(btnguncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 120, 50));

        btniptal.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\iptal.png")); // NOI18N
        btniptal.setText("İptal");
        btniptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniptalActionPerformed(evt);
            }
        });
        jPanel2.add(btniptal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 120, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 870, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnyenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyenikayitActionPerformed
       
           btnyenikayit.setEnabled(false);
           btnkaydet.setEnabled(true);
           btniptal.setEnabled(true);
           txtac();
           txtac1();
    }//GEN-LAST:event_btnyenikayitActionPerformed
 public void txtac()
{
    txtad.setEditable(true);
    txtsoyad.setEditable(true);
    txtad.setEditable(true);
    txtgsm.setEditable(true);
    txtmaas.setEditable(true);
    txttc.setEditable(true);
    txtbrans.setEditable(true);
    txtadres.setEditable(true);
    txtisegiris.setEditable(true);
}
 public void txtac1()
 {
     
      txtad.setBackground(new java.awt.Color(255, 255, 255));
    txtsoyad.setBackground(new java.awt.Color(255, 255, 255));
   txtgsm.setBackground(new java.awt.Color(255, 255, 255));
    txtmaas.setBackground(new java.awt.Color(255, 255, 255));
    txttc.setBackground(new java.awt.Color(255, 255, 255));
   txtbrans.setBackground(new java.awt.Color(255, 255, 255));
    txtadres.setBackground(new java.awt.Color(255, 255, 255));
    txttc.setBackground(new java.awt.Color(255, 255, 255));
    txtadres.setBackground(new java.awt.Color(255, 255, 255));
    txtisegiris.setBackground(new java.awt.Color(255, 255, 255));
   
 }
    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed

        

        

    }//GEN-LAST:event_btnkaydetActionPerformed

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
       

    }//GEN-LAST:event_btnguncelleActionPerformed

    private void btniptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniptalActionPerformed
        
    }//GEN-LAST:event_btniptalActionPerformed

    private void menuduzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuduzenleActionPerformed
       
    }//GEN-LAST:event_menuduzenleActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(frmPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersonel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersonel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguncelle;
    private javax.swing.JButton btniptal;
    private javax.swing.JButton btnkaydet;
    private javax.swing.JButton btnyenikayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablepersonel;
    private javax.swing.JMenuItem menuduzenle;
    private javax.swing.JMenuItem menusil;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtadres;
    private javax.swing.JTextField txtbrans;
    private javax.swing.JTextField txtgsm;
    private javax.swing.JTextField txtisegiris;
    private javax.swing.JTextField txtmaas;
    private javax.swing.JTextField txtsoyad;
    private javax.swing.JTextField txttc;
    // End of variables declaration//GEN-END:variables
}
