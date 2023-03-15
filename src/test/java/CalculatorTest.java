import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factTruePos(){
        assertEquals("Finding factorial for True Positive number", 1, calculator.fact(0), DELTA);
        assertEquals("Finding factorial for True Positive number", 1, calculator.fact(1), DELTA);
        assertEquals("Finding factorial for True Positive number", 2, calculator.fact(2), DELTA);
        assertEquals("Finding factorial for True Positive number", 24, calculator.fact(4), DELTA);
        assertEquals("Finding factorial for True Positive number", 720, calculator.fact(6), DELTA);
    }


    @Test
    public void factFalsePos(){
        assertNotEquals("Finding factorial for a False Positive number", 0, calculator.fact(0), DELTA);
        assertNotEquals("Finding factorial for a False Positive number", 2, calculator.fact(1), DELTA);
        assertNotEquals("Finding factorial for a False Positive number", 10, calculator.fact(3), DELTA);
        assertNotEquals("Finding factorial for a False Positive number", 200, calculator.fact(5), DELTA);
        assertNotEquals("Finding factorial for a False Positive number", 500, calculator.fact(7), DELTA);
    }
}
