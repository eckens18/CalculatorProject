package io.derekeckenroad;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        calculator.result = 10;
        double expected = 18;
        double actual = calculator.add(8);
        assertEquals("The expected add value should be 18",expected,actual,0);
    }
    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        calculator.result = 10;
        double expected = 8;
        double actual = calculator.subtract(2);
        assertEquals("The expected subtract value should be 8",expected,actual,0);
    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        calculator.result = 10;
        double expected = 20;
        double actual = calculator.multiply(2);
        assertEquals("The expected multiply value should be 8",expected,actual,0);
    }
    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        calculator.result = 20;
        double expected = 10;
        double actual = calculator.divide(2);
        assertEquals("The expected divide value should be 8",expected,actual,0);
    }
    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        calculator.result = 100;
        double expected = 10;
        double actual = calculator.squareRoot();
        assertEquals("The expected square root should be 4",expected,actual,0);
    }
    @Test
    public void squareTest(){
        Calculator calculator = new Calculator();
        calculator.result = 10;
        double expected = 100;
        double actual = calculator.square();
        assertEquals("The expected square should be 16",expected,actual,0);
    }
    @Test
    public void exponenetTest(){
        Calculator calculator = new Calculator();
        calculator.result = 10;
        double expected = 100;
        double actual = calculator.exponent(2);
        assertEquals("The expected exponent value should be 16",expected,actual,0);
    }
    @Test
    public void posToNegTest(){
        Calculator calculator = new Calculator();
        calculator.result = 10;
        double expected = -10;
        double actual = calculator.posToNeg();
        assertEquals("The expected inverse value should be -4",expected,actual,0);
    }
    @Test
    public void inverseTest(){
        Calculator calculator = new Calculator();
        calculator.result = 10;
        double expected = 0.1;
        double actual = calculator.inverse();
        assertEquals("The expected inverse value should be 0.0625",expected,actual,0);
    }
}
