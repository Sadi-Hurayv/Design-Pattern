/**
 * 
 */
package Behavioral.Mediator.ATCex;

/**
 * @author shuvra
 *
 */
public class Flight implements Command{

	IATC mediator;
	public Flight(IATC mediator) {
		this.mediator=mediator;
	}
	
	@Override
	public void land() {
		// TODO Auto-generated method stub
		if(mediator.isAvailable()) {
			System.out.println("Landed Successfully!!!");
			mediator.setAvailabilityStatus(false);
		}
		else {
			System.out.println("Waiting for runway....");
		}
	}
	
	public void readyToLand() {
		System.out.println("Landing Initiated.");
	}
	
	public void parked() {
		System.out.println("Successfully parked!!!");
		mediator.setAvailabilityStatus(true);
	}

}
