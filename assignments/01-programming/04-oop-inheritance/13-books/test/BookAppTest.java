import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BookAppTest {

    @Test
    void testBookAppExecution() {
        assertDoesNotThrow(() -> {
            BookApp.main(new String[]{});
        });
    }

    @Test
    void testBookCreation() {
        Book book = new Book("Test Book", 2020, "Test Author");
        assertNotNull(book);
        assertEquals("Test Book", book.getTitle());
    }

    @Test
    void testPrintBookCreation() {
        PrintBook printBook = new PrintBook("Test", 2020, "Author", "Publisher", "ISBN-123");
        assertNotNull(printBook);
        assertTrue(printBook.toString().contains("Publisher"));
    }

    @Test
    void testAudioBookCreation() {
        AudioBook audioBook = new AudioBook("Test", 2020, "Author", 100.0, 120, "Narrator");
        assertNotNull(audioBook);
        assertTrue(audioBook.toString().contains("Narrator"));
    }
}
