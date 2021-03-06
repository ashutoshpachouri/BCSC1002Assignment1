/*  Created by IntelliJ IDEA.
 *  User: Ashutosh Pachouri
 *  Date: 30/08/20
 *  Time: 4:25 PM
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

    public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    public void setBooksThatAreCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }
    @Override
    public String toString() {
        return Arrays.toString(booksThatAreCurrentlyAvailable);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksThatAreCurrentlyAvailable(), library.getBooksThatAreCurrentlyAvailable());
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksThatAreCurrentlyAvailable());
    }

    public void setBooksInLibrary() {
        booksThatAreCurrentlyAvailable[0].setNameOfTheBook("Engineering Mathematics");
        booksThatAreCurrentlyAvailable[0].setNameOfTheAuthorOfTheBook("H. K. Das");
        booksThatAreCurrentlyAvailable[0].setThirteenDigitISBNNumberOfTheBook("975283653000");
        booksThatAreCurrentlyAvailable[1].setNameOfTheBook("Operating System");
        booksThatAreCurrentlyAvailable[1].setNameOfTheAuthorOfTheBook("Galvin");
        booksThatAreCurrentlyAvailable[1].setThirteenDigitISBNNumberOfTheBook("9753062012000");
        booksThatAreCurrentlyAvailable[2].setNameOfTheBook("Database Management System");
        booksThatAreCurrentlyAvailable[2].setNameOfTheAuthorOfTheBook("Raghu Ramkrishnan");
        booksThatAreCurrentlyAvailable[2].setThirteenDigitISBNNumberOfTheBook("9789332582705");
        booksThatAreCurrentlyAvailable[3].setNameOfTheBook("Fundamental of Software Engineering");
        booksThatAreCurrentlyAvailable[3].setNameOfTheAuthorOfTheBook("Rajib Mall");
        booksThatAreCurrentlyAvailable[3].setThirteenDigitISBNNumberOfTheBook("9789388028028");
        booksThatAreCurrentlyAvailable[4].setNameOfTheBook("Core JAVA");
        booksThatAreCurrentlyAvailable[4].setNameOfTheAuthorOfTheBook("Dr. R. Nageswara Rao");
        booksThatAreCurrentlyAvailable[4].setThirteenDigitISBNNumberOfTheBook("9751199258111");
    }

    public void showAvailableBooks() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("|%-36s %-21s %-21s|\n", "Book Name", "Author Name", "13-Digit ISBN Number");
        System.out.println("----------------------------------------------------------------------------------");
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_BOOKS_IN_LIBRARY; libraryIndex++) {
            System.out.printf("|%-36s %-21s %-21s|\n", booksThatAreCurrentlyAvailable[libraryIndex].getNameOfTheBook(), booksThatAreCurrentlyAvailable[libraryIndex].getNameOfTheAuthorOfTheBook(), booksThatAreCurrentlyAvailable[libraryIndex].getThirteenDigitISBNNumberOfTheBook());
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}
