/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Persistance;

/**
 *
 * @author student
 */
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
public class BookAdd_CRUD {
    private static Connection getCon(){
    Connection con=null;
     try{
         
         Class.forName("com.mysql.cj.jdbc.Driver");
        //con=DriverManager.getConnection("jdbc:mysql://db:3306/hold_LBS?allowPublicKeyRetrieval=true&useSSL=false", "root", "student");
       
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBookstore?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "student");
        System.out.println("Connection established.");
     }
     catch(Exception e){ System.out.println(e);}
     return con;
    }
    
    
    
    public static boolean addBook(int ISBN, int Rating, int Price, String Author, String Title, String Category){
      
        try{
            Connection con= getCon();
          //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // LocalDate date = LocalDate.now();
            String q = "INSERT INTO BOOK "
                    + "(ISBN, Rating, Price, Author , Title, Category) values "
                    + "("+ISBN+", "
                    +Rating+", "
                    +Price + ", " + "' " +Author + " '" + ", " + " ' " + Title + " '" +", " +"' " + Category + " ' "+ ")";
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
