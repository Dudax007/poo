import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald");
    }

    @Test
    void testBookCreation() {
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals(1925, book.getYear());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
    }

    @Test
    void testBookToString() {
        String expected = "Title: The Great Gatsby | Author: F. Scott Fitzgerald | Year: 1925";
        assertEquals(expected, book.toString());
    }

    @Test
    void testGetters() {
        assertNotNull(book.getTitle());
        assertNotNull(book.getAuthor());
        assertTrue(book.getYear() > 0);
    }
}
