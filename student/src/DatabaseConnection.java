
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salinda
 */
public class DatabaseConnection {
   
    // C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext
    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/student";
    final static String USER = "root";
     final static String PASS = "";
     
     public static Connection connection(){
         
         try{
             Class.forName(JDBC_DRIVER);
             
             Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             return conn;
             
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
             return null; 
         }
     }  
    
}

    