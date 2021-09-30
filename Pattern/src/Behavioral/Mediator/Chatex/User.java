package Behavioral.Mediator.Chatex;

public class User {
	
	private String name;
	public User(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}

}
