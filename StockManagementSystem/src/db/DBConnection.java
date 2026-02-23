/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DBConnection {
    public static Connection getConnection(){
        try{
        String url="jdbc:mysql://localhost:3306/stock_db";
        String user="root";
        String pass="root";
        return DriverManager.getConnection(url,user,pass);
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
