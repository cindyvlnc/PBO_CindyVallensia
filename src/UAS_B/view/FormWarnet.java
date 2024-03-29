/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_B.view;

import UAS_B.controller.WarnetController;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class FormWarnet extends javax.swing.JFrame {
    WarnetController controller;
    /**
     * Creates new form FormWarnet
     */
    public FormWarnet() {
        initComponents();
        controller = new WarnetController(this);
        controller.clearForm();
        controller.viewTable();
    }

    public JTextField getTxtJamKeluar() {
        return txtJamKeluar;
    }

    public JTextField getTxtJamMasuk() {
        return txtJamMasuk;
    }

    public JTextField getTxtKodePel() {
        return txtKodePel;
    }

    public JTextField getTxtTgl() {
        return txtTgl;
    }

    public JTextField getTxtTotal() {
        return txtTotal;
    }

    public JTable getTabelWarnet() {
        return tabelWarnet;
    }


    public JTextField getTxtTarif() {
        return txtTarif;
    }

    public JTextField getTxtJenisPelanggan() {
        return txtJenisPelanggan;
    }

    public JTextField getTxtLama() {
        return txtLama;
    }

    public JTextField getTxtNamaPel() {
        return txtNamaPel;
    }

    public JTextField getTxtIndex() {
        return txtIndex;
    }
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTarif = new javax.swing.JTextField();
        txtNamaPel = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        txtJamKeluar = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelWarnet = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtJenisPelanggan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtJamMasuk = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtKodePel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIndex = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Tarif");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 190, 120, 30);

        jLabel2.setText("Nama Pelanggan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 10, 90, 30);

        jLabel3.setText("Lama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 70, 50, 30);

        jLabel4.setText("Jam Masuk");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 110, 120, 30);

        jLabel5.setText("Jam Keluar");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 150, 120, 30);

        txtTarif.setText("jTextField1");
        getContentPane().add(txtTarif);
        txtTarif.setBounds(240, 190, 130, 30);
        getContentPane().add(txtNamaPel);
        txtNamaPel.setBounds(410, 10, 130, 30);

        txtTgl.setText("jTextField1");
        txtTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglActionPerformed(evt);
            }
        });
        getContentPane().add(txtTgl);
        txtTgl.setBounds(240, 70, 130, 30);

        txtLama.setText("jTextField1");
        txtLama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLamaKeyPressed(evt);
            }
        });
        getContentPane().add(txtLama);
        txtLama.setBounds(440, 70, 130, 30);

        txtJamKeluar.setText("jTextField1");
        txtJamKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamKeluarActionPerformed(evt);
            }
        });
        txtJamKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJamKeluarKeyPressed(evt);
            }
        });
        getContentPane().add(txtJamKeluar);
        txtJamKeluar.setBounds(240, 150, 130, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(70, 330, 100, 30);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(310, 330, 100, 30);

        btnCancel.setText("Clear");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(190, 330, 100, 30);

        tabelWarnet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Pelanggan", "Tanggal", "Jam Masuk", "Jam Keluar", "Tarif", "Jenis Pelanggan", "Total", "Nama Pelanggan", "Lama Bermain"
            }
        ));
        jScrollPane1.setViewportView(tabelWarnet);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 470, 570, 130);

        jLabel6.setText("Total");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 270, 120, 30);

        txtTotal.setText("jTextField1");
        getContentPane().add(txtTotal);
        txtTotal.setBounds(240, 270, 130, 30);

        jLabel7.setText("Jenis Pelanggan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 230, 90, 30);

        txtJenisPelanggan.setText("jTextField1");
        txtJenisPelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJenisPelangganKeyPressed(evt);
            }
        });
        getContentPane().add(txtJenisPelanggan);
        txtJenisPelanggan.setBounds(240, 230, 130, 30);

        jLabel8.setText("Tanggal Masuk");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 70, 90, 30);

        txtJamMasuk.setText("jTextField1");
        txtJamMasuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJamMasukKeyPressed(evt);
            }
        });
        getContentPane().add(txtJamMasuk);
        txtJamMasuk.setBounds(240, 110, 130, 30);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(310, 380, 100, 30);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(70, 380, 100, 30);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(190, 380, 100, 30);

        jLabel9.setText("Kode Pelanggan");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 10, 90, 30);

        txtKodePel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodePelActionPerformed(evt);
            }
        });
        txtKodePel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodePelKeyPressed(evt);
            }
        });
        getContentPane().add(txtKodePel);
        txtKodePel.setBounds(120, 10, 130, 30);

        jLabel10.setText("Index");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(400, 280, 40, 16);

        txtIndex.setText("jTextField1");
        getContentPane().add(txtIndex);
        txtIndex.setBounds(440, 270, 130, 30);

        setBounds(0, 0, 606, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLamaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtLamaKeyPressed

    private void txtJamKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamKeluarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtJamKeluarActionPerformed

    private void txtJamKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJamKeluarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            controller.lama();
            //controller.tunjangan();
        }
    }//GEN-LAST:event_txtJamKeluarKeyPressed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.saveWarnet();
        controller.clearForm();
        controller.viewTable();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        controller.clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtJamMasukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJamMasukKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamMasukKeyPressed

    private void txtJenisPelangganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJenisPelangganKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            controller.total();
            //controller.tunjangan();
        }
    }//GEN-LAST:event_txtJenisPelangganKeyPressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.deleteWarnet();
        controller.clearForm();
        controller.viewTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        controller.search();
        controller.viewTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updateWarnet();
        controller.clearForm();
        controller.viewTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtKodePelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodePelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodePelActionPerformed

    private void txtKodePelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodePelKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
//            controller.tampilNamaPelanggan();
            //controller.tunjangan();
        }
    }//GEN-LAST:event_txtKodePelKeyPressed

    private void txtTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglActionPerformed

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
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormWarnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormWarnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelWarnet;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtJamKeluar;
    private javax.swing.JTextField txtJamMasuk;
    private javax.swing.JTextField txtJenisPelanggan;
    private javax.swing.JTextField txtKodePel;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNamaPel;
    private javax.swing.JTextField txtTarif;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
