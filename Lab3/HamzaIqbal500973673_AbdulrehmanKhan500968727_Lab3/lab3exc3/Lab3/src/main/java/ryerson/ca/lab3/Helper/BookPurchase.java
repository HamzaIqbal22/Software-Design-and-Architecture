/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Helper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.lab3.Persistance.BookPurchase_CRUD;

/**
 *
 * @author student
 */
 @XmlRootElement(name = "book")
 @XmlAccessorType(XmlAccessType.FIELD)
public class BookPurchase {
    
    private int ISBN; 
    private int transactionID;
    private int memberID;
    private int paymentAmt;
    
            
    public BookPurchase(int transactionID, int ISBN, int memberID, int paymentAmt) {
        this.transactionID = transactionID;
        this.ISBN = ISBN;
        this.memberID = memberID;
        this.paymentAmt =  paymentAmt;
        
        BookPurchase_CRUD.addPurchasedBook(transactionID, ISBN, memberID, paymentAmt);
    }
  
    public BookPurchase() {
        this.transactionID = 0;
        this.ISBN = 0;
        this.memberID = 0;
        this.paymentAmt = 0;
    
        BookPurchase_CRUD.addPurchasedBook(transactionID, ISBN, memberID, paymentAmt);
    }
 
    public int getIsbn() {
        return ISBN;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public int getMemberID() {
        return memberID;
    }
    
    public int getPaymentAmt() {
        return paymentAmt;
    }
 }
