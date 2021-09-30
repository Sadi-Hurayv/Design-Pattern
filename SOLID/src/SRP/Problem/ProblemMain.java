/**
 * 
 */
package SRP.Problem;

/**
 * @author shuvra
 *
 */
public class ProblemMain {
	
	public static void main(String[] args) {
		User user = new User();
		
		UserSettingService uss = new UserSettingService();
		uss.changeEmail(user);
	}

}
