/**
 * 
 */
package Behavioral.Observer.Cricketex;

/**
 * @author shuvra
 *
 */
public interface Subject {
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	public void observerNotify();
}
