/**
 * 
 */
package SRP.Problem;

/**
 * @author shuvra
 * 
 * According to the single responsibility principle,
 * 		--> There should be only one reason due to which a class has to be changed.
 * 		--> It means that a class should have one task to do.
 * 		--> This principle is often termed as subjective.
 */
public class UserSettingService {
	
	public void changeEmail(User user) {
		if(checkAccess(user)) {
			//Grant to change the email.
		}
	}
	
	public boolean checkAccess(User user) {
		//Verify if the user is valid.
		if(true)
			return true;
		else
			return false;
	}
	
}
