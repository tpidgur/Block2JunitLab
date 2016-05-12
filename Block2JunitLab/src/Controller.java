import java.util.Scanner;

/**
 * Class controller can send commands to the model to update the model's state.
 * It can also send commands to its associated view to change the view's presentation of the model
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 12.05.16)
 */
public class Controller {
    /**
     * The {@code Model} and  {@code View} represent the instances of the mentioned classes
     * in order to involve model and view objects in Controller class
     */
    Model model;
    View view;

    /**
     * Constructs a new {@code Controller} through initialization of  instances of Model2 and View classes
     *
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method

    /**
     * The method sends commands after the correct value has been entered by user.
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setValue(inputIntValueWithScanner(sc));
        view.printMessage(View.REVERSE_VALUE + model.getReverseValue());
        view.printMessage(View.NATURAL_LOGARITHM + model.findNaturalLogarithm());
    }

    // The Utility methods

    /**
     * Checks whether the entered value is an integer and belongs to the required three-digit range
     *
     * @param sc opens the read stream from the console
     * @return the integer value
     */

    public int inputIntValueWithScanner(Scanner sc) {
        int res = 0;
        view.printMessage(View.INPUT_INT_DATA +
                GlobalConstants.PRIMARY_MIN_BARRIER + "-" + GlobalConstants.PRIMARY_MAX_BARRIER);

        while (true) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= GlobalConstants.PRIMARY_MIN_BARRIER ||
                    res >= GlobalConstants.PRIMARY_MAX_BARRIER) {
                view.printMessage(View.WRONG_RANGE_DATA
                        + View.INPUT_INT_DATA);
                continue;
            }
            break;
        }
        return res;
    }
}
