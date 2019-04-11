import java.util.Map;

public class Airport {

	private String name;
	private Map<String, Integer> distances;
	private Day[] calendar;
	
	public Map<String, Integer> getDistances() {
		return distances;
	}

	public Airport(String name, Map<String, Integer> distances) {
		this.name = name;
		this.distances = distances;
		calendar = new Day[30];
	}

	public Day[] getCalendar() {
		return calendar;
	}

	public void setCalendar(Day[] calendar) {
		this.calendar = calendar;
	}
	
	public void printCalendar() {
		for (Day d : calendar) {
			System.out.println(d);
		}		
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name + "";
	}
}
