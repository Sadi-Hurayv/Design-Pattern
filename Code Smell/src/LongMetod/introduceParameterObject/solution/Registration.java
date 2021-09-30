package LongMetod.introduceParameterObject.solution;

public class Registration {
	
	Date submission;

	public Registration(Date submission) {
		this.submission = submission;
	}
	
	public boolean registrationSuccessful(DateRange range) {
		if(range.getStart().date <= submission.date && submission.date <= range.getEnd().date) {
			return true;
		}
		else {
			return false;
		}
	}

}
