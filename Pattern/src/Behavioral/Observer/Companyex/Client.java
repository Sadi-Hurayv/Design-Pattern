package Behavioral.Observer.Companyex;

public class Client {
	
	public static void main(String[] args) {
		
		User asif=new User("Asif");
		User shekh=new User("Shekh");
		User robi=new User("Robi");
		
		Share share = new Share(1000.00);//Initial share price
		Company rfl=new Company("RFL", share);
		
		rfl.registerUser(asif);
		rfl.registerUser(shekh);
		rfl.registerUser(robi);
		
		rfl.notifyUser();
		
		share.setSharePrice(1500.00);
		rfl.notifyUser();
		
		share.setSharePrice(1500.00);
		rfl.notifyUser();
		
	}

}
