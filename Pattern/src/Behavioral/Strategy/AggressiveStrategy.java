package Behavioral.Strategy;

public class AggressiveStrategy implements WarStrategy{

	@Override
	public void executeStategy(String platoonName) {
		System.out.println("Platoon " + platoonName + ", you are ordered to execute Aggressive Strategy.");
	}

}
