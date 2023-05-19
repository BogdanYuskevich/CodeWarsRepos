package EasyLvlKatas;

public class switchHeroClass {
    public static String switcheroo(String x) {
        char[] chars = x.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b';
            } else if (chars[i] == 'b') {
                chars[i] = 'a';
            }
        }
        return new String(chars);
    }
}
