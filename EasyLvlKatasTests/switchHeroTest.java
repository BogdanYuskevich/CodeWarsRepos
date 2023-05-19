package EasyLvlKatasTests;

import EasyLvlKatas.switchHeroClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class switchHeroTest {
    @Test
    public void testSomething() {
        assertEquals("abc", switchHeroClass.switcheroo( "bac"));
        assertEquals("ccc",switchHeroClass.switcheroo("ccc"));
        assertEquals("aaabcccbaaa",switchHeroClass.switcheroo("bbbacccabbb"));
    }
}
