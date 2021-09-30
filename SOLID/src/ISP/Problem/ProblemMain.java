/**
 * 
 */
package ISP.Problem;

/**
 * @author shuvra
 *
 */
public class ProblemMain {

	public static void main(String[] args) {
		
		OnlineClient oc = new OnlineClient("Asif");
		oc.onlineOrder();
		oc.greetingsForOrder();
		
		oc.onlinePayment();
		oc.greetingsForPayment();

	}

}
