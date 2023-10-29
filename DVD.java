public class DVD implements Media {
    String title;
    String duration;
    String genre;
    boolean NSCCollection;

    public DVD(String title, String duration, String genre, boolean NSCCollection) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.NSCCollection = NSCCollection;
    }

    @Override
    public void printDetails() {
        System.out.println("DVD details: " +
                "\nTitle: " + title +
                "\nDuration: " + duration +
                "\nGenre: " + genre +
                "\nIn NSC Collection: " + NSCCollection);
    }
}
