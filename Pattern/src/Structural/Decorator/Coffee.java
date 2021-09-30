/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public class Coffee extends CondimentDecorator{
	
	//private Beverage beverage;
	public Coffee(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String description() {
		return beverage.description() + ", Cofee";
	}
	@Override
	public Double cost() {
		return beverage.cost() + 40;
	}
	
	
	

}
