import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Book> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Book> stock) {
        this.stock = stock;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stock.size() < capacity)
        this.stock.add(book);
    }

    public Book removeBook() {
        return this.stock.remove(0);
    }
}
