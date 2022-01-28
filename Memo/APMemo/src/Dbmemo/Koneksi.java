/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbmemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SJ COMPUTER
 */
public class Koneksi {
  public static Connection databasekoneksi;
    public static Statement st;
    
    public static Connection koneksiDB() {
        if (databasekoneksi == null) {
           try {
               String DB = "jdbc:mysql://localhost:3306/dbmemo";
               String user = "root";
               String password = "";
               
               databasekoneksi = (Connection) DriverManager.getConnection(DB,user, password);
             st = databasekoneksi.createStatement();  
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi GAGAL" + e.getMessage());
            }
        } return databasekoneksi;
    }  
}
