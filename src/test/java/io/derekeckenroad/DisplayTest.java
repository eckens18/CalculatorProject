package io.derekeckenroad;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DisplayTest {

    @Test
    public void clearResultTest(){
        Display display = new Display();
        Calculator.result = 10;
        double expected = 0;
        double actual = display.clearResult();
        assertEquals("The expected clearResult value should be 0",expected,actual,0);
    }
}
