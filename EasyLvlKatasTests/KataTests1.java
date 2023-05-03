package EasyLvlKatasTests;

import EasyLvlKatas.highAndLows;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class KataTests1 {
    @Test
    public void test1() {
        assertEquals("42 -9", highAndLows.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    @Test
    public void test2() {
        assertEquals("3 1", highAndLows.highAndLow("1 2 3"));
    }
}