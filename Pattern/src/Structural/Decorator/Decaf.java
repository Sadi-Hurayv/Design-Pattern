/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public class Decaf implements Beverage {

	@Override
	public String description() {
		return "Decaf";
	}

	@Override
	public Double cost() {
		return 300.00;
	}

}
