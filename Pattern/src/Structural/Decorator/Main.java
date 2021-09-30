/**
 * 
 */
package Structural.Decorator;

/**
 * @author shuvra
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Beverage beverage_1 = new DarkRoast();
		beverage_1 = new Milk(beverage_1);
		beverage_1 = new Chocolate(beverage_1);
		System.out.println("The drink components are " + beverage_1.description() + ".\nCost: " + beverage_1.cost());
		
		Beverage beverage_2 = new Chocolate(new Coffee(new Milk(new Decaf())));
		System.out.println("The drink components are " + beverage_2.description() + ".\nCost: " + beverage_2.cost());

	}

}
