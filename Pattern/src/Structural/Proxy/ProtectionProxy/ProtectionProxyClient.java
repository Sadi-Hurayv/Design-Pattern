/**
 * 
 */
package Structural.Proxy.ProtectionProxy;

import java.util.Scanner;

/**
 * @author shuvra
 *
 */
public class ProtectionProxyClient implements Account {

	private RealClient realClient;
	private String password;
	public ProtectionProxyClient(String password) {
		this.password = password;
		System.out.println("Protection proxy initialized!!!");
	}
	
	@Override
	public void displayAccountNumber() {
		String pass;
		Scanner sc = new Scanner(System.in);
		pass = sc.nextLine();
		
		if(password.equals(pass)) {
			realClient = new RealClient();
			realClient.displayAccountNumber();
		}
		else {
			System.out.println("Protection Proxy Client : Illegal password!!!");
		}
		//sc.close();
	}

}
