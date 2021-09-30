/**
 * 
 */
package LSP.Problem;

/**
 * @author shuvra
 *
 */
public class Ostrich extends Bird{
	
	public String name;
	public Ostrich(String name) {
		this.name=name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " the ostrich can eat.");
	}

	// This shouldn't be here because ostrich can't fly.
	@Override
	public void fly() {
		System.out.println(name + " shouldn't be here because ostrich can't fly.");
	}


}
