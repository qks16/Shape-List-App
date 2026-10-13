package edu.txst.assignment2;

/**
 * Represents a circle with a radius
 */
public class Circle implements Shape {

    private double radius;

    /**
     * Defined constructor for Circle
     * @param radius Value to set radius
     */
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getClassName() {
        return "Circle";
    }

    @Override
    public String toString() {
        return getClassName() + "(r=" + radius + ")";
    }
    
}
