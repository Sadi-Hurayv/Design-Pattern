/**
 * 
 */
package Behavioral.Mediator.ATCex;

/**
 * @author shuvra
 *
 */
public class Runway implements Command{

	private IATC mediator;
	
	public Runway(IATC mediator) {
		this.mediator=mediator;
	}
	
	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Runway is available for landing");
		mediator.setAvailabilityStatus(true);
	}

}
