/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okulmvn.Gui;

import com.okulmvn.Dal.tblbolumDAO;
import com.okulmvn.Dal.tblsinifDAO;
import com.okulmvn.Dal.tbogrenciDAO;
import com.okulmvn.Models.tblbolum;

import com.okulmvn.Models.tblogrenci;
import com.okulmvn.Models.tblsinif;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author cesur
 */
public class frmOgrenci extends javax.swing.JFrame {

    /**
     * Creates new form frmOgrenciler
     */
      public static int secilenid;
     
    public static int tblsecilen;
    tblsinifDAO db= new tblsinifDAO();
    tblbolumDAO db1= new tblbolumDAO();
    tbogrenciDAO dbo= new tbogrenciDAO();
   
    List<tblsinif> tbls= new ArrayList<tblsinif>();
     JFileChooser fileChooser;
     String dosya;
   
    List<tblogrenci> öğrenciliste= new ArrayList<tblogrenci>();

    public frmOgrenci() {
        initComponents();
         combobaxcek();
        combobaxcek1();
         tblOgrenci.setDefaultEditor(Object.class, null);
      öğrenciliste=dbo.listele(new tblogrenci());
        tablodoldur();
        
    }
 public void combobaxcek()
 {
     
     for (tblsinif item1 : db.listele(new tblsinif())) {
        cmbsinif.addItem(item1.getSinifadi());
       
         
     }
 
     
     
 }
 public void combobaxcek1()
 {
     
     for (tblbolum item : db1.listele(new tblbolum())) {
         cmbbolum.addItem(item.getAlan());
     }
     
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuduzenle = new javax.swing.JMenuItem();
        menusil = new javax.swing.JMenuItem();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsoyad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdogumtarihi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtveliadi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtdevamsizlik = new javax.swing.JTextField();
        txtvelisoaydi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtvelitel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtadres = new javax.swing.JTextArea();
        btnyenikayit = new javax.swing.JButton();
        btnkaydet = new javax.swing.JButton();
        btnguncelle = new javax.swing.JButton();
        btniptal = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtNumara = new javax.swing.JTextField();
        cmbbolum = new javax.swing.JComboBox<>();
        cmbsinif = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jlabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmbkangrubu = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOgrenci = new javax.swing.JTable();
        txttelefon = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(920, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(887, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ÖĞRENCİ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 100));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Adı");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtad.setEditable(false);
        txtad.setBackground(new java.awt.Color(108, 122, 137));
        txtad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadActionPerformed(evt);
            }
        });
        jPanel2.add(txtad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Soyadı");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtsoyad.setEditable(false);
        txtsoyad.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtsoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Numara");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        txtdogumtarihi.setEditable(false);
        txtdogumtarihi.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtdogumtarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Sınıfı");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Telefon");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Veli Adı");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 51, -1));

        txtveliadi.setEditable(false);
        txtveliadi.setBackground(new java.awt.Color(108, 122, 137));
        txtveliadi.setToolTipText("");
        txtveliadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtveliadiActionPerformed(evt);
            }
        });
        jPanel2.add(txtveliadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Veli Soyadı");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 95, -1));

        txtdevamsizlik.setEditable(false);
        txtdevamsizlik.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtdevamsizlik, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 170, -1));

        txtvelisoaydi.setEditable(false);
        txtvelisoaydi.setBackground(new java.awt.Color(108, 122, 137));
        txtvelisoaydi.setToolTipText("");
        txtvelisoaydi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvelisoaydiActionPerformed(evt);
            }
        });
        jPanel2.add(txtvelisoaydi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 170, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Veli Telefonu");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 95, -1));

        txtvelitel.setEditable(false);
        txtvelitel.setBackground(new java.awt.Color(108, 122, 137));
        txtvelitel.setToolTipText("");
        txtvelitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvelitelActionPerformed(evt);
            }
        });
        jPanel2.add(txtvelitel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Devamsızlık");
        jLabel12.setToolTipText("");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 240, 241));
        jLabel14.setText("Bölüm");
        jLabel14.setToolTipText("");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(236, 240, 241));
        jLabel16.setText("Adres");
        jLabel16.setToolTipText("");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, -1));

        txtadres.setEditable(false);
        txtadres.setBackground(new java.awt.Color(108, 122, 137));
        txtadres.setColumns(20);
        txtadres.setRows(5);
        jScrollPane2.setViewportView(txtadres);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, 80));

        btnyenikayit.setBackground(new java.awt.Color(236, 240, 241));
        btnyenikayit.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\yeni kayit.png")); // NOI18N
        btnyenikayit.setText("Yeni Kayıt");
        btnyenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyenikayitActionPerformed(evt);
            }
        });
        jPanel2.add(btnyenikayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 120, 50));

        btnkaydet.setBackground(new java.awt.Color(236, 240, 241));
        btnkaydet.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\kayit.png")); // NOI18N
        btnkaydet.setText("Kaydet");
        btnkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaydetActionPerformed(evt);
            }
        });
        jPanel2.add(btnkaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 107, 50));

        btnguncelle.setBackground(new java.awt.Color(236, 240, 241));
        btnguncelle.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\güncelle.png")); // NOI18N
        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });
        jPanel2.add(btnguncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 120, 50));

        btniptal.setBackground(new java.awt.Color(236, 240, 241));
        btniptal.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesur\\Desktop\\iptal.png")); // NOI18N
        btniptal.setText("İptal");
        jPanel2.add(btniptal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 107, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(236, 240, 241));
        jLabel17.setText("Tc");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        txtNumara.setEditable(false);
        txtNumara.setBackground(new java.awt.Color(108, 122, 137));
        txtNumara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumaraKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumara, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 170, -1));

        jPanel2.add(cmbbolum, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 170, -1));

        cmbsinif.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(cmbsinif, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 170, -1));

        jButton5.setText("Resim Yükle");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 120, 50));

        jlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 180, 190));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(236, 240, 241));
        jLabel19.setText("Kan Grubu");
        jLabel19.setToolTipText("");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(236, 240, 241));
        jLabel20.setText("Cinsiyet");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, 20));

        cmbkangrubu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O Rh+", "O Rh-", "A Rh+", "A Rh-" }));
        jPanel2.add(cmbkangrubu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 170, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(236, 240, 241));
        jLabel21.setText("Email");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        txtemail.setEditable(false);
        txtemail.setBackground(new java.awt.Color(108, 122, 137));
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 170, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 240, 241));
        jLabel13.setText("Doğum Tarihi");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        txttc.setEditable(false);
        txttc.setBackground(new java.awt.Color(108, 122, 137));
        txttc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttcKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttcKeyTyped(evt);
            }
        });
        jPanel2.add(txttc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 170, -1));

        tblOgrenci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Adı", "Soyadı", "Numara", "Sınıfı"
            }
        ));
        tblOgrenci.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tblOgrenci);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 640, 90));

        txttelefon.setEditable(false);
        txttelefon.setBackground(new java.awt.Color(108, 122, 137));
        txttelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonActionPerformed(evt);
            }
        });
        jPanel2.add(txttelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 170, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Erkek");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup7.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Bayan");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 990, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtvelisoaydiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvelisoaydiActionPerformed
       
    }//GEN-LAST:event_txtvelisoaydiActionPerformed

    private void txtvelitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvelitelActionPerformed
       
    }//GEN-LAST:event_txtvelitelActionPerformed

    private void txtveliadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtveliadiActionPerformed
       
    }//GEN-LAST:event_txtveliadiActionPerformed

    private void txtadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadActionPerformed
        
    }//GEN-LAST:event_txtadActionPerformed

    private void txttcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttcKeyPressed
     
        
    }//GEN-LAST:event_txttcKeyPressed

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed
        
    }//GEN-LAST:event_jLabel7KeyPressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked
    public void txtac()
    {
        
        txtad.setEditable(true);
        txtsoyad.setEditable(true);
        txttelefon.setEditable(true);
        txtveliadi.setEditable(true);
        txtvelisoaydi.setEditable(true);
        txtvelitel.setEditable(true);
        txtadres.setEditable(true);
        txttc.setEditable(true);
        txtdogumtarihi.setEditable(true);
        txtNumara.setEditable(true);
        txtdevamsizlik.setEditable(true);
        txtemail.setEditable(true);
        
        
    }
    private void btnyenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyenikayitActionPerformed
        txtac();
       txac1();
        
    }//GEN-LAST:event_btnyenikayitActionPerformed
public void txac1()
{
    
    txtad.setBackground(new java.awt.Color(255, 255, 255));
    txtsoyad.setBackground(new java.awt.Color(255, 255, 255));
    txttelefon.setBackground(new java.awt.Color(255, 255, 255));
    txtveliadi.setBackground(new java.awt.Color(255, 255, 255));
    txtvelisoaydi.setBackground(new java.awt.Color(255, 255, 255));
    txtvelitel.setBackground(new java.awt.Color(255, 255, 255));
    txtadres.setBackground(new java.awt.Color(255, 255, 255));
    txttc.setBackground(new java.awt.Color(255, 255, 255));
    txtdogumtarihi.setBackground(new java.awt.Color(255, 255, 255));
    txtNumara.setBackground(new java.awt.Color(255, 255, 255));
    txtdevamsizlik.setBackground(new java.awt.Color(255, 255, 255));
    txtemail.setBackground(new java.awt.Color(255, 255, 255));
    
}
public void  temizle()
{
    
     txtad.setText("");
     txtsoyad.setText("");
     txttelefon.setText("");
     txtveliadi.setText("");
     txtvelisoaydi.setText("");
     txtvelitel.setText("");
     txtadres.setText("");
     txttc.setText("");
     txtdogumtarihi.setText("");
     txtNumara.setText("");
     txtdevamsizlik.setText("");
     txtemail.setText("");
}
    private void btnkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaydetActionPerformed
     
        String secim="";
        if(jRadioButton1.isSelected())
        {
            
            secim="Erkek";
            
        }
        if(jRadioButton2.isSelected())
        {
              secim="Bayan";
            
        }
        
      
         int combo_id1=cmbbolum.getSelectedIndex();
         int id1=(int)db1.listele(new tblbolum()).get(combo_id1).getId();
        tblogrenci tbl1= new tblogrenci();
      tbl1.setAd(txtad.getText());
      tbl1.setSoyadi(txtsoyad.getText());
      tbl1.setEmail(txtemail.getText());
      tbl1.setKangrubu(cmbkangrubu.getSelectedItem().toString());
      tbl1.setCinsiyet(secim);
    
      
      tbl1.setTelefon(txttelefon.getText());
      tbl1.setVelitelefon(txtvelitel.getText());
      tbl1.setNumara(txtNumara.getText());
      tbl1.setDevamsizlik(txtdevamsizlik.getText());
      tbl1.setVelisoyadi(txtvelisoaydi.getText());
      tbl1.setVeliadi(txtveliadi.getText());
      tbl1.setAdres(txtadres.getText());
      tbl1.setTc(txttc.getText());
      tbl1.setDogumtarihi(txtdogumtarihi.getText());
      tbl1.setResimyolu(dosya);
      int comboid = cmbsinif.getSelectedIndex();
      int id = db.listele(new tblsinif()).get(comboid).getId();
      tbl1.setBolumid(id1);
      tbl1.setSinifid(id);
      tbl1.setSilid(1);
    
      
      
    
     
      
      
    
      
   
      öğrenciliste.add(tbl1);
     
      dbo.kaydet(tbl1);
      temizle();
      tablodoldur();
      
    }//GEN-LAST:event_btnkaydetActionPerformed
  public void tablotemizle()
  {
        DefaultTableModel df=(DefaultTableModel)this.tblOgrenci.getModel();
         df.getDataVector().removeAllElements();
      
  }
  public void satirekle()
  {
      
       DefaultTableModel dt= (DefaultTableModel)this.tblOgrenci.getModel();
        dt.setRowCount(dt.getRowCount()+1);
        this.tblOgrenci.repaint();
  }
    private void txttelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonActionPerformed
 public void tablodoldur()
 {
      int i=0;
         
         for (tblogrenci mst : öğrenciliste) {
               satirekle();
               
                 tblOgrenci.setValueAt(mst.getId(), 0+i, 0);
            tblOgrenci.setValueAt(mst.getAd(), 0+i, 1);
              tblOgrenci.setValueAt(mst.getSoyadi(), 0+i, 2);
               tblOgrenci.setValueAt(mst.getNumara(), 0+i, 3);
                tblOgrenci.setValueAt(mst.getSinifid(), 0+i, 4);
               
              
                           

          i++;
     }
             
            
             
             
             
     
 }
    private void menuduzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuduzenleActionPerformed
      int secilen=tblOgrenci.getSelectedRow();
      tblsecilen=secilen;
      secilenid=Integer.parseInt(tblOgrenci.getValueAt(secilen, 0).toString());
      txtad.setText(tblOgrenci.getValueAt(secilen, 1).toString());
      txtsoyad.setText(tblOgrenci.getValueAt(secilen, 2).toString());
      txtNumara.setText(tblOgrenci.getValueAt(secilen,3).toString());
      cmbsinif.setSelectedItem(tblOgrenci.getValueAt(secilen, 4).toString());
      
      
      
      
       
    }//GEN-LAST:event_menuduzenleActionPerformed

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
       
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void jlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel1MouseClicked
       
    }//GEN-LAST:event_jlabel1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
       //String dosyaadi = fileChooser.getSelectedFile().getName();
       //stem.out.println(fileChooser.getSelectedFile().getAbsolutePath());
       //  File dosya = fileChooser.getSelectedFile();
       ///  File islem = new File("d:\\dosya.png");
       ///   islem.compareTo(dosya.getAbsoluteFile());
        dosya = fileChooser.getSelectedFile().getAbsolutePath(); 
        ///    System.out.println(dosya);
       jlabel1.setIcon(new javax.swing.ImageIcon(dosya));
    
       
       
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void txttcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttcKeyTyped
        char  vchar=evt.getKeyChar();
        if(!(Character.isDigit(vchar))
        ||(vchar==KeyEvent.VK_BACK_SPACE)
                ||(vchar==KeyEvent.VK_DELETE))
        {
            
            evt.consume();
            
        }
        
    }//GEN-LAST:event_txttcKeyTyped

    private void txtNumaraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumaraKeyTyped
      
      
        
        char  vchar=evt.getKeyChar();
        if(!(Character.isDigit(vchar))
        ||(vchar==KeyEvent.VK_BACK_SPACE)
                ||(vchar==KeyEvent.VK_DELETE))
        {
            
            evt.consume();
            
        }
        
    }//GEN-LAST:event_txtNumaraKeyTyped
public  void  satirsil(int id)
{
    try {
        öğrenciliste.remove(id);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "HATA!! Boş kayıt Silme İşlemi Yapamazsınız.");
    }
    
    
}
    private void menusilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusilActionPerformed
          int reply = JOptionPane.showConfirmDialog(null, "İlgili Kaydı silmek istiyor musunuz?",
            "UYARI", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
         
            int secilen = tblOgrenci.getSelectedRow();
            int id1 =Integer.parseInt(tblOgrenci.getValueAt(secilen, 0).toString());
            satirsil(secilen);
            dbo.silogrenci(id1);
          
           
            

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
            java.util.logging.Logger.getLogger(frmOgrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmOgrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmOgrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmOgrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmOgrenci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguncelle;
    private javax.swing.JButton btniptal;
    private javax.swing.JButton btnkaydet;
    private javax.swing.JButton btnyenikayit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JComboBox<String> cmbbolum;
    private javax.swing.JComboBox<String> cmbkangrubu;
    private javax.swing.JComboBox<String> cmbsinif;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JMenuItem menuduzenle;
    private javax.swing.JMenuItem menusil;
    private javax.swing.JTable tblOgrenci;
    private javax.swing.JTextField txtNumara;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextArea txtadres;
    private javax.swing.JTextField txtdevamsizlik;
    private javax.swing.JTextField txtdogumtarihi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtsoyad;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttelefon;
    private javax.swing.JTextField txtveliadi;
    private javax.swing.JTextField txtvelisoaydi;
    private javax.swing.JTextField txtvelitel;
    // End of variables declaration//GEN-END:variables
}
