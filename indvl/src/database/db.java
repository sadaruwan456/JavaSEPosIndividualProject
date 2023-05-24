/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dilanka
 */
public class db {

    private static Connection c;

    private static synchronized void createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3307/grand_mobile", "root", "456789");

    }
    public static Connection getConnection() throws SQLException, ClassNotFoundException, Exception {
        if (c == null) {
            createConnection();
        }
        return c;
    }

    public static void iud(String qry) throws SQLException, ClassNotFoundException{
        if (c == null) {
            createConnection();

        }
        c.createStatement().executeUpdate(qry);
    }

    public static ResultSet search(String qry) throws SQLException, ClassNotFoundException{
        if (c == null) {
           createConnection();
        }
        return c.createStatement().executeQuery(qry);
    }
//    public static void main(String[] args) {
//        try {
//            
// getConnection();       } catch (Exception e) {
//        }
// 
//    }
}
