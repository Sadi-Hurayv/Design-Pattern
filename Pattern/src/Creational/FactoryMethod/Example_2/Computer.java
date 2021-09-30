/**
 * 
 */
package Creational.FactoryMethod.Example_2;

/**
 * @author shuvra
 *
 */
public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHdd();
	public abstract String getCpu();
	
	public String toString() {
		return "RAM: " + this.getRam() + ", HDD: " + this.getHdd() + ", CPU: " + getCpu();
	}

}
