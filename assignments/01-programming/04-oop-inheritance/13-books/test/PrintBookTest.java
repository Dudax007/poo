import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintBookTest {
    private PrintBook printBook;

    @BeforeEach
    void setUp() {
        printBook = new PrintBook(
            "Java: How to Program, Early Objects",
            2017,
            "Paul Deitel and Harvey Deitel",
            "Pearson",
            "978-0-13-474335-6"
        );
    }

    @Test
    void testPrintBookCreation() {
        assertEquals("Java: How to Program, Early Objects", printBook.getTitle());
        assertEquals(2017, printBook.getYear());
        assertEquals("Paul Deitel and Harvey Deitel", printBook.getAuthor());
        assertEquals("Pearson", printBook.getPublisher());
        assertEquals("978-0-13-474335-6", printBook.getIsbn());
    }

    @Test
    void testPrintBookToString() {
        String result = printBook.toString();
        assertTrue(result.contains("Title: Java: How to Program, Early Objects"));
        assertTrue(result.contains("Author: Paul Deitel and Harvey Deitel"));
        assertTrue(result.contains("Year: 2017"));
        assertTrue(result.contains("Publisher: Pearson"));
        assertTrue(result.contains("ISBN: 978-0-13-474335-6"));
    }

    @Test
    void testPrintBookInheritance() {
        assertNotNull(printBook.getTitle());
        assertNotNull(printBook.getAuthor());
        assertTrue(printBook.getYear() > 0);
    }
}
