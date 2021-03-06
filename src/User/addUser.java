/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package User;

import Connection.ConnectionJava;
import Menu.tambahForm;
import Menu.tampilForm;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author AL-HACK3R
 */
public class addUser extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form addUser
     */
    public addUser() {
        initComponents();
        setSize(500, 350);
        setTitle("Tambah Admin");
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x,y);
    }
    
    private void clear(){
        usernameField.setText("");
        passwordField.setText("");
        namaField.setText("");
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
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        namaField = new javax.swing.JTextField();
        addUserBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        addUser = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 54));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, 31));

        usernameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, 35));

        passwordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, 35));

        namaField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(namaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 170, 35));

        addUserBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addUserBtn.setText("Tambah User");
        addUserBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addUserBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addUserBtnMouseExited(evt);
            }
        });
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addUserBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tambahUser.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenu5.setText("Menu");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Tambah Judul");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem2.setText("Cari Judul");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar2.add(jMenu5);

        addUser.setText("User");

        jMenuItem4.setText("Tambah User");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        addUser.add(jMenuItem4);

        jMenuItem5.setText("Ubah Data User");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        addUser.add(jMenuItem5);

        jMenuItem6.setText("Logout");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        addUser.add(jMenuItem6);

        jMenuBar2.add(addUser);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        String username = usernameField.getText();
        String password = passwordField.getText();
        String nama = namaField.getText();
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Field Username Tidak Boleh Kosong");
            usernameField.requestFocus(true);
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Field Password Tidak Boleh Kosong");
            passwordField.requestFocus(true);
        }
        if(nama.equals("")){
            JOptionPane.showMessageDialog(null, "Field Nama Lengkap Tidak Boleh Kosong");
            namaField.requestFocus(true);
        }
        if((!username.equals("")) && (!password.equals("")) && (!nama.equals(""))){
            try{
                con = new ConnectionJava().ConnectDB();
                String check = "select * from user where username=? and password=? and name=?";
                ps = con.prepareStatement(check);
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, nama);
                rs = ps.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "User Sudah Terdaftar Sebelumnya");
                    usernameField.requestFocus(true);
                }else{
                    String insert = "insert into user (id, username, password, name) values" + "(null, '"+username+"', '"+password+"', '"+nama+"')";
                    stm = con.createStatement();
                    stm.executeUpdate(insert);
                    JOptionPane.showMessageDialog(null, "Berhasil Menambah User");
                    clear();
                }
            }catch(SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "Gagal Menambah User");
            }
        }
    }//GEN-LAST:event_addUserBtnActionPerformed
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        new tambahForm().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        new tampilForm().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        
    }//GEN-LAST:event_jMenu5ActionPerformed
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        new addUser().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
        new changeUser().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.dispose();
        new loginForm().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void addUserBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserBtnMouseEntered
        addUserBtn.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_addUserBtnMouseEntered

    private void addUserBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserBtnMouseExited
        addUserBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_addUserBtnMouseExited
    
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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addUser;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
