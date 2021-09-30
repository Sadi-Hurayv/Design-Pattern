package Behavioral.Strategy;

public class Client {

	public static void main(String[] args) {
		
		Soldier sol1 = new Soldier(new AggressiveStrategy());
		sol1.command("Viper");
		
		Soldier sol2 = new Soldier(new DefesiveStrategy());
		sol2.command("Cobra");
		
		Soldier sol3 = new Soldier(new GuerillaStrategy());
		sol3.command("Mamba");

	}
	
}
