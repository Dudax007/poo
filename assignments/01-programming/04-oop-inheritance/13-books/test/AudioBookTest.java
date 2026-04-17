import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AudioBookTest {
    private AudioBook audioBook;

    @BeforeEach
    void setUp() {
        audioBook = new AudioBook(
            "To Kill a Mockingbird",
            1960,
            "Harper Lee",
            256.5,
            480,
            "Reese Witherspoon"
        );
    }

    @Test
    void testAudioBookCreation() {
        assertEquals("To Kill a Mockingbird", audioBook.getTitle());
        assertEquals(1960, audioBook.getYear());
        assertEquals("Harper Lee", audioBook.getAuthor());
        assertEquals(256.5, audioBook.getFileSizeInMB(), 0.01);
        assertEquals(480, audioBook.getPlayLengthInMinutes());
        assertEquals("Reese Witherspoon", audioBook.getNarrator());
    }

    @Test
    void testAudioBookToString() {
        String result = audioBook.toString();
        assertTrue(result.contains("Title: To Kill a Mockingbird"));
        assertTrue(result.contains("Author: Harper Lee"));
        assertTrue(result.contains("Year: 1960"));
        assertTrue(result.contains("File Size: 256.50 MB"));
        assertTrue(result.contains("Length: 480 minutes"));
        assertTrue(result.contains("Narrator: Reese Witherspoon"));
    }

    @Test
    void testAudioBookInheritance() {
        assertNotNull(audioBook.getTitle());
        assertNotNull(audioBook.getAuthor());
        assertTrue(audioBook.getYear() > 0);
    }

    @Test
    void testAudioBookFileSizeAndLength() {
        assertTrue(audioBook.getFileSizeInMB() > 0);
        assertTrue(audioBook.getPlayLengthInMinutes() > 0);
    }
}
