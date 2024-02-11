/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Buisness;

import ryerson.ca.lab3.Helper.BookAdd;
import ryerson.ca.lab3.Persistance.BookAdd_CRUD;

//import ryerson.ca.lab3.Persistance.BookAdd_CRUD;

/**
 *
 * @author student
 */
public class AddBook {
        
    public BookAdd getBook(int isbn, int rating, int price, String author, String title, String category) {
        BookAdd bs = new BookAdd( isbn, rating, price, author,title,category);
            //BookAdd bs=BookAdd_CRUD.addBook(isbn,rating, price,author, title, category);
           //BookAdd_CRUD.addBook(isbn, rating, price, author, title, category);
        return (bs);
    }
    
}

