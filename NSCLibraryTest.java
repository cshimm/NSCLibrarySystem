import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NSCLibraryTest {
    Book book = new Book("Book1", "Author1", "1234", true);
    DVD dvd = new DVD("DVD1", "1", "Genre1", true);
    Magazine magazine = new Magazine("Magazine1", 1, 11, true);

    @Test
    void test_bookContainer() {
        NSCLibraryMediaContainer<Book> container = new NSCLibraryMediaContainer<>();
        assertNotNull(container);
    }

    @Test
    void test_DVDContainer() {
        NSCLibraryMediaContainer<DVD> container = new NSCLibraryMediaContainer<>();
        assertNotNull(container);
    }

    @Test
    void test_MagazineContainer() {
        NSCLibraryMediaContainer<Magazine> container = new NSCLibraryMediaContainer<>();
        assertNotNull(container);
    }

    @Test
    void test_removeItem() {
        NSCLibraryMediaContainer<Media> container = new NSCLibraryMediaContainer<>();
        container.add(book);
        boolean result = container.remove(book);
        assertTrue(result);
    }

    @Test
    void test_removeItemNotPresent() {
        NSCLibraryMediaContainer<Media> container = new NSCLibraryMediaContainer<>();
        boolean result = container.remove(book);
        assertFalse(result);
    }
    @Test
    void test_addItem() {
        NSCLibraryMediaContainer<Media> container = new NSCLibraryMediaContainer<>();
        boolean result = container.add(book);
        assertTrue(result);
    }

    @Test
    void test_display() {
        NSCLibraryMediaContainer<Media> container = new NSCLibraryMediaContainer<>();
        container.add(book);
        container.add(dvd);
        container.add(magazine);
        container.display();
    }
}
