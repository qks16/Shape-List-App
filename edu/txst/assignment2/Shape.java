package edu.txst.assignment2;

/**
 * This interface defines the contract for any shape that can be managed by the ShapeManager.
 * Each shape must be able to calculate its area and provide its class name.
 */
public interface Shape {
    double getArea(); // Method to calculate the area of the shape
    String getClassName(); // Method to return the class name of the shape
}
