package LongParameterList.introduceParameterObject;

public class Main {
	
	public static void main(String args[]) {
		
		Date start = new Date(15);
		Date end = new Date(25);
		Date submission = new Date(20);
		
		DateRange range = new DateRange(start,end);
		
		Solution sol = new Solution(submission, range);
		sol.getRegistrationStatus();
		
	}

}
