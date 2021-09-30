/**
 * 
 */
package Behavioral.Mediator.ATCex;

/**
 * @author shuvra
 *
 */
public class ATC implements IATC{

	Runway runaway;
	Flight flight;
	Boolean status;
	
	@Override
	public void registerRunaway(Runway runaway) {
		// TODO Auto-generated method stub
		this.runaway=runaway;
	}

	@Override
	public void registerFlight(Flight flight) {
		// TODO Auto-generated method stub
		this.flight=flight;
	}

	@Override
	public void setAvailabilityStatus(Boolean status) {
		// TODO Auto-generated method stub
		this.status=status;
	}

	@Override
	public Boolean isAvailable() {
		// TODO Auto-generated method stub
		return this.status;
	}

}
