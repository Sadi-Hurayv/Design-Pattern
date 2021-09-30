/**
 * 
 */
package Behavioral.NullObject;

/**
 * @author shuvra
 *
 */

public class CustomerFactory {
	
	public static final String[] names = {"Bob", "Alpha", "Tk"};
	
	public static Customer getCustomer(String name) {
		for(int i=0; i<names.length; i++) {
			if(names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(names[i]);
			}
		}
		return new NullCustomer();
	}
}
