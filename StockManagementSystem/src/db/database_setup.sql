/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Admin
 * Created: Feb 12, 2026
 */

CREATE DATABASE stock_db;
USE stock_db;
CCREATE TABLE products (id INT PRIMARY KEY, name VARCHAR(100), category VARCHAR(50), price DOUBLE, quantity INT, supplier VARCHAR(100));