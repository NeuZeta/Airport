import java.util.ArrayList;

public class Day {

	private ArrayList<Flight> flights;
	private String name;

	public Day(String name) {
		this.name = name;
		this.flights = new ArrayList<Flight>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Flight> getFlights() {
		return this.flights;
	}

	@Override
	public String toString() {
		
		String s = this.name + ": \n";
		
		for (Flight f : flights) {
			s += f + "\n";
		}
		return  s;
	}	
}
