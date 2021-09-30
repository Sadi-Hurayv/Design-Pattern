/**
 * 
 */
package Behavioral.Template;

/**
 * @author shuvra
 *
 */
public abstract class ComputerTemplate {
	
	public final void build() {
		collectComponents();
		assemble();
		installOS();
		finalCheck();
	}

	private void finalCheck() {
		// TODO Auto-generated method stub
		System.out.println("Everythig is OK.");
	}

	protected abstract void installOS();

	protected abstract void assemble();

	protected abstract void collectComponents();
	
}
