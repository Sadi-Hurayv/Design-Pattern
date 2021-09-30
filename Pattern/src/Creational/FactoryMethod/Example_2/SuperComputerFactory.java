/**
 * 
 */
package Creational.FactoryMethod.Example_2;

/**
 * @author shuvra
 *
 */
public class SuperComputerFactory implements ComputerFactory {

	private String ram, hdd, cpu;
	public SuperComputerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new SuperComputer(ram, hdd, cpu);

	}

}
