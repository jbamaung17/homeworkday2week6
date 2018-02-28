import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Hetty");
        book = new Book("The Borrowers", "Mary Norton");
        library = new Library(10);

    }

    @Test
    public void countBorrowerCollection() {
        assertEquals(0, borrower.collectionNumber());
    }

    @Test
    public void canAddBook() {
        borrower.addBookBorrower(library);
        assertEquals(1, borrower.collectionNumber());
    }

    @Test
    public void borrowerCanBorrowBookFromLibrary() {
        library.addBook(book);
        assertEquals(1, library.countStock());
        library.removeBook();
        assertEquals(0, library.countStock());
        assertEquals(0, borrower.collectionNumber());
        borrower.addBookBorrower(library);
        assertEquals(1, borrower.collectionNumber());
    }
}
