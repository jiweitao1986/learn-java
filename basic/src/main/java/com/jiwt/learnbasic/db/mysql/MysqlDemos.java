/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.db.mysql;

import com.jiwt.learnbasic.DisplayUtil;
import java.sql.DriverManager;
import java.sql.*;
import com.mysql.jdbc.Driver;




/**
 *
 * @author jiwt
 */
public class MysqlDemos {
    public static void run() {

        // jdbc:mysql://ip:port/dbName?user=root&password=root
        String url = "jdbc:mysql://127.0.0.1:3306/hr";
        String username = "root";
        String password = "root";
        Connection conn = null;
        SQLException ex = null;

        // Create connection.
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch(SQLException e) {
            throw new RuntimeException("Connect successfully.");
        }
        

        // Execulte sql

        try {
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("select * from hr_employee");
            while (result.next()) {
                DisplayUtil.showContent(String.valueOf(result.getInt(1)));
                DisplayUtil.showContent(result.getString(2));
                DisplayUtil.showContent(result.getString(3));                
            }
        } catch(SQLException e) {
            throw new RuntimeException("Fail to execute query sql.");
        }
   
        // Close connection
        try {
            conn.close();
        } catch(SQLException e) {
            throw new RuntimeException("Fail to close the connection.");
        }
                            
    }
    
}
