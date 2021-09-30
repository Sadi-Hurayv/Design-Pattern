package LongParameterList.introduceParameterObject;

public class Problem {
	
	Date submission;
	Date start;
	Date end;

	public Problem(Date submission, Date start, Date end) {
		super();
		this.submission = submission;
		this.start = start;
		this.end = end;
	}

	public void getRegistrationStatus() {
		if(registrationStatus(start, end)==true) {
			System.out.println("Successful!!!!");
		}
		else {
			System.out.println("Fail!!!!");
		}
	}
	
	public boolean registrationStatus(Date start, Date end)
	{
		if(start.date<=submission.date && submission.date<=end.date) {
			return true;
		}
		else {
			return false;
		}	
	}

}
