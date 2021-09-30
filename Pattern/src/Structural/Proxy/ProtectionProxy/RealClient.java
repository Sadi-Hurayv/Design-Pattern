/**
 * 
 */
package Structural.Proxy.ProtectionProxy;

/**
 * @author shuvra
 *
 */
public class RealClient implements Account {

	private String accountNumber = "ASH_1825009M";
	public RealClient() {
		System.out.println("Real Client initialized.");
	}
	@Override
	public void displayAccountNumber() {
		System.out.println("Real client account number: " + accountNumber);
	}

}
