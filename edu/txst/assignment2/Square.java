package edu.txst.assignment2;

/**
 * Represents a square with a side length
 */
public class Square implements Shape {

    private double side;

    /**
     * Defined constructor for Square
     * @param side Value to set side
     */
    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getClassName() {
        return "Square";
    }

    @Override
    public String toString() {
        return getClassName() + "(s=" + side + ")";
    }
    
}
