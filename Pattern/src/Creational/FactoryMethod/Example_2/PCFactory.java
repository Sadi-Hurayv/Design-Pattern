/**
 * 
 */
package Creational.FactoryMethod.Example_2;

/**
 * @author shuvra
 *
 */
public class PCFactory implements ComputerFactory {
	
	private String ram, hdd, cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram, hdd, cpu);
	}

}
