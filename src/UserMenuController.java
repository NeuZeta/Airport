import java.util.ArrayList;

public class UserMenuController {
	
	private AirController airController;
	
	public UserMenuController(AirController airController) {
		this.airController = airController;
	}
	
	public void ask(String option) {
		System.out.println(option);

	}
	
	public Airport getAirportByName(String name) {
		return airController.getAirportByName(name);
	}
	
	public String findFlightByDestination(String departureName, String destinationName) {
		Airport departure = getAirportByName(departureName);
		Airport destination = getAirportByName (destinationName);
		
		ArrayList<String> flights = airController.findFlightsByDestination(departure, destination);
		
		String result = "";
		for (String f : flights) {
			result += f + "\n";
		}	
		return result;
	}
	
	public String findFlightByDate(String departureName, int day) {
		Airport departure = getAirportByName(departureName);
		
		ArrayList<String> flights = airController.findFlightsByDate(departure, day);
		
		String result = "";
		for (String f : flights) {
			result += f + "\n";
		}	
		return result;
	}
}
