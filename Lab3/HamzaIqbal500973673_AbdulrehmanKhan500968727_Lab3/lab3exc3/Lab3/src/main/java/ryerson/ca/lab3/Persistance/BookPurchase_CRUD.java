/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author student
 */
public class BookPurchase_CRUD {

    private static Connection getCon(){
    Connection con=null;
     try{
         
         Class.forName("com.mysql.cj.jdbc.Driver");
        //con=DriverManager.getConnection("jdbc:mysql://db:3306/hold_LBS?allowPublicKeyRetrieval=true&useSSL=false", "root", "student");
       
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBookstore?autoReconnect=true&useSSL=false", "root", "student");
        System.out.println("Connection established.");
     }
     catch(Exception e){ System.out.println(e);}
     return con;
    }

    public static boolean addPurchasedBook(int transactionID, int ISBN, int memberID, int paymentAmt){
      
        try{
            Connection con= getCon();
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          LocalDate date = LocalDate.now();
          System.out.println(date);
            String q = "INSERT INTO PURCHASES "
                    + "(transactionID, ISBN, memberID, datePurchased, paymentAmt) VALUES "
                    + "("+transactionID +", "
                    +ISBN + ", "
                    +memberID + ", " + "'" + date + "'" + ", " + paymentAmt + ")"; 
            Statement stmt = con.createStatement();   
            System.out.println(q);
            stmt.execute(q);
			con.close();
                        return true;

		}catch(Exception e){System.out.println(e);
                return false;
                }         
    }
    
    
    
}
