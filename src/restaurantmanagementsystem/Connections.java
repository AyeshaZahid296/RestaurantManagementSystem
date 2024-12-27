/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Connections {
    public static Connection connect() {
        Connection con = null;
   
        try {
           
            
            String url = "jdbc:ucanaccess://C:/Users/kk/Downloads/RestaurantManagementSystemDB.accdb" ;
            con = DriverManager.getConnection(url);
            System.out.println("Database connection established.");
        } catch (Exception e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
        return con;
    }
}
