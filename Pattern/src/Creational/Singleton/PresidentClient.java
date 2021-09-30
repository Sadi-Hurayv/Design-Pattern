/**
 * 
 */
package Creational.Singleton;

/**
 * @author shuvra
 *
 */
public class PresidentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		President president = President.getPresident("Abdul Hamid", "78");
		System.out.println(president);
		President prePresident = President.getPresident("Jillur Rahman", "86");
		System.out.println(prePresident);
	}

}
