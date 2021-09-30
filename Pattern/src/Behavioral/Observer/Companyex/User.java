package Behavioral.Observer.Companyex;

public class User {
	private String name;
	public User(String name) {
		this.name=name;
	}
	
	public void reciveNotification(Company company) {
		System.out.println("Hi " + name + "! The share of the " + company.getName() + " have changed to " + company.getCurrentSharePrice() + "!!!");
	}
}
