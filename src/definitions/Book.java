/*  Created by IntelliJ IDEA.
 *  User:Ashutosh Pachouri
 *  Date: 30/08/20
 *  Time: 4:25 PM
 *  File Name : Book.java
 * */
package definitions;
import java.util.Objects;
public class Book {
    private String nameOfTheBook;
    private String nameOfTheAuthorOfTheBook;
    private String thirteenDigitISBNNumberOfTheBook;

    // Parameterized Constructor
    public Book(String nameOfTheBook, String nameOfTheAuthorOfTheBook, String thirteenDigitISBNNumberOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }
    // Non-Parameterized Constructor
    public Book() {
        this.nameOfTheBook = null;
        this.nameOfTheAuthorOfTheBook = null;
        this.thirteenDigitISBNNumberOfTheBook = null;
    }
    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public String getNameOfTheAuthorOfTheBook() {
        return nameOfTheAuthorOfTheBook;
    }

    public void setNameOfTheAuthorOfTheBook(String nameOfTheAuthorOfTheBook) {
        this.nameOfTheAuthorOfTheBook = nameOfTheAuthorOfTheBook;
    }

    public String getThirteenDigitISBNNumberOfTheBook() {
        return thirteenDigitISBNNumberOfTheBook;
    }

    public void setThirteenDigitISBNNumberOfTheBook(String thirteenDigitISBNNumberOfTheBook) {
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }
    @Override
    public String toString() {
        return "Book Name: " + getNameOfTheBook() + ", " +
                "Author Name: " + getNameOfTheAuthorOfTheBook() + ", " +
                "13-Digit ISBN Number: " + getThirteenDigitISBNNumberOfTheBook() + ".";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfTheBook(), book.getNameOfTheBook()) &&
                Objects.equals(getNameOfTheAuthorOfTheBook(), book.getNameOfTheAuthorOfTheBook()) &&
                Objects.equals(getThirteenDigitISBNNumberOfTheBook(), book.getThirteenDigitISBNNumberOfTheBook());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNameOfTheBook(), getNameOfTheAuthorOfTheBook(), getThirteenDigitISBNNumberOfTheBook());
    }
}

