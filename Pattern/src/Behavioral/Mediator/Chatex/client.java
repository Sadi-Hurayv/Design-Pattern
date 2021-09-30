package Behavioral.Mediator.Chatex;

public class client {
	
	public static void main(String[] args) {
		User shuvra = new User("Shuvra");
		shuvra.sendMessage("Hi, Everyone!!!");
		
		User robi = new User("Robi");
		robi.sendMessage("Hi, Shuvra! How are you?");
	}

}
