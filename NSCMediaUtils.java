/**
 * The NSCMediaUtils class provides utility methods for handling media objects.
 * It contains a method to print the details of a Media object.
 */
public class NSCMediaUtils {

    /**
     * Prints the details of a Media object and adds a visual separator.
     *
     * @param mediaObj The Media object whose details need to be printed.
     */
    public static void printMediaDetails(Media mediaObj) {
        mediaObj.printDetails();
        System.out.println("-----------------------");
    }
}
