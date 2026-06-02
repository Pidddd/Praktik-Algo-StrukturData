package Jobsheet15;

import java.util.Stack;

public class StakDemo03 {
    public static void main(String[] args) {
        Book03 book1 = new Book03("1234", "Dasar Pemrograman");
        Book03 book2 = new Book03("7145", "Hafalah Shalat Delisa");
        Book03 book3 = new Book03("3562", "Muhammad Al-Fatih");

        Stack<Book03> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book03 temp = books.peek();
        if (temp != null) {
            System.out.println("Peek: " + temp.toString());
        }

        Book03 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println("Pop: " + temp2.toString());
        }

        System.out.println(books);
    }
}
