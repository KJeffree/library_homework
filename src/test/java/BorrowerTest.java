import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library(200);
        book = new Book("Noughts and Crosses", "Malorie Blackman", "Action");
        borrower = new Borrower();
        library.addBook(book);
    }

    @Test
    public void canCheckBorrowerCollection() {
        assertEquals(0, borrower.checkCollectionSize());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.checkCollectionSize());
    }

    @Test
    public void canBorrowBookFromLibrary() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.checkCollectionSize());
        assertEquals(0, library.checkBookStock());
    }
}
