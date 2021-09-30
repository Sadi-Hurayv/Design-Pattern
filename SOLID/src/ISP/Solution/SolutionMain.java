/**
 * 
 */
package ISP.Solution;

import ISP.Problem.OnlineClient;

/**
 * @author shuvra
 *
 */
public class SolutionMain {

	public static void main(String[] args) {
		OnlineClient oc = new OnlineClient("Asif");
		oc.onlineOrder();
		oc.greetingsForOrder();
		
		oc.onlinePayment();
		oc.greetingsForPayment();

	}

}
