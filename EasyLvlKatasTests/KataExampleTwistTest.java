package EasyLvlKatasTests;

import EasyLvlKatas.KataExampleTwist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class KataExampleTwistTest {
    @Test
    public void test(){
        String[] websites = KataExampleTwist.kataExampleTwist();
        assertTrue("The array is still empty", websites.length > 0);
        assertEquals("The array does not equal 1,000", 1000, websites.length);
        boolean allCodewars = true;
        for (String website : websites)
            if (!"codewars".equals(website)) {
                allCodewars = false;
                break;
            }
        assertTrue("Every element in the array must contain the value \"codewars\"", allCodewars);
    }
}