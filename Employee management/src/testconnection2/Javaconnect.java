/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconnection2;
import java.awt.image.ImageObserver;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Ravi
 */
class Javaconnect1{
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:F:\\rcpl\\database\\check.sqlite");
            JOptionPane.showMessageDialog(null,"connection established");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
/*public class Javaconnect {
    
   /* public static void main(String...args){
        Connection conn=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("exception..");
        }*/
        
        
    


/*public static void main(String...args){
Javaconnect1.ConnecrDb();
}
}*/
