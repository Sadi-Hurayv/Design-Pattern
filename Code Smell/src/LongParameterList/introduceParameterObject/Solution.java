package LongParameterList.introduceParameterObject;

public class Solution {
	
	Date submission;
	DateRange range;
	public Solution(Date submission, DateRange range) {
		this.submission = submission;
		this.range = range;
	}
	
	public void getRegistrationStatus() {
		if(registrationStatus(range)==true) {
			System.out.println("Successful!!!!");
		}
		else {
			System.out.println("Fail!!!!");
		}
	}
	
	public boolean registrationStatus(DateRange range)
	{
		if(range.getStart().date<=submission.date && submission.date<=range.getEnd().date) {
			return true;
		}
		else {
			return false;
		}	
	}

}
