/**
 * 
 */
package Creational.Prototype;

/**
 * @author shuvra
 * Advantage of Prototype Pattern:
 * 		--> It reduces the need of sub-classing.
 * 		--> It hides complexities of creating objects.
 * 		--> The clients can get new objects without knowing which type of object it will be.
 * 		--> It lets you add or remove objects at runtime.
 * 
 * Usage of Prototype Pattern
 * 		--> When the classes are instantiated at runtime.
 * 		--> When the cost of creating an object is expensive or complicated. 
 * 		--> When you want to keep the number of classes in an application minimum.
 * 		--> When the client application needs to be unaware of object creation and representation.
 */
public class EmployeeRecord implements Prototype {

	private String name, id;
	private int salary;
	
	public EmployeeRecord(String name, String id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public Prototype getClone() {
				return new EmployeeRecord(name, id, salary);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", ID: " + id + ", Salary: " + salary;
	}

}
