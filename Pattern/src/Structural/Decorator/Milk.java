/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public class Milk extends CondimentDecorator{

	//private Beverage beverage; It was declared in the base decorator class
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String description() {
		return beverage.description() + ", Milk";
	}

	@Override
	public Double cost() {
		return beverage.cost() + 30;
	}
	
}
