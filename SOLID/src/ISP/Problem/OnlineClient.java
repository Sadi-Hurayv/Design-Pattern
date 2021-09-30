/**
 * 
 */
package ISP.Problem;

/**
 * @author shuvra
 *
 *	Client should not forced to depend on methods that they do not use.
 *	The ISP says that once an interface has become too 'fat‘ it needs to be split into smaller and more specific 
 *		interfaces so that any clients of the interface will only know about the methods that pertain to them.
 */
public class OnlineClient implements Restaurent {
	
	String name;
	public OnlineClient(String name) {
		this.name = name;
	}
	@Override
	public void onlineOrder() {
		System.out.println(name + " placed the order successfully.");
		//logic for placing online orde
	}
	
	@Override
	public void telephoneOrder() {
		// not applicable for online client.
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void onlinePayment() {
		System.out.println(name + " make the payment successfully.");
		//logic for placing online payment
	}
	
	@Override
	public void inpersonOrder() {
		// not applicable for online client.
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void inPersonPayment() {
		//not applicable for online client.
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void greetingsForOrder() {
		System.out.println("Thanks for your order.");
	}
	
	@Override
	public void greetingsForPayment() {
		System.out.println("Thanks for your payment.");
	}	

}
