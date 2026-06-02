package Jobsheet15;

public class Book03 {
    public String isbn;
    public String title;

    public Book03() {
    }

    public Book03(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN:" + this.isbn + ", Title:" + this.title;
    }
}