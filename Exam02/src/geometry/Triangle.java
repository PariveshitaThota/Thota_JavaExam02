/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Pariveshita Thota
 */
    public class Triangle extends GeometricObject {
	private double side1; 
	private double side2; 
	private double side3;

	public Triangle(){
	} 

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public Triangle(double side1, double side2, double side3, 
		String shade, boolean fill) {
		this(side1, side2, side3);
		setShade(shade);
		setFill(fill); 
	}

	/** Returning side1
     * @return  */
	public double getSide1() {
		return side1;
	}

	/** Setting side1 to a new length
     * @param side1 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/** Returning side2
     * @return  */
	public double getSide2() {
		return side2;
	}

	/** Setting side2 to a new length
     * @param side2 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/** Returning side3
     * @return  */
	public double getSide3() {
		return side3;
	}

	/** Setting side3 to a new length
     * @param side3 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override /** Return area of this Triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override /** Return perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override /** Return a string description of the object */
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter(); 
	}
}

