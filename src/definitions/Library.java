/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String[] Book;

    public Library(String[] Book){
        this.Book = new String[5];
    }
    public Library() {
        this.Book = new String[5];
        this.Book[0] = "issue the book";
        this.Book[1] = "issue the book";
        this.Book[2] = "issue the book";
        this.Book[3] = "issue the book";
        this.Book[4] = "issue the book";
    }
    public String[] getBook(){
        return Book.clone();
    }

    public void setBook(String[] book) {
        this.Book = book;
    }
    @Override
    public String toString() {
        return Arrays.toString(Book);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library)o;
        return Arrays.equals(getBook(),library.getBook());
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(getBook());
    }
    public void listInventory(){
        for (String Book : this.Book){
            if (Book != null){
                System.out.println(Book);
            }
        }
    }
}
