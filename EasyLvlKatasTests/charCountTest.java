package EasyLvlKatasTests;

import EasyLvlKatas.charCount;
import org.junit.Test;
import org.junit.jupiter.api.Order;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class charCountTest {
    @Test
    @Order(1)
    public void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, charCount.count(""));
    }

    @Test
    @Order(2)
    public void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, charCount.count("a"));
    }

    @Test
    @Order(3)
    public void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, charCount.count("aabbbac"));
    }

    @Test
    @Order(4)
    public void testAllCharactersUnique() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);
        assertEquals(d, charCount.count("abc"));
    }

    @Test
    @Order(5)
    public void testAllCharactersSame() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 5);
        assertEquals(d, charCount.count("aaaaa"));
    }

    @Test
    @Order(6)
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = charCount.count("aabb");
        assertEquals(expected, actual);
    }

}
