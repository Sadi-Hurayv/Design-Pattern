/**
 * 
 */
package OCP.Problem.P2;

/**
 * @author shuvra
 *
 */
public class P2Main {

public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(5,6);
		Circle cir = new Circle(5);
		
		AreaCalculator ac =  new AreaCalculator();
		ac.calculateRectangleArea(rec);
		ac.calculateCircleArea(cir);
	}

}
