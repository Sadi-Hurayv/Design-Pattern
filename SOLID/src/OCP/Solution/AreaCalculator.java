/**
 * 
 */
package OCP.Solution;

/**
 * @author shuvra
 *
 * To be precise, according to this principle, 
 * 		--> A class should be written in such a manner that it performs its job flawlessly 
 * 				without the assumption that people in the future will simply come and change it. 
 * 		--> Hence, the class should remain closed for modification, but it should have the option to get extended.
 */
public class AreaCalculator {
	
	public void calculateShapeArea(Shape shape) {
		shape.calculateArea();
	}

}
