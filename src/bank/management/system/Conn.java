package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c; //declaring connection variable
    Statement s; //declaring statement variable
    public Conn(){
        
        try {
            //creating Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "abhayraj");
            //creating Statement
            s = c.createStatement();
            
        } catch (Exception e){
            //print Error
            System.out.println(e);
        }
    }
    
}
