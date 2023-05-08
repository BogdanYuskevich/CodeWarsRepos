package EasyLvlKatasTests;

import EasyLvlKatas.DoubleIt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoudbleItTest {
    @Test
    public void test() {
        assertEquals(811181, new DoubleIt().squareDigits(9119));
        assertEquals(0, new DoubleIt().squareDigits(0));
    }
}
