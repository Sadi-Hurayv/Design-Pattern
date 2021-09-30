/**
 * 
 */
package Behavioral.NullObject;

/**
 * @author shuvra
 *
 */
public class NullCustomer extends Customer{

	@Override
	public String getName() {
		return "Not Available in Customer Database!!!";
	}

	@Override
	public boolean isNull() {
		return true;
	}
}
