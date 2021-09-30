package PrimitiveObsession.replaceTypeCodeWithSubClass.solution;

public abstract class Employee {
	
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	abstract public int getType();

	public int monthlySalary;
//	public int commission;
//	public int bonus;
	
	
	
	public static Employee create(int type) {
		switch (type) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salseman();
		case MANAGER:
			return new Manager();
		default:
			throw new RuntimeException("Incorrect Employee Code");
		}
	}



	protected abstract int payAmount();
	
//	public int payAmount() {
//		return monthlySalary;
//	}

}
