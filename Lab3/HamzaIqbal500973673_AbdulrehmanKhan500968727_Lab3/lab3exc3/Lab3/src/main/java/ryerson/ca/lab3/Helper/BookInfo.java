/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Helper;

import java.util.Date;

/**
 *
 * @author student
 */
public class BookInfo {
        
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private  boolean available;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    String bookName;
    String bookAuthor;

    /*
    To be completed
     */
    public BookInfo(String bookName, String bookAuthor, boolean available) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.available=available;
} 
}

