/**
 * 
 */
package ISP.Solution;

/**
 * @author shuvra
 *
 */
public class OnlineClient implements OnlineOrder, OnlinePayment {
	
	String name;
	public OnlineClient(String name) {
		this.name = name;
	}
	
	
	@Override
	public void placeOrder() {
		System.out.println(name + " placed the order successfully.");
		//logic for placing online orde
	}
	
	@Override
	public void payForOrder() {
		System.out.println(name + " make the payment successfully.");
		//logic for placing online payment
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
