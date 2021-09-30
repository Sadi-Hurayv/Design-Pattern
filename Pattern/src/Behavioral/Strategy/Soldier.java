package Behavioral.Strategy;

public class Soldier {

	private WarStrategy strategy;
	public Soldier(WarStrategy strategy) {
		this.strategy=strategy;
	}
	
	public void command(String platoonName) {
		strategy.executeStategy(platoonName);
	}
	
}
