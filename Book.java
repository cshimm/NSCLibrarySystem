/**
 * Book: A media item that has a title, author, IBSN number and
 * a boolean field indicates whether it is part of the NSC Collection.
 */
public class Book implements Media {

    private final String title;
    private final String author;
    private final String IBSN;
    private final boolean NSCCollection;
    public Book(String title, String author, String IBSN, boolean NSCCollection){
        this.title = title;
        this.author = author;
        this.IBSN = IBSN;
        this.NSCCollection = NSCCollection;
    }

    /**
     * Print the details about the Book to the console.
     */
    @Override
    public void printDetails() {
        System.out.println("Book details: " +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nIBSN: " + IBSN +
                "\nIn NSC Collection: " + NSCCollection);
    }
}
