package EasyLvlKatas;

public class Square {
    public static boolean isSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}