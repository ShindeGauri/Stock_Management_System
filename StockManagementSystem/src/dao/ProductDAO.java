/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author Admin
 */
public class ProductDAO {
    public boolean addProduct(Product product){
        Connection conn=DBConnection.getConnection();
        String sql="INSERT INTO products(id, name, category, price, quantity, supplier) VALUES (?, ?, ?, ?, ?, ?);";
        try{
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,product.getId());
            pst.setString(2,product.getName());
            pst.setString(3,product.getCategory());
            pst.setDouble(4,product.getPrice());
            pst.setInt(5,product.getQuantity());
            pst.setString(6,product.getSupplier());
            pst.executeUpdate();
            return true;  
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }   
}
