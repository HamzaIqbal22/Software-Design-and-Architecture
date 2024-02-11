/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Helper;

/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import ryerson.ca.lab3.Persistance.BookAdd_CRUD;
        
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)

public class BookAdd {
    
    private int isbn; 
    private int rating;
    private int price;        
    private String author;
    private String title;
    private String category;
    
    public BookAdd(int isbn, int rating, int price, String author, String title, String category) {
        this.isbn = isbn;
        this.rating = rating;
        this.price = price;
        this.author = author;
        this.title = title;
        this.category = category;
        BookAdd_CRUD.addBook(isbn, rating, price, author, title, category);
    } 
  
    public BookAdd () {
        this.isbn = 0;
        this.rating = 0;
        this.price = 0;
        this.author = " ";
        this.title = " ";
        this.category = " ";
    BookAdd_CRUD.addBook(isbn, rating, price, author, title, category);
    }
   
    public int getIsbn() {
        return isbn;
    }
    
    public int getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    
    public String getCategory() {
        return category;
    }   
    
}

