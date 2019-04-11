import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class AirController {
	
	private Random random;
	private ArrayList<Plane> planes;
	private ArrayList<Airport> airports;

	public AirController(Random random, ArrayList<Plane> planes, ArrayList<Airport> airports) {
		this.random = random;
		this.planes = planes;
		this.airports = airports;
		
		assignStartingAirport();	
	}
	
	public void assignStartingAirport() {
		for (Plane p: planes) {
			Airport a = airports.get(random.nextInt(airports.size()));
			p.setCurrentAirport(a);
		}
	}
	
	public void printAllPlanes() {
		for (Plane p: planes) {
			String airport = p.getCurrentAirport().getName();
			String plane = p.getID();
			System.out.println(plane + " currently is at: " + airport);		
		}
	}
	
	public void createCalendar() {
		int i = 0;
		while (i < 30) {
			for (Airport a : airports) {
				Day d = new Day("day" + (i+1));
				a.getCalendar()[i] = d;
			}
			for (Plane p : planes) {
				//Control if the plane is still flying
				//If it is flying, change it's status to grounded				
				switch (p.getPlaneStatus()) {
				case FLYING:
					p.setPlaneStatus(PlaneStatus.GROUNDED);
					break;
					
				case GROUNDED:
					//If it is grounded
					switch (p.getPlaneType()) {
					
						case LONG_DISTANCE:
							Flight newLongFlight = createFlight(p, p.getCurrentAirport(), PlaneType.LONG_DISTANCE.getDays());
							p.setRoute(newLongFlight);
							p.getCurrentAirport().getCalendar()[i].getFlights().add(newLongFlight);
							p.setCurrentAirport(newLongFlight.getDestination());
							//next day this plane will be still flying
							p.setPlaneStatus(PlaneStatus.FLYING);
							break;
						
						case SHORT_DISTANCE:
							Flight newShortFlight = createFlight(p, p.getCurrentAirport(), PlaneType.SHORT_DISTANCE.getDays());
							p.setRoute(newShortFlight);
							p.getCurrentAirport().getCalendar()[i].getFlights().add(newShortFlight);
							p.setCurrentAirport(newShortFlight.getDestination());
							p.setPlaneStatus(PlaneStatus.GROUNDED);
							break;
					}
					break;
				}
			}
			i++;
		}
	}
	
	public Airport getAirportByName(String name) {
		for (Airport a : airports) {
			if (a.getName().equals(name)) {
				return a;
			}
		}
		return null;
	}
	
	public Flight createFlight(Plane p, Airport a, int distance) {

		ArrayList<String> cities = new ArrayList<String>();
		Map<String, Integer> distances = a.getDistances();
		
		distances.forEach ((k, v) -> {
           if (v == distance) {
        	   cities.add(k);
           }
        });
		
		String randomCity = cities.get(random.nextInt(cities.size()));	
		
		return new Flight(p, a, getAirportByName(randomCity));
	}
	
	public ArrayList<String> findFlightsByDestination (Airport origin, Airport destination){
		ArrayList<String> flights = new ArrayList<String>();
		
		Day[] calendar = origin.getCalendar();
		
		for (Day d : calendar) {
			ArrayList<Flight> allFlights = d.getFlights();
			for (Flight f : allFlights) {
				if (f.getDestination().getName().equalsIgnoreCase(destination.getName())){
					String temp = d.getName() + ": \n" + f.toString();
					flights.add(temp);
				}
			}
		}
		return flights;
	}	

	public ArrayList<String> findFlightsByDate (Airport origin, int day){
		ArrayList<String> flights = new ArrayList<String>();
		
		Day[] calendar = origin.getCalendar();
		ArrayList<Flight> flightsArray = calendar[day-1].getFlights();
		
		for (Flight f : flightsArray) {
			String temp = calendar[day-1].getName() + ": \n" + f.toString();
			flights.add(temp);
		}
		return flights;
	}
}

