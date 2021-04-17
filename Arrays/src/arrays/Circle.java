/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Pariveshita Thota
 */
public class Circle {
  
	/** The radius of the circle */
	private double radius = 1;

	/** The number of objects created */
	private static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	public Circle() {
		numberOfObjects++;
	}

	/** Constructor a circle with a specified radius
     * @param newRadius */
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Returning radius
     * @return  */
	public double getRadius() {
		return radius;
	}

	/** Setting a new radius
     * @param newRadius */
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

	/** Returning the numberOfObjects
     * @return  */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Returning the area of this circle
     * @return  */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

