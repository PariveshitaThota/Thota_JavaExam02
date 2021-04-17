/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;
 import java.util.Scanner;

/**
 *
 * @author Pariveshita Thota
 */
public class GeometryDriver {

    /**
     * @param args the command line arguments
     */

	/** Main method
     * @param args */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three sides of a triangle a color 
		// and a Boolean value to indicate whether the triangle is filled
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		System.out.print("Enter a color: ");
		String color = input.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Create a Triangle
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);

		System.out.println(triangle);
	}
}
   