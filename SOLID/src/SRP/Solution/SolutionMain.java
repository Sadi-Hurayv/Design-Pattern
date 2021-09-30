/**
 * 
 */
package SRP.Solution;

/**
 * @author shuvra
 *
 */
public class SolutionMain {
	
	public static void main(String[] args) {
		User user = new User();
		
		UserSettingService uss = new UserSettingService();
		uss.changeEmail(user);
	}

}
