abstract class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract void display();
}

class MyBook extends Book {
    int price;
    MyBook(String t, String a, int p) {
        super(t, a);
        price = p;
    }
    void display() {
        System.out.format("Title: %s", title).println();
        System.out.format("Author: %s", author).println();
        System.out.format("Price: %d", price);
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();
        Book book = new MyBook(title, author, price);
        book.display();
    }
}

