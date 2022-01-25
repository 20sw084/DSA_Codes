 * Lab 2 Tasks
 */
package dsaCodes;


//@Author: Junaid Aslam(Jonny)
//@Roll Number: 20SW084

/**************************************************
Permission to use, copy, modify, and distribute 
this software and its documentation for educational, 
research, and not-for-profit purposes
**************************************************/


public class RectangleArea{
	double length;
	double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public RectangleArea(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public RectangleArea() {
		// TODO Auto-generated constructor stub
	}
	
	//....getArea
	
	public double returnArea() {
		return (length*breadth);
	}
	
	//Main method to test 
	public static void main(String[] args) {
		RectangleArea ra=new RectangleArea(12,14);
		System.out.println("Area of Rectangle is: "+ra.returnArea());
	}
	
}
