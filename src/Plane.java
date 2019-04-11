
public class Plane {

	private final String ID;
	private Airport currentAirport;
	private Flight route;
	
	private PlaneType planeType;
	
	private PlaneStatus planeStatus;
	
	public Plane (String name, PlaneType planeType) {
		this.ID = name;
		this.planeType = planeType;
		planeStatus = PlaneStatus.GROUNDED;
	}

	public Airport getCurrentAirport() {
		return currentAirport;
	}
	
	public void setCurrentAirport(Airport currentAirport) {
		this.currentAirport = currentAirport;
	}

	public PlaneType getPlaneType() {
		return this.planeType;
	}

	public PlaneStatus getPlaneStatus() {
		return planeStatus;
	}
	
	public void setPlaneStatus (PlaneStatus status) {
		planeStatus = status;
	}
	
	public Flight getRoute() {
		return route;
	}

	public void setRoute(Flight route) {
		this.route = route;
	}

	public String getID() {
		return ID;
	}	
}
