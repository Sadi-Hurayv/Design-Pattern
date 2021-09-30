/**
 * 
 */
package Creational.FactoryMethod.Example_2;

/**
 * @author shuvra
 *
 */
public class SuperComputer extends Computer{
	
	private String ram, hdd, cpu;
	
	public SuperComputer(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return this.cpu;
	}
	

}
