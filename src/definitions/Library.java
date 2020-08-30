/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
public class Library {
    private static final int MAXIMUM_BOOKS_IN_LIBRARY = 5;
    private Book[] booksThatAreCurrentlyAvailable;

    // Parameterized Constructor
    public Library(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    // Non-Parameterized Constructor
    public Library() {
        this.booksThatAreCurrentlyAvailable = new Book[MAXIMUM_BOOKS_IN_LIBRARY];
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            this.booksThatAreCurrentlyAvailable[libraryIndex] = new Book();
        }
    }
}