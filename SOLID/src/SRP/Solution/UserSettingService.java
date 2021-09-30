/**
 * 
 */
package SRP.Solution;

/**
 * @author shuvra
 *
 ** According to the single responsibility principle,
 * 		--> There should be only one reason due to which a class has to be changed.
 * 		--> It means that a class should have one task to do.
 * 		--> This principle is often termed as subjective.
 */
public class UserSettingService {
	
	public void changeEmail(User user) {
		if(SecurityService.checkAccess(user)) {
			//Grant to change the email.
		}
	}

}
