public class Magazine implements Media {
    String title;
    int issueNumber;
    int month;
    boolean NSCCollection;
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Magazine(String title, int issueNumber, int month, boolean NSCCollection) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.month = month;
        this.NSCCollection = NSCCollection;
    }

    @Override
    public void printDetails() {
        System.out.println("Magazine details: " +
                "\nTitle: " + title +
                "\nIssue Number: " + issueNumber +
                "\nMonth: " + months[month] +
                "\nIn NSC Collection: " + NSCCollection);
    }

}
