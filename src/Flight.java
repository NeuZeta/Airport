
public class Flight {

	private Airport departure;
	private Airport destination;
	private Plane plane;
	
	public Flight(Plane plane, Airport departure, Airport destination) {
		this.departure = departure;
		this.destination = destination;
		this.plane = plane;
	}
	
	public Airport getDeparture() {
		return departure;
	}
	public void setDeparture(Airport departure) {
		this.departure = departure;
	}
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	@Override
	public String toString() {
		return "Flight [departure = " + departure + ", destination = " + destination + ", plane = " + plane.getID() + "]";
	}	
}
