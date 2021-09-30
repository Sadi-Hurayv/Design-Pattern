/**
 * 
 */
package Behavioral.Observer.Cricketex;

/**
 * @author shuvra
 *
 */
public class AverageScoreDisplay implements Observer{

	private float runRate;
	private float predictedScore;
	
	@Override
	public void update(int run, int wicket, float over) {
		// TODO Auto-generated method stub
		runRate = (float)(run/over);
		predictedScore = runRate*50;
		
		display();
	}
	
	public void display() {
		System.out.println("Current Runrate: " + runRate);
		System.out.println("Predicted Score: " + predictedScore);
	}

}
