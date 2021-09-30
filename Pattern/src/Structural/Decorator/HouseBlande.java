/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public class HouseBlande implements Beverage {

	@Override
	public String description() {
		return "HouseBland";
	}

	@Override
	public Double cost() {
		return 100.00;
	}

}
