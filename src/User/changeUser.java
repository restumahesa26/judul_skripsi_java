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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AL-HACK3R
 */
public class changeUser extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement ps;
    Statement stm;
    ResultSet rs;
    DefaultTableModel table;
    /**
     * Creates new form changeUser
     */
    public changeUser() {
        initComponents();
        setSize(700, 500);
        setTitle("Ubah Admin");
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x,y);
        tampilData();
        ubahBtn.setVisible(false);
        hapusBtn.setVisible(false);
    }
    
    private void clear(){
        usernameField.setText("");
        passwordField.setText("");
        namaField.setText("");
        tampilData();
    }
    
    private void tampilData() {
        Object baris[] = {"Id", "Username", "Password", "Nama Lengkap"};
        table = new DefaultTableModel(null, baris);
        tabel.setModel(table);
        try {
            con = new ConnectionJava().ConnectDB();
            String select = "select * from user order by id ASC";
            stm = con.createStatement();
            rs = stm.executeQuery(select);
            while(rs.next()) {
                String id = rs.getString("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String nama = rs.getString("name");
                String[] data = {id, username, password, nama};
                table.addRow(data);
            }
        }catch(SQLException e) {
            
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

        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        ubahBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
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
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        usernameField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 170, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        passwordField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 170, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nama Lengkap");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        namaField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(namaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 170, 35));

        ubahBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ubahBtn.setText("Ubah User");
        ubahBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ubahBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ubahBtnMouseExited(evt);
            }
        });
        ubahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ubahBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        hapusBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hapusBtn.setText("Hapus User");
        hapusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hapusBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hapusBtnMouseExited(evt);
            }
        });
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });
        getContentPane().add(hapusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 640, 210));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ubahUser.jpg"))); // NOI18N
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
    
    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        ubahBtn.setVisible(true);
        hapusBtn.setVisible(true);
        int sel = tabel.getSelectedRow();
        String id = table.getValueAt(sel, 0).toString();
        int ID = Integer.parseInt(id);
        try {
            String select = "select * from user where id = '" +ID+ "'";
            rs = stm.executeQuery(select);
            while(rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String nama = rs.getString("name");
                
                usernameField.setText(username);
                passwordField.setText(password);
                namaField.setText(nama);
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Melakukan Verifikasi Data");
        }
    }//GEN-LAST:event_tabelMouseClicked
    
    private void ubahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBtnActionPerformed
        String username = usernameField.getText();
        String password = passwordField.getText();
        String nama = namaField.getText();
        int sel = tabel.getSelectedRow();
        String id = table.getValueAt(sel, 0).toString();
        int ID = Integer.parseInt(id);
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Form Judul Tidak Boleh Kosong");
            usernameField.requestFocus(true);
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Form Nama Penulis Tidak Boleh Kosong");
            passwordField.requestFocus(true);
        }
        if(nama.equals("")){
            JOptionPane.showMessageDialog(null, "Form Tahun Tidak Boleh Kosong");
            namaField.requestFocus(true);
        }
        if(!username.equals("")&&!password.equals("")&&!nama.equals("")){
            try{
                int ubah = JOptionPane.showConfirmDialog(null, "Yakin Ingin Mengubah Data Ini?", "Ubah Data", 0);
                if(ubah==0){
                    String update = "update user set username = '"+username+"', password = '"+password+"' , name = '"+nama+"' where id = '"+ID+"'";
                    stm = con.createStatement();
                    stm.executeUpdate(update);
                    JOptionPane.showMessageDialog(null, "Berhasil Mengubah Data");
                    tampilData();
                    clear();
                }
            }catch(HeadlessException | SQLException e ){
                JOptionPane.showMessageDialog(null, "Gagal Mengubah Data");
            }
        }     
    }//GEN-LAST:event_ubahBtnActionPerformed
    
    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        int sel = tabel.getSelectedRow();
        String id = table.getValueAt(sel, 0).toString();
        int ID = Integer.parseInt(id);
        int hapus = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data Ini?", "Hapus Data", 0);
        if (hapus == 0) {
            try {
                String Hapus = "delete from user WHERE id = '" + ID + "'";
                stm = con.createStatement();
                stm.executeUpdate(Hapus);
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus User");
                tampilData();
                clear();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus User");
            }
        }
    }//GEN-LAST:event_hapusBtnActionPerformed
    
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

    private void ubahBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahBtnMouseEntered
        ubahBtn.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ubahBtnMouseEntered

    private void ubahBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahBtnMouseExited
        ubahBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_ubahBtnMouseExited

    private void hapusBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusBtnMouseEntered
        hapusBtn.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_hapusBtnMouseEntered

    private void hapusBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusBtnMouseExited
        hapusBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_hapusBtnMouseExited
    
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
            java.util.logging.Logger.getLogger(changeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changeUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changeUser().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu addUser;
    private javax.swing.JButton hapusBtn;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTable tabel;
    private javax.swing.JButton ubahBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
