package PrimitiveObsession.replaceTypeCodeWithSubClass.solution;

public class Manager extends Employee {

	public int bonus;
	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Employee.MANAGER;
	}
	
	public int payAmount() {
		return monthlySalary+bonus;
	}

}
