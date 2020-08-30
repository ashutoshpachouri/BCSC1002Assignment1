/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumberOfBook;

    public Book() {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }
    public Book(String bookName, String authorName, String ISBNNumberOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getISBNNumberOfBook() {
        return ISBNNumberOfBook;
    }

    public void setISBNNumberOfBook(String ISBNNumberOfBook) {
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }
    @Override
    public String toString(){
        return
                "bookName='" + bookName + '\'' +
                        ",authorName='" + authorName + '\'' +
                        ",ISBNNumberOfBook'" + ISBNNumberOfBook + '\'';
    }
}
