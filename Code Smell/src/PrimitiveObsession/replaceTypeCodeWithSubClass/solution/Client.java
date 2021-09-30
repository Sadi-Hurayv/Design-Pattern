package PrimitiveObsession.replaceTypeCodeWithSubClass.solution;

public class Client {
	
	public static void main(String[] args) {
		Engineer engineer = null;
		Employee employee = Employee.create(engineer.getType());
		
		System.out.println(employee.payAmount());
	}

}