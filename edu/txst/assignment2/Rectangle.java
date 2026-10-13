package edu.txst.assignment2;

/**
 * Represents a rectangle with width and length
 */
public class Rectangle implements Shape {

    private double width;
    private double length;

    /**
     * Defined constructor for Rectangle
     * @param width Value to set width
     * @param length Value to set length
     */
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public String getClassName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getClassName() + "(" + width + "x" + length + ")";
    }
    
}
