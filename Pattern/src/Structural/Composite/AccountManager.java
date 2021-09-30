/**
 * 
 */
package Structural.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shuvra
 *
 */
public class AccountManager implements Employee{

	private String id;
	private String name;
	private List<Employee> employees;
	
	public AccountManager(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.employees=new ArrayList<Employee>();
	}
	
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public void removeEmployee(Employee emp) {
		employees.remove(emp);
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(getID() + "\t" + "Account Manager" + "\t" + getName());
		
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			Employee employee = it.next();
			employee.printDetails();
		}
	}

}
