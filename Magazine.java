/**
 * Magazine: A media item that has a title, issue number, month and
 * a boolean field indicates whether it is part of the NSC Collection.
 */
public class Magazine implements Media {
    private final String title;
    private final int issueNumber;
    private final int month;
    private final boolean NSCCollection;
    private final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Magazine(String title, int issueNumber, int month, boolean NSCCollection) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.month = month;
        this.NSCCollection = NSCCollection;
    }

    /**
     * Print the details about the Magazine to the console.
     */
    @Override
    public void printDetails() {
        System.out.println("Magazine details: " +
                "\nTitle: " + title +
                "\nIssue Number: " + issueNumber +
                "\nMonth: " + months[month] +
                "\nIn NSC Collection: " + NSCCollection);
    }

}
