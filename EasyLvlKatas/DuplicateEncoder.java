package EasyLvlKatas;

public class DuplicateEncoder {
    public static String encode(String word){
        word = word.toLowerCase();
        String encoded = "";
        for(char ch : word.toCharArray())
            encoded += (word.indexOf(ch) == word.lastIndexOf(ch))? "(" : ")";
        return encoded;
    }
}