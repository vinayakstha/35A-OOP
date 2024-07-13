public class BookClass {
    public static void main(String[] args) {
        Book b1 = new Book(100);
        Book b2 = new Book(999);
        b1.setName("I am gay");
        b1.setAuthor("Sagar Lama");
        b1.publication = "lgtv publication";
        b1.year = "2022";
        System.out.println("Title: " + b1.getName() + "\nAuthor: " + b1.getAuthor() + "\nPublication: " + b1.publication
                + "\nYear: " + b1.year + "\nPrice: " + b1.getPrice() + "\n");

        b2.setName("hello");
        b2.setAuthor("Vinayak Shrestha");
        b2.publication = "sigma publication";
        b2.year = "2023";
        System.out.println("Title: " + b2.getName() + "\nAuthor: " + b2.getAuthor() + "\nPublication: " + b2.publication
                + "\nYear: " + b2.year + "\nPrice: " + b2.getPrice() + "\n");
    }
}

class Book {
    private String author, name;
    private int price;
    public String publication, year;

    Book(int price) {
        this.price = price;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAuthor() {
        return this.author;
    }

    String getName() {
        return this.name;
    }

    int getPrice() {
        return this.price;
    }
}