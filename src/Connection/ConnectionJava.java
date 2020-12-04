/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AL-HACK3R
 */
public class ConnectionJava {
    java.sql.Connection con = null;
    public static java.sql.Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_judulSkripsi","root","");
            return con;
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null; 
        }
    }
}
