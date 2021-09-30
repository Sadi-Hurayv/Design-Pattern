/**
 * 
 */
package Behavioral.NullObject;

/**
 * @author shuvra
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Customer c1 = CustomerFactory.getCustomer("Bob");
		Customer c2 = CustomerFactory.getCustomer("Rob");
		Customer c3 = CustomerFactory.getCustomer("AlPHa");
		
		System.out.println("Customer");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
	}
}
