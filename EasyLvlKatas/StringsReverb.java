package EasyLvlKatas;

public class StringsReverb {
    public static String spinWords(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() >= 5) {
                result.append(new StringBuilder(word).reverse().toString()).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }
}
