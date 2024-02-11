/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Persistance;

import ryerson.ca.lab3.Helper.UserInfo; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author hamza iqbal
 */
public class Member_CRUD {
    private static Connection getCon(){
        
        Connection con = null;
        
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hold_LBS?autoReconnect=true&useSSL=false", "root", "student");
            System.out.println("Connection established.");
        }
    catch(Exception e){ System.out.println(e);}
    return con;    
    }
    public String jsp;
    
    
    
    public boolean checkMember(UserInfo uf){
      
        boolean isCorrect = false; 
        
        try{
            Connection con= getCon();
          //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            // LocalDate date = LocalDate.now();
            String q = "SELECT* FROM MEMBER WHERE username = " + uf.getusername() + " AND password = " + uf.getpassword() + ";";
             
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, uf.getusername());
            ps.setString(2, uf.getpassword());
            
            ResultSet rs = ps.executeQuery();
            isCorrect = rs.next();
        }    
        catch (Exception e){
                
            System.out.println (e);
        }
        return isCorrect;
            /*     
            Statement stmt = con.createStatement();   
            System.out.println(q);
            stmt.execute(q);
			con.close();
                        return true;

        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }         
    */
    }
    
}

