package EasyLvlKatasTests;

import EasyLvlKatas.StringsReverb;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTests {
    @Test
    public void test() {
        assertEquals("emocleW",  StringsReverb.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", StringsReverb.spinWords("Hey fellow warriors"));
    }

}