package src.test.java;

import org.junit.Test;
import static org.junit.Assert.*;
import src.main.java.*;

public class AreaCalculatorTest {

    @Test
    public void testCircleArea() {
        AreaCalculator calc = new AreaCalculator();
        double result = calc.calculate(ShapeType.CIRCLE, 3);
        assertEquals(28.274, result, 0.001); // π * r^2 = ~28.274
    }

    @Test
    public void testSquareArea() {
        AreaCalculator calc = new AreaCalculator();
        double result = calc.calculate(ShapeType.SQUARE, 4);
        assertEquals(16.0, result, 0.001); // 4 * 4 = 16
    }
}
