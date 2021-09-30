/**
 * 
 */
package OCP.Solution;

/**
 * @author shuvra
 *
 */
public class Rectangle implements Shape {

	public double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void calculateArea() {
		System.out.println(length*width);
	}

}
