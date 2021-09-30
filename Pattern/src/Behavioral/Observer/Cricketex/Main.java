/**
 * 
 */
package Behavioral.Observer.Cricketex;

/**
 * @author shuvra
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Observer currentScore = new CurrentScoreDisplay();
		Observer averageScore = new AverageScoreDisplay();
		
		CricketData cricketData = new CricketData();
		
		cricketData.register(currentScore);
		cricketData.register(averageScore);
		
		cricketData.dataChanged();
		
		cricketData.unregister(averageScore);
		
		cricketData.dataChanged();
		
	}

}
