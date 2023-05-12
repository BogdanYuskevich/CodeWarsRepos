package EasyLvlKatas;

public class CountDublicate {
    public static int duplicateCount(String text) {
        int[] frequency = new int[256];
        String lowercaseInput = text.toLowerCase();
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char c = lowercaseInput.charAt(i);
            frequency[c]++;
        }

        int count = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 1) {
                count++;
            }
        }

        return count;
    }
}
