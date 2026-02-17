/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String supplier;
    
    public Product(int id,String name,String category,double price,int quantity,String supplier){
        this.id=id;
        this.name=name;
        this.category=category;
        this.price=price;
        this.quantity=quantity;
        this.supplier=supplier;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getSupplier(){
        return supplier;
    } 
}
