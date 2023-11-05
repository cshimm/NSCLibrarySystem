/**
 * DVD: A media item that has a title, duration, genre and
 * a boolean field indicates whether it is part of the NSC Collection.
 */
public class DVD implements Media {
    private final String title;
    private final String duration;
    private final String genre;
    private final boolean NSCCollection;

    public DVD(String title, String duration, String genre, boolean NSCCollection) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.NSCCollection = NSCCollection;
    }

    /**
     * Print the details about the DVD to the console.
     */
    @Override
    public void printDetails() {
        System.out.println("DVD details: " +
                "\nTitle: " + title +
                "\nDuration: " + duration +
                "\nGenre: " + genre +
                "\nIn NSC Collection: " + NSCCollection);
    }
}
