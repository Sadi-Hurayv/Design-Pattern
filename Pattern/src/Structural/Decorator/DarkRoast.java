/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public class DarkRoast implements Beverage {

	@Override
	public String description() {
		return "DarkRoast";
	}

	@Override
	public Double cost() {
		return 200.00;
	}

}
