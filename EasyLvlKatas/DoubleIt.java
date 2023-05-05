package EasyLvlKatas;

public class DoubleIt {
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
