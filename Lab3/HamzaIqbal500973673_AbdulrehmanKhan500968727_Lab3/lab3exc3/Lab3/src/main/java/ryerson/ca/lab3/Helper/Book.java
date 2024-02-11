
package ryerson.ca.lab3.Helper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author student
 */
@XmlRootElement(name = "Book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    
    private String isbn; 
    private String title;
    private String barcode;
    ArrayList<Seller> author ;

    
      public Book(String isbn, String title, String barcode, Seller author) {
        this.isbn = isbn;
        this.title = title;
        this.barcode = barcode;
        this.author= new ArrayList<Seller>();
        this.author.add(new Seller(author.getFirstName(), author.getLastName()));
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getBarcode() {
        return barcode;
    }
    public ArrayList<Seller> getAuthors() {
        return author;
    }
     public void addAuthor(ArrayList<Seller> authors) {
         for(Seller a:authors){
        this.author.add(new Seller(a.getFirstName(),a.getLastName()));
         }
    }
    /*@Override
    public int hashCode() {
        return (Objects.hash(isbn));
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EBook other = (EBook) obj;
        if (isbn.equals(other.isbn))
            return true;
        else return (false);
        
    }*/

}
