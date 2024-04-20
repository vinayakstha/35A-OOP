package javaoop.encapsulation;

class Book {
    private String bookTitle, authorName;
    private int pubYear;
    private boolean available = true;

    Book(String bookTitle, String authorName, int pubYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.pubYear = pubYear;
    }

    public void updateInfo(String bookTitle, String authorName, int pubYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.pubYear = pubYear;
    }

    public void getInfo() {
        System.out.println("----------------------------------");
        System.out.println("Title: " + this.bookTitle + "\n" + "Author: "
                + this.authorName + "\n" + "Published year: "
                + this.pubYear + "\n" + "Available: " + this.available);
        System.out.println("------------------------------------");
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(this.bookTitle + " has been sucessfully borrowed.");
        } else {
            System.out.println("Sorry the book is not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(this.bookTitle + " has been returned sucessfully.");
        } else {
            System.out.println("You have to borrow the book to return it.");
        }
    }
}

public class Task2 {
    /*
     * 2. You are developing a library management system and need to implement a
     * Book class. The Book class should have private instance variables for the
     * book title, author name, and publication year. Implement appropriate getter
     * and setter methods to ensure encapsulation. Additionally, include a private
     * variable to track the availability of the book (e.g., true if available,
     * false if borrowed), and provide a public method to borrow the book, updating
     * its availability status.
     * 
     */
    public static void main(String[] args) {
        Book b1 = new Book("hell0", "Vinayak", 2020);
        b1.getInfo();
        b1.borrowBook();
        b1.getInfo();
        b1.returnBook();
    }
}
