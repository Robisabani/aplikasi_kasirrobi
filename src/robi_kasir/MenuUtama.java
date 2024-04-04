/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package robi_kasir;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author lab.pplg
 */
public class MenuUtama extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    konek = koneksi.koneksiDB();
    mulai();
    tampilWaktu();
    
    }
    
    
        
    public void mulai() {
formlogin.setVisible(false);
register.setEnabled(false);
logout.setEnabled(false);
master.setEnabled(false);
transaksi.setEnabled(false);
laporan.setEnabled(false);
txtjam.setEnabled(false);
txttanggal.setEnabled(false);
register.setEnabled(false);
btnprdk.setEnabled(false);
btnpnjalan.setEnabled(false);
btnplnggan.setEnabled(false);
btnrgstr.setEnabled(false);

}
  
    public void tampilWaktu() {
        Thread clock = new Thread() {
            public void run() {
                for(;;) {
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat Jam = new SimpleDateFormat("HH:mm:ss");
                    SimpleDateFormat Tanggal = new SimpleDateFormat("yyyy-MM-dd");
                    txtjam.setText(Jam.format(cal.getTime()));
                    txttanggal.setText(Tanggal.format(cal.getTime()));
               try { sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            }
        };
        clock.start();
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbluser = new javax.swing.JLabel();
        btnrgstr = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnplnggan = new javax.swing.JButton();
        btnprdk = new javax.swing.JButton();
        btnpnjalan = new javax.swing.JButton();
        txtjam = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        formlogin = new javax.swing.JInternalFrame();
        txtpassword = new javax.swing.JTextField();
        cmbakses = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnbatal = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        beranda = new javax.swing.JMenu();
        register = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        login = new javax.swing.JMenuItem();
        master = new javax.swing.JMenu();
        pelanggan = new javax.swing.JMenuItem();
        produk = new javax.swing.JMenuItem();
        transaksi = new javax.swing.JMenu();
        penjualan = new javax.swing.JMenuItem();
        laporan = new javax.swing.JMenu();
        about = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        lbluser.setText("SILAHKAN LOGIN");

        btnrgstr.setText("REGISTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbluser)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnrgstr)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbluser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE)
                .addComponent(btnrgstr)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, 545));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        btnplnggan.setText("PELANGGAN");
        btnplnggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplngganActionPerformed(evt);
            }
        });

        btnprdk.setText("PRODUK");
        btnprdk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprdkActionPerformed(evt);
            }
        });

        btnpnjalan.setText("PENJUALAN");
        btnpnjalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpnjalanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnplnggan)
                .addGap(41, 41, 41)
                .addComponent(btnprdk, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(btnpnjalan)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnplnggan)
                    .addComponent(btnprdk)
                    .addComponent(btnpnjalan))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 445, -1, -1));
        getContentPane().add(txtjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        formlogin.setVisible(true);

        cmbakses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Salah Satu", "Admin", "Petugas" }));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setToolTipText("");

        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnbatal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogin)
                .addGap(76, 76, 76))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbatal)
                    .addComponent(btnlogin))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("HAK AKSES");

        javax.swing.GroupLayout formloginLayout = new javax.swing.GroupLayout(formlogin.getContentPane());
        formlogin.getContentPane().setLayout(formloginLayout);
        formloginLayout.setHorizontalGroup(
            formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(formloginLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtusername)
                    .addComponent(txtpassword)
                    .addComponent(cmbakses, 0, 180, Short.MAX_VALUE))
                .addGap(70, 70, 70))
            .addGroup(formloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formloginLayout.setVerticalGroup(
            formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbakses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(formlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 55, -1, -1));

        beranda.setText("BERANDA");
        beranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berandaActionPerformed(evt);
            }
        });

        register.setText("REGISTER");
        beranda.add(register);

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        beranda.add(logout);

        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        beranda.add(login);

        jMenuBar1.add(beranda);

        master.setText("MASTER");
        master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterActionPerformed(evt);
            }
        });

        pelanggan.setText("PELANGGAN");
        master.add(pelanggan);

        produk.setText("PRODUK");
        produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkActionPerformed(evt);
            }
        });
        master.add(produk);

        jMenuBar1.add(master);

        transaksi.setText("TRANSAKSI");

        penjualan.setText("PENJUALAN");
        transaksi.add(penjualan);

        jMenuBar1.add(transaksi);

        laporan.setText("LAPORAN");
        jMenuBar1.add(laporan);

        about.setText("ABOUT");

        help.setText("help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        about.add(help);

        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masterActionPerformed

    private void produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produkActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed

       
        try {
    String sql="select * from login where Username='"+txtusername.getText()+"' and Password='"+txtpassword.getText()+"' and HakAkses='"+cmbakses.getSelectedItem()+"'";
    pst = konek.prepareStatement(sql);
    rst = pst.executeQuery();
    if (rst.next()) {
        if(txtusername.getText().equals(rst.getString("Username"))&& txtpassword.getText().equals(rst.getString("Password"))&& cmbakses.getSelectedItem().equals(rst.getString("HakAkses")))
            if(cmbakses.getSelectedItem().equals("Admin")){
                    register.setEnabled(true);
                    logout.setEnabled(true);
                    master.setEnabled(true);
                    produk.setEnabled(true);
                    master.setEnabled(true);
                    transaksi.setEnabled(true);
                    master.setEnabled(true);
                    laporan.setEnabled(true);
                    formlogin.setVisible(false);
                    btnrgstr.setEnabled(true);
                    btnprdk.setEnabled(true);
                    btnplnggan.setEnabled(true);
                    btnpnjalan.setEnabled(true);
                    txtjam.setEnabled(false);
                    txttanggal.setEnabled(false);
                } else if(cmbakses.getSelectedItem().equals("Petugas")){
                    register.setEnabled(false);
                    logout.setEnabled(true);
                    master.setEnabled(true);
                    produk.setEnabled(true);
                    master.setEnabled(true);
                    transaksi.setEnabled(true);
                    master.setEnabled(true);
                    laporan.setEnabled(true);
                    formlogin.setVisible(false);
                    btnrgstr.setEnabled(false);
                    btnprdk.setEnabled(true);
                    btnplnggan.setEnabled(true);
                    btnpnjalan.setEnabled(true);
                    txtjam.setEnabled(false);
                    txttanggal.setEnabled(false);
                }
        {
            JOptionPane.showMessageDialog(null, "Selamat Datang '"+txtusername.getText()+"'");
            String text = txtusername.getText();
            lbluser.setText("Selamat Datang, "+text);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Gagal Login. Periksa kembali Username, Password dan Hak Akses");
        txtusername.setText("");
        txtpassword.setText("");
        cmbakses.setSelectedItem("-Pilih Salah Satu-");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}

   // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
 formlogin.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void berandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berandaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_berandaActionPerformed

    private void btnprdkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprdkActionPerformed
    new FormProduk().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_btnprdkActionPerformed

    private void btnplngganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplngganActionPerformed
    new FormPelanggan().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_btnplngganActionPerformed

    private void btnpnjalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpnjalanActionPerformed
   new Formpenjualan().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnpnjalanActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
    new Formabout().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_helpActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbatalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenu beranda;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnplnggan;
    private javax.swing.JButton btnpnjalan;
    private javax.swing.JButton btnprdk;
    private javax.swing.JButton btnrgstr;
    private javax.swing.JComboBox<String> cmbakses;
    private javax.swing.JInternalFrame formlogin;
    private javax.swing.JMenuItem help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenu laporan;
    private javax.swing.JLabel lbluser;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu master;
    private javax.swing.JMenuItem pelanggan;
    private javax.swing.JMenuItem penjualan;
    private javax.swing.JMenuItem produk;
    private javax.swing.JMenu register;
    private javax.swing.JMenu transaksi;
    private javax.swing.JTextField txtjam;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
