/**
 * A view generates an output presentation to the user based on changes in the model.
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 12.05.16)
 */

public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value in range: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WRONG_RANGE_DATA = "Wrong range! Repeat please! ";
    public static final String REVERSE_VALUE = "The reverse value is = ";
    public static final String NATURAL_LOGARITHM = "The natural logarithm of the reverse value is = ";


    /**
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void concatenationAndPrint(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        printMessage(new String(concatString));
        }
}
