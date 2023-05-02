package EasyLvlKatas;

public class binary {

    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        String binaryString = Integer.toBinaryString(sum);
        return binaryString;
    }
}