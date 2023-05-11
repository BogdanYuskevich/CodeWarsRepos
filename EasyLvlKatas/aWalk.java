package EasyLvlKatas;

public class aWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int x = 0;
        int y = 0;

        for (char way : walk) {
            switch (way) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
                default:
                    break;
            }
        }

        return x == 0 && y == 0;
    }
}
