import java.util.ArrayList;

/**
 * @param <T> The media type this container will be.
 *           NSCLibraryMediaContainer holds an array of media items that can be added to,
 *           removed from and displayed.
 */
public class NSCLibraryMediaContainer<T extends Media> {
    ArrayList<T> mediaItems;

    public NSCLibraryMediaContainer() {
        mediaItems = new ArrayList<>();
    }

    /**
     * @param item The media item to add
     * @return A boolean indicating if the item was successfully added to the array
     */
    boolean add(T item) {
        return mediaItems.add(item);
    }

    /**
     * @param item The media item to remove
     * @return A boolean indicating whether the removal from the array was successful or not
     */
    boolean remove(T item) {
        return mediaItems.remove(item);
    }

    /**
     * Displays each item in the console
     */
    void display() {
        for (T item : mediaItems) {
            NSCMediaUtils.printMediaDetails(item);
        }
    }
}
