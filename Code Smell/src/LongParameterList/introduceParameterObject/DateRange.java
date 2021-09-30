package LongParameterList.introduceParameterObject;

public final class DateRange {
	
	final Date start;
	final Date end;
	public DateRange(Date strat, Date end) {
		this.start = strat;
		this.end = end;
	}
	
	Date getStart(){
		return start;
	}
	
	Date getEnd(){
		return end;
	}

}
