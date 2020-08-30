/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;
public class Student {
    private static final int MAXIMUM_BOOKS_STUDENT_CAN_ISSUE = 5;
    private String nameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] namesOfTheBooksIssuedByTheStudent;

    public Student(String nameOfTheStudent, long universityRollNumberOfTheStudent, int numberOfBooksIssuedByTheStudent, Book[] namesOfTheBooksIssuedByTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
        this.namesOfTheBooksIssuedByTheStudent = namesOfTheBooksIssuedByTheStudent;
    }
    public Student() {
        this.nameOfTheStudent = "";
        this.universityRollNumberOfTheStudent = 0L;
        this.numberOfBooksIssuedByTheStudent = 0;
        this.namesOfTheBooksIssuedByTheStudent = new Book[MAXIMUM_BOOKS_STUDENT_CAN_ISSUE];
        for (int initializingBook = 0; initializingBook < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; initializingBook++) {
            this.namesOfTheBooksIssuedByTheStudent[initializingBook] = new Book();
        }
    }
}