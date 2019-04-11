
public enum PlaneType {
	
	SHORT_DISTANCE(1),
	LONG_DISTANCE(2);
		
	private int days;
		
	private PlaneType(int days) {
		this.days = days;
	}

	public int getDays() {
		return this.days;
	}		
}
