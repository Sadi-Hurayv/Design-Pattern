/**
 * 
 */
package Behavioral.Mediator.ATCex;

/**
 * @author shuvra
 *
 */
public interface IATC {
	public void registerRunaway(Runway runaway);
	public void registerFlight(Flight flight);
	
	public void setAvailabilityStatus(Boolean status);
	public Boolean isAvailable();
}
