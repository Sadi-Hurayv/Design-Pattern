/**
 * 
 */
package Structural.Composite;

/**
 * @author shuvra
 *
 */
public class JuniorAccountManager implements Employee{
	
	private String id;
	private String name;
	
	public JuniorAccountManager(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(getID() + "\t" + "Junior Account Manager" + "\t" + getName());
	}

}
