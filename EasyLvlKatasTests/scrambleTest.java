package EasyLvlKatasTests;

import EasyLvlKatas.scrambleClass;
import org.junit.Test;
import org.junit.jupiter.api.Order;

import static org.junit.Assert.assertEquals;

public class scrambleTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    @Order(1)
    public void sampleTests() {
        testing(scrambleClass.scramble("rkqodlw","world"), true);
        testing(scrambleClass.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(scrambleClass.scramble("katas","steak"),false);
        testing(scrambleClass.scramble("scriptjavx","javascript"),false);
        testing(scrambleClass.scramble("scriptingjava","javascript"),true);
        testing(scrambleClass.scramble("scriptsjava","javascripts"),true);
        testing(scrambleClass.scramble("javscripts","javascript"),false);
        testing(scrambleClass.scramble("aabbcamaomsccdd","commas"),true);
        testing(scrambleClass.scramble("commas","commas"),true);
        testing(scrambleClass.scramble("sammoc","commas"),true);
    }

    @Test @Order(2)
    public void largeTest() {

        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);

        testing(scrambleClass.scramble(s1, s2), true);
    }
}
