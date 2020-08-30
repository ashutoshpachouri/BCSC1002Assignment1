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
}
