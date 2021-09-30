/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public abstract class CondimentDecorator implements Beverage {

	protected Beverage beverage; 
/**
 * If this composition variable declares here, then all it's subclass (Milk, Coffee, Chocolate) don't have to declare it to their own class;
 * 		--> If we declare this as private then, we have to use constructor to pass it.
 * 		--> If we declare this as protected then, we can directly use it in the subclasses.
 */
	@Override
	public abstract String description();

	@Override
	public abstract Double cost();

}
