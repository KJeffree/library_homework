import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book;
    private Library library;

    @Before
    public void before() {
        book = new Book("Noughts and Crosses", "Malorie Blackman", "Adventure");
        library = new Library(100);
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.checkBookStock());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.checkBookStock());
    }

    @Test
    public void doesNotAddBookIfCapacityIsFull() {
        library = new Library(5);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.checkBookStock());
    }

    @Test
    public void letsCustomerBorrowBook() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.checkBookStock());
    }

    @Test
    public void canAddBookToGenreHash(){
        library.addBook(book);
        assertEquals(1, library.checkGenreSize());
    }

    @Test
    public void canCheckNumberOfBooksInGenre() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.checkGenreStock("Adventure"));

    }

}
