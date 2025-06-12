package src.main.java;

public class AreaCalculator {

    public double calculate(String shapeType, double dimension) {
        switch (shapeType) {
            case ShapeType.CIRCLE:
                return Math.PI * dimension * dimension;
            case ShapeType.SQUARE:
                return dimension * dimension;
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
