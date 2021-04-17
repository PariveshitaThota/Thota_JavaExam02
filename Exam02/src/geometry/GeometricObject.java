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
    public abstract class GeometricObject {
	private String shade = "green";
	private boolean fill;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Constructor for a geometric object with color and fill value
     * @param shade */
	protected GeometricObject(String shade, boolean fill) {
		dateCreated = new java.util.Date();
		this.shade = shade;
		this.fill = fill;
	}

	/** Returning color
     * @return  */
	public String getColor() {
		return shade;
	}

	/** Setting a new color
     * @param color */
	public void setShade(String color) {
		this.shade = shade;
	}

	/** *  Returning filled.Since fill is boolean,
  the get method is named isFill
     * @return  */
	public boolean isFill() {
		return fill;
	}

	/** Setting a new filled
     * @param fill */
	public void setFill(boolean fill) {
		this.fill = fill;
	}

	/** Getting dateCreated
     * @return  */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\nshade: " + shade +
			" and fill: " + fill;
	}

	/** Abstract method getArea
     * @return  */
	public abstract double getArea();

	/** Abstract method getPerimeter
     * @return  */
	public abstract double getPerimeter();
}

