import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Noughts and Crosses", "Malorie Blackman", "Action, Adventure, Romance");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Noughts and Crosses", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Malorie Blackman", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Action, Adventure, Romance", book.getGenre());
    }
}
