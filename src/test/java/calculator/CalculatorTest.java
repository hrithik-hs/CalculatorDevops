package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("factorial : True Positive", 720, calculator.factorial(6), DELTA);
        assertEquals("factorial : True Positive", 24, calculator.factorial(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("factorial of a number : False Positive", 720, calculator.factorial(5), DELTA);
        assertNotEquals("factorial of a number : False Positive", 12, calculator.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("power : True Positive", 27, calculator.power(3, 3), DELTA);
        assertEquals("power : True Positive", 625, calculator.power(5, 4), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("power : False Positive", 6, calculator.power(6, 2), DELTA);
        assertNotEquals("power : False Positive", -1, calculator.power(5, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("natural log : True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("natural log : True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("natural log : False Positive", 4.6, calculator.naturalLog(4.6), DELTA);
        assertNotEquals("natural log : False Positive", 21, calculator.naturalLog(42.6), DELTA);
    }

    @Test
    public void sqrtTruePositive(){
        assertEquals("square root : True Positive", 2, calculator.sqrt(4), DELTA);
        assertEquals("square root : True Positive", 3, calculator.sqrt(9), DELTA);
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("square root : False Positive", 5, calculator.sqrt(16), DELTA);
        assertNotEquals("square root : False Positive", 4.2, calculator.sqrt(56), DELTA);
    }

}