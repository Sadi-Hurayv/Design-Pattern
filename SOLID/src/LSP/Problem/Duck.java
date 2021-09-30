/**
 * 
 */
package LSP.Problem;

/**
 * @author shuvra
 *
 */
public class Duck extends Bird{
	
	public String name;
	//constractor
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
