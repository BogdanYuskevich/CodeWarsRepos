package EasyLvlKatas;

public class scrambleClass {
    public static boolean scramble(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count < 0) {
                return false;
            }
        }

        return true;
    }
}
