package EasyLvlKatas;

import java.util.HashMap;
import java.util.Map;

public class charCount {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}
