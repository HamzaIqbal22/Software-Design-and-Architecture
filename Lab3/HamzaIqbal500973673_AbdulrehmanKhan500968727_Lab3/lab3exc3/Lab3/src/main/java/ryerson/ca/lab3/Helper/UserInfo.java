/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Helper;

import java.util.ArrayList;
import ryerson.ca.lab3.Persistance.Member_CRUD;
/**
 *
 * @author student
 */
public class UserInfo {
    /*to be completed
    For now, we just add book info to make the example work. This class must be completed in future
    */
    String fname;
    String lname;
    String city; 
    String street; 
    String postalcode;
    String province;
    String user;
    String pass;
    
    public UserInfo (){}
    
    public UserInfo ( String user, String pass) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.street = street;
        this.postalcode = postalcode;
        this.province = province; 
        this.user=user;
        this.pass=pass;        
    
    }
    
    private ArrayList <UserInfo> member = new ArrayList<>();     
    private ArrayList <UserInfo> admin = new ArrayList<>();
        
    public String getusername(){
         return user;
    }
    
    public void setUsername (String username){
        this.user = username;
    }
    
    public void setPassword (String password){
        this.pass = password;
    }
    
    public String getpassword(){
         return pass;
    }
    public String getname (){
        return fname + lname;    
    } 
    
    public String getaddress (){
        return street + postalcode + city + province;
    } 
    
    
    private ArrayList <BookInfo> books = new ArrayList<>();
    public void addBook(BookInfo book){
        books.add(book);
    }
    public ArrayList<BookInfo> getBook(){
        return books;
    }
    
}