/**
 * 
 */
package Creational.FactoryMethod.Example_1;

/**
 * @author shuvra
 *
 */
public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	public abstract Computer toCopy();
	
	public String toString() {
		return "RAM: " + this.getRam() + ", HDD: " + this.getHDD() + ", CPU: " + this.getCPU();
	}

}
