/**
 * 
 */
package Creational.Prototype;

/**
 * @author shuvra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmployeeRecord employee = new EmployeeRecord("Shuvra", "FU-09", 1000000);
		System.out.println("Employee object: ");
		System.out.println(employee);
		
		EmployeeRecord employeeCopy = (EmployeeRecord) employee.getClone();
		System.out.println("Employee copy_cbject: ");
		System.out.println(employeeCopy);
		
	}

}
