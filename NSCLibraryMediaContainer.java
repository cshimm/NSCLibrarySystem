import java.util.ArrayList;

public class NSCLibraryMediaContainer<T extends Media> {
    ArrayList<T> mediaItems;

    public NSCLibraryMediaContainer() {
        mediaItems = new ArrayList<>();
    }

    boolean add(T item) {
        return mediaItems.add(item);
    }

    boolean remove(T item) {
        return mediaItems.remove(item);
    }

    void display() {
        for (T item : mediaItems) {
            NSCMediaUtils.printMediaDetails(item);
        }
    }
}
