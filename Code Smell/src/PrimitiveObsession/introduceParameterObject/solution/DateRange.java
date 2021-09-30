package PrimitiveObsession.introduceParameterObject.solution;

public final class DateRange {
	
	final Date start;
	final Date end;
	
	public DateRange(Date start, Date end) {
		this.start=start;
		this.end=end;
	}
	
	Date getStart() {
		return start;
	}
	
	Date getEnd() {
		return end;
	}

}
