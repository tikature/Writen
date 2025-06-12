package src.test.java;

import org.junit.Test;
import static org.junit.Assert.*;
import src.main.java.*;

public class AreaCalculatorTest {

	@Test
	void testCircleArea() {
		double result = AreaCalculator.calculateArea(ShapeType.CIRCLE, 2);
		assertEquals(Math.PI * 4, result, 0.001);
	}

	@Test
	void testSquareArea() {
		double result = AreaCalculator.calculateArea(ShapeType.SQUARE, 3);
		assertEquals(9.0, result, 0.001);
	}

	@Test
	void testRectangleArea() {
		double result = AreaCalculator.calculateArea(ShapeType.RECTANGLE, 4, 5);
		assertEquals(20.0, result, 0.001);
	}
}
