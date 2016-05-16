package io.derekeckenroad;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by derekeckenroad on 5/2/16.
 */
public class TrigTest {
    @Test
    public void sineTest(){
        Trig trig = new Trig();
        double expected = 0.8939966636005579;
        double actual = trig.sine(90);
        assertEquals("The expected sine value should be 0.8939966636005579",expected,actual,0);
    }
    @Test
    public void cosineTest(){
        Trig trig = new Trig();
        double expected = -0.4480736161291702;
        double actual = trig.cosine(90);
        assertEquals("The expected cosine value should be -0.4480736161291702",expected,actual,0);
    }
    @Test
    public void tangentTest(){
        Trig trig = new Trig();
        double expected = -1.995200412208242;
        double actual = trig.tangent(90);
        assertEquals("The expected tangent value should be -1.995200412208242",expected,actual,0);
    }
    @Test
    public void inverseSineTest(){
        Trig trig = new Trig();
        double expected = 0.5235987755982989;
        double actual = trig.inverseSine(.5);
        assertEquals("The expected inverse sine value should be 0.5235987755982989",expected,actual,0);
    }
    @Test
    public void inverseCosineTest(){
        Trig trig = new Trig();
        double expected = 1.0471975511965979;
        double actual = trig.inverseCosine(.5);
        assertEquals("The expected inverse cosine value should be 1.0471975511965979",expected,actual,0);
    }
    @Test
    public void inverseTangentTest(){
        Trig trig = new Trig();
        double expected = 0.4636476090008061;
        double actual = trig.inverseTangent(.5);
        assertEquals("The expected inverse tangent value should be 0.4636476090008061",expected,actual,0);
    }
    @Test
    public void convertToRadiansTest(){
        Trig trig = new Trig();
        double expected = 1.5707963267948966;
        double actual = trig.convertToRadians(90);
        assertEquals("The expected conversion from degrees to radians should be 1.5707963267948966",expected,actual,0);
    }
    @Test
    public void convertToDegreesTest() {
        Trig trig = new Trig();
        double expected = 90;
        double actual = trig.convertToDegrees(1.5707963267948966);
        assertEquals("The expected conversion from radians to degrees should be 90", expected, actual, 0);
    }

    @Test
    public void factorialTest() {
        Trig trig = new Trig();
        double expected = 120;
        double actual = trig.factorial(5);
        assertEquals("The expected factorial value should be 120", expected, actual, 0);
    }

    @Test
    public void logTest() {
        Trig trig = new Trig();
        double expected = 1.6094379124341003;
        double actual = trig.log(5);
        assertEquals("The expected log value should be 1.6094379124341003", expected, actual, 0);
    }



}
