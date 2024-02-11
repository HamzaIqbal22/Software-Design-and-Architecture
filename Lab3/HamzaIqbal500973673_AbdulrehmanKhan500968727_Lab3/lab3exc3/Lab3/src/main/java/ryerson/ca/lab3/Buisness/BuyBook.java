/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.lab3.Buisness;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.lab3.Helper.BookInfo;
import ryerson.ca.lab3.Helper.BookPurchase;

//import ryerson.ca.

/**
 *
 * @author student
 */
public class BuyBook {
    public BookPurchase getBook(int transactionID, int ISBN, int memberID, int paymentAmt) {
        BookPurchase bs = new BookPurchase( transactionID, ISBN, memberID, paymentAmt);
        return (bs);
    }


}



