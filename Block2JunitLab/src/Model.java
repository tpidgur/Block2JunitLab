/**
 * In this class the program logic is demonstrated.
 * This class writes the three-digit number in the reverse order and calculates the natural logarithm
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 12.05.16)
 */
public class Model {
    /**
     * the initial value for which the reverse ordering will be found
     */
    private int value;

    /**
     * @return the units of the initial value {@code int}
     */
    public int getUnits() {
        return value / 100;
    }

    /**
     * @return the decades of the initial value {@code int}
     */
    public int getDecades() {
        return (value % 100) / 10;
    }

    /**
     * @return the hundreds of the initial value {@code int}
     */
    public int getHundreds() {
        return (value % 100) % 10;
    }

    /**
     * @return the the initial value in reverse order {@code int}
     */
    public int getReverseValue() {
        return (getHundreds() * 100 + getDecades() * 10 + getUnits() * 1);
    }

    /**
     * @return finds the natural logarithm of the reverse value {@code int}
     */
    public double findNaturalLogarithm() {
        return java.lang.Math.log(getReverseValue());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
