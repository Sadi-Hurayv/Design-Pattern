/**
 * 
 */
package OCP.Problem.P2;

/**
 * @author shuvra
 *
 * To be precise, according to this principle, 
 * 		--> A class should been written in such a manner that it performs its job flawlessly 
 * 				without the assumption that people in the future will simply come and change it. 
 * 		--> Hence, the class should remain closed for modification, but it should have the option to get extended.
 */
public class AreaCalculator {
	
	public void calculateRectangleArea(Rectangle rectangle) {
		System.out.println(rectangle.length*rectangle.width);
	}
	
	// As new Circle shape added, we modified this class adding the below method to calculate the area of the circle.
	public void calculateCircleArea(Circle circle) {
		System.out.println((22.0/7.0) * circle.radious * circle.radious);
	}

}
