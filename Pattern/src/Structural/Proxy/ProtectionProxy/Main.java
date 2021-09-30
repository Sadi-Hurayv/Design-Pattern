/**
 * 
 */
package Structural.Proxy.ProtectionProxy;

import java.util.Scanner;

/**
 * @author shuvra
 *
 */
public class Main {

	public static void main(String[] args) {
		
		ProtectionProxyClient ppc = new ProtectionProxyClient("s96");
		ppc.displayAccountNumber();
		ppc.displayAccountNumber();

	}

}
