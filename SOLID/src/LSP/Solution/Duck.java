/**
 * 
 */
package LSP.Solution;

/**
 * @author shuvra
 *
 */
public class Duck extends FlyingBird{
	
	public String name;
	public Duck(String name) {
		this.name=name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " the duck can eat.");
	}

	@Override
	public void fly() {
		System.out.println(name + " the duck can fly.");
	}

}
