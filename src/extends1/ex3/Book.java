package extends1.ex3;

public class Book extends Item{
    String author;
    int isbn;

    public Book(String name, int price, String author, int isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    public void print() {
        super.print();
        System.out.println("작가 : " + author + ", isbn : " + isbn);
    }
}
