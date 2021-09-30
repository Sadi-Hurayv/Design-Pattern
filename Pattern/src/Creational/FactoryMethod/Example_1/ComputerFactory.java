/**
 * 
 */
package Creational.FactoryMethod.Example_1;

/**
 * @author shuvra
 * 
 *The factory design pattern is used when:- 
 *		--> we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. 
 *		--> This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
 *
 *		Factory Design Pattern Advantages:
 *			--> Factory design pattern provides approach to code for interface rather than implementation.
 *			--> Factory pattern removes the instantiation of actual implementation classes from client code. 
 *			--> Factory pattern makes our code more robust, less coupled and easy to extend. 
 *			--> For example, we can easily change PC class implementation because client program is unaware of this.
 *			--> Factory pattern provides abstraction between implementation and client classes through inheritance.
 */
public class ComputerFactory {
	
//	public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {
//		Computer comp = null;
//		switch (type) {
//		case PC:
//			comp = new PC(ram,hdd,cpu);
//			break;
//		case SERVER:
//			comp = new Server(ram, hdd, cpu);
//			break;
//		case SUPERCOMPUTER:
//			comp = new SuperComputer(ram, hdd, cpu);
//			break;
//		}
//		return comp;
//	}
	
	public static Computer createComputer(Computer computer) {
	
		return computer.toCopy();
	}

}
