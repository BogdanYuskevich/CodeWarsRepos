package EasyLvlKatasTests;

import EasyLvlKatas.MultipliesOf;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipliesOfTest {
    @Test
    public void test() {
        assertEquals(23, new MultipliesOf().solution(10));
    }

}
