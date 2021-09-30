/**
 * 
 */
package OCP.Solution;

/**
 * @author shuvra
 *
 */
public class SolutionMain {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4, 5);
		Circle ci = new Circle(10);
		
		AreaCalculator ac = new AreaCalculator();
		ac.calculateShapeArea(rec);
		ac.calculateShapeArea(ci);

	}

}
