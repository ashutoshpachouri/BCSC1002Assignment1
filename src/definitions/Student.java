/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int booksIssuedByStudent;
    private String[] book;

    public Student() {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.booksIssuedByStudent = booksIssuedByStudent;
        this.book = new String[5];
        this.book[0] = "hello";
        this.book[1] = "hello";
        this.book[2] = "hello";
        this.book[3] = "hello";
        this.book[4] = "hello";
    }
    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int booksIssuedByStudent){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.booksIssuedByStudent = booksIssuedByStudent;
        this.book = new String[5];
       /* this.book[0] = "hello";
        this.book[1] = "hello";
        this.book[2] = "hello";
        this.book[3] = "hello";
        this.book[4] = "hello";
        */
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public  String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName = lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public long getUniversityRollNumber(){
        return universityRollNumber = universityRollNumber;
    }
    public void setUniversityRollNumber(long universityRollNumber){
        this.universityRollNumber = universityRollNumber;
    }
    public int getBooksIssuedByStudent(){
        return booksIssuedByStudent = booksIssuedByStudent;
    }
    public void setBooksIssuedByStudent(int booksIssuedByStudent){
        this.booksIssuedByStudent = booksIssuedByStudent;
    }
    public String[] getBook(){
        return book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", booksIssuedByStudent=" + booksIssuedByStudent +
                ", book=" + Arrays.toString(book) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getBooksIssuedByStudent() == student.getBooksIssuedByStudent() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getBook(), student.getBook());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(),getMiddleName(),getLastName(),getUniversityRollNumber(),getBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getBook());
        return result;
    }
    public void bookIssuedbyStudent(){
        for (String book : this.book)
            if ( book != null){
                System.out.println(book);
            }
    }
    public void reuturnPerviouslyIssuedBook() {
        for (String book : this.book) {
            if (book != null) {
                System.out.println(book);
            }
        }
        /*System.out.println("enter the book name:");
        Student name = new Student();
        System.out.println(name.getBook());
        System.out.println("thank you for returning book : ");
        */
    }
}
