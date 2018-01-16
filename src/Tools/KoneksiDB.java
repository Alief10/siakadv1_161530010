/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PDD_JTK_025
 */
public class KoneksiDB {
    
    public Connection getConnection() throws SQLException{ //method koneksi DB
        Connection cnn; //deklarasi class Connection
        try{
            String server = "jdbc:mysql://localhost/dbsiakadv1_161530010"; //nama server
            String drever = "com.mysql.jdbc.Driver"; //nama driver koneksi DB MySQL
            Class.forName(drever); //eksekusi driver koneksi
            cnn = DriverManager.getConnection(server, "root", ""); //inisialisasi variabel cnn
            return  cnn;
            
        }catch(SQLException | ClassNotFoundException se){ // fungsi catch : menampilkan error
            JOptionPane.showMessageDialog(null, "Error koneksi databa : "+se);
            return null;
        }
        
        
    }
    
}
