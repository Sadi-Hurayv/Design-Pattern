/**
 * 
 */
package Creational.Singleton;

/**
 * @author shuvra
 * Introduction:
 * 		--> Singleton pattern restricts the instantiation of a class 
 * 		--> ensures that only one instance of the class exists in the Java virtual machine. 
 * 		--> The singleton class must provide a global access point to get the instance of the class.
 * 		--> Singleton pattern is used for logging, drivers objects, caching and thread pool.
 * 		--> Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
 * 		--> Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
 */
public class President {
	
	private String name, age;
	private static President president;
	
	private President(String name, String age) {
		setName(name);
		setAge(age);
	}
	
	public static President getPresident(String name, String age) {
		if(president == null) {
			president = new President(name, age);
		}
		else {
			System.out.println("President already exist!!!");
		}
		return president;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + ", Age: " + getAge();
	}

}
