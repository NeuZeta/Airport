import java.util.ArrayList;

public class PlaneControllerSQL {
	
	public static ArrayList<Plane> createPlanes(int shortNumber, int longNumber) {
		
		//Create Planes
		ArrayList<Plane> planes = new ArrayList<Plane>();
		
		for (int i = 0; i < shortNumber; i++) {
			String name = "S-Plane" + i;
			Plane plane = new Plane(name, PlaneType.SHORT_DISTANCE);
			planes.add(plane);
		}
		
		for (int j = 0; j < longNumber; j++) {
			String name = "L-Plane" + j;
			Plane plane = new Plane(name, PlaneType.LONG_DISTANCE);
			planes.add(plane);
		}
		return planes;	
	}
}
