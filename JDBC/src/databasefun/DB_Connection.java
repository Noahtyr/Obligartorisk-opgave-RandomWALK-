/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasefun;

import java.sql.*;


/**
 *
 * @author virk04
 */
public class DB_Connection {

    // Declare a Connection
    private Connection con = null;
    // The Url
    String url = "jdbc:postgresql://localhost:5432/postgres";
    // The username
    String user = "postgres";
    // The Password
    String psswrd = "freak123";
    // declare the Statement
    Statement stmt = null;
    // declare the ResultSet
    ResultSet rs = null;

    public void connect() {
        System.out.println("--PostgreSQL JDBC connection test--");

        try {
            // Locate postgres JDBC driver   
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            // Catch exception
            ex.printStackTrace();
            return;
        }
        System.out.println("PostgreSQL JDBC Driver is registered");
        
        try{
            // Connect to Database = jdbc:postgresql://connection type:port#/Database name, username, password
           con = DriverManager.getConnection(url, user, psswrd);
           String query = "select * from person";
           stmt = con.createStatement();
           rs = stmt.executeQuery(query);
           
           while(rs.next()){
               String name = rs.getString("pname");
               System.out.println(name);
           }
        } catch (SQLException ex) {
            // Catch exception
            ex.printStackTrace();
            return;
        }
           if(con != null){
               System.out.println("--Connection establised!--");
           }
           else{
               System.out.println("--No connection estabslied--");
           }
    }

}
