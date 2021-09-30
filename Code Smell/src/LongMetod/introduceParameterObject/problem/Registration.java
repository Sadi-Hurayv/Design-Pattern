package LongMetod.introduceParameterObject.problem;

public class Registration {
	
	Date submission;
	public Registration(Date submission) {
		this.submission=submission;
	}
	
	public boolean registrationSuccessful(Date start, Date end) {
		if(start.date<=submission.date && submission.date<=end.date) {
			return true;
		}
		else {
			return false;
		}
	}

}
