import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book();
    }

    @Test
    public void canCountStock() {
        assertEquals(0, library.countStock());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.countStock());
    }

    @Test
    public void hasMaxCapacity() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(10, library.countStock());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        assertEquals(1, library.countStock());
        library.removeBook();
        assertEquals(0, library.countStock());
    }
}
