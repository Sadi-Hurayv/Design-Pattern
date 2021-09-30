/**
 * 
 */
package Behavioral.Mediator.ATCex;

/**
 * @author shuvra
 *
 */
public class Main {
	
	public static void main(String[] args) {
		IATC atc = new ATC();
		
		Runway runway1 = new Runway(atc);
		
		Flight flight1 = new Flight(atc);
		Flight flight2 = new Flight(atc);
		
		atc.registerRunaway(runway1);
		
		atc.registerFlight(flight1);
		atc.registerFlight(flight2);
		
		flight1.readyToLand();
		
		runway1.land();
		
		flight1.land();
		
		flight2.readyToLand();
		
		flight1.parked();
		
		flight2.land();
		
		
	}

}
