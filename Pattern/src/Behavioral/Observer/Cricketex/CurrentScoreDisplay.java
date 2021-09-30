/**
 * 
 */
package Behavioral.Observer.Cricketex;

/**
 * @author shuvra
 *
 */
public class CurrentScoreDisplay implements Observer{
	
	private int run;
	private float over;
	private int wicket;
	
	@Override
	public void update(int run, int wicket, float over) {
		// TODO Auto-generated method stub
		this.run=run;
		this.wicket=wicket;
		this.over=over;
		
		display();
	}
	
	public void display() {
		System.out.println("Run: " + run);
		System.out.println("Over: " + over);
		System.out.println("Wicket: " + wicket);
	}

}
