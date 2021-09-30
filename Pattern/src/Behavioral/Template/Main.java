package Behavioral.Template;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("-----------Laptop-----------\n");
		ComputerTemplate laptop = new Laptop();
		laptop.build();
		System.out.println("\n-----------Server-----------");
		ComputerTemplate server = new Server();
		server.build();
	}

}
