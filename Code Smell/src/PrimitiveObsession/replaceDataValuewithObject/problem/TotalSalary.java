package PrimitiveObsession.replaceDataValuewithObject.problem;

public class TotalSalary {
	
	double totalSalary, baseSalary, medicalAllowance, houseRentAllowance;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	public double getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(double houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}
	
	public double calculateTotalSalary() {
		totalSalary=baseSalary+medicalAllowance+houseRentAllowance;
		return totalSalary;
	}

}
