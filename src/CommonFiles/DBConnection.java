package CommonFiles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kiddabove
 */
public class DBConnection {
    private Connection DBconncetion;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            System.out.println("Database Conncetion Established");
        }
        catch(ClassNotFoundException e){
            System.out.println("Connection Falied");
            System.out.println(e.getMessage());
        }
        try{
            String DBName="imas";
            String Host="jdbc:mysql://localhost:3306/erp-danielsbookshop?zeroDateTimeBehavior=convertToNull";
            String User="root";
            String Password="";
            DBconncetion = DriverManager.getConnection(Host,User,Password);
            System.out.println("Database Found");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Database Not Found");
        }
        return DBconncetion;
    }
   
   
   
}
