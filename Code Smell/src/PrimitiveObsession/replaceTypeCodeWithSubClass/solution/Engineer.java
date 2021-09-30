package PrimitiveObsession.replaceTypeCodeWithSubClass.solution;

public class Engineer extends Employee {

	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Employee.ENGINEER;
	}
	
	public int payAmount() {
		return monthlySalary;
	}

}
