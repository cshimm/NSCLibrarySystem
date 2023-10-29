public class Book implements Media {

    String title;
    String author;
    String IBSN;
    boolean NSCCollection;
    public Book(String title, String author, String IBSN, boolean NSCCollection){
        this.title = title;
        this.author = author;
        this.IBSN = IBSN;
        this.NSCCollection = NSCCollection;
    }

    @Override
    public void printDetails() {
        System.out.println("Book details: " +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nIBSN: " + IBSN +
                "\nIn NSC Collection: " + NSCCollection);
    }
}
