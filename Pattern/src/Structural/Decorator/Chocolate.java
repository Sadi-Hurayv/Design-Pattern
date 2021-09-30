/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public class Chocolate extends CondimentDecorator{
	
	//private Beverage beverage;
	public Chocolate(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String description() {
		return beverage.description() + ", Chocolete";
	}
	@Override
	public Double cost() {
		return beverage.cost() + 50;
	}
	

}
