package EasyLvlKatasTests;

import EasyLvlKatas.MultiplesOf;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesOfTest {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf().solution(10));
    }
}
