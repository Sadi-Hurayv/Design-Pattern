/**
 * 
 */
package Creational.FactoryMethod.Example_1;

/**
 * @author shuvra
 *
 */
public class PC extends Computer{
	
	private String ram, hdd, cpu;
	public PC(String ram, String hdd, String cpu) {
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
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public Computer toCopy() {
		// TODO Auto-generated method stub
		return new PC(ram, hdd, cpu);
	}
	
	

}
