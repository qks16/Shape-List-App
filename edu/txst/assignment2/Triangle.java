package edu.txst.assignment2;

/**
 * Represents a triangle with a base length and height
 */
public class Triangle implements Shape {

    private double base;
    private double height;

    /**
     * Defined constructor for Triangle
     * @param base
     * @param height
     */
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2.0;
    }

    @Override
    public String getClassName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return getClassName() + "(b=" + base + ", h=" + height + ")";
    }
    
}
