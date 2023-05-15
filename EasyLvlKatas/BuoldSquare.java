package EasyLvlKatas;

public class BuoldSquare {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sb.append("\n");

            for (int i = 0; i < n; i++) {
                sb.append("+");
            }

        }
        return sb.toString().trim();
    }
}
