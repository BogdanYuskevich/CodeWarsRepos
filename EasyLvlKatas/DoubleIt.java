package EasyLvlKatas;

/**
 * The type Double it.
 */
public class DoubleIt {
    /**
     * Square digits int.
     *
     * @param n the n
     * @return the int
     */
    public int squareDigits(int n) {
        char[] digitsArray = Integer.toString(n).toCharArray();
        String output = "";

        for (char digit : digitsArray) {
            n = Character.getNumericValue(digit);
            output +=  n*n;
        }

        return Integer.parseInt(output);
    }
}
