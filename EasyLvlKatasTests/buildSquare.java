package EasyLvlKatasTests;

import EasyLvlKatas.BuoldSquare;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class buildSquare
{
    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", BuoldSquare.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuoldSquare.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuoldSquare.generateShape(8));
    }
}
