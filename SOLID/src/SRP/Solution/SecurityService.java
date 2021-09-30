package SRP.Solution;

public class SecurityService {
	
	User user;
	SecurityService(User user){
		this.user=user;
	}
	
	public static boolean checkAccess(User user) {
		//Verify if the user is valid.
		if(true)
			return true;
		else
			return false;
	}

}
