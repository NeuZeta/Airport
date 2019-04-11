import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AirportControllerSQL {	
	
	static Map<String, Integer> BCN_Distances = new HashMap<>();
	static Map<String, Integer> LDN_Distances = new HashMap<>();
	static Map<String, Integer> SXF_Distances = new HashMap<>();
	static Map<String, Integer> NYC_Distances = new HashMap<>();
	static Map<String, Integer> MEX_Distances = new HashMap<>();
	static Map<String, Integer> CA_Distances = new HashMap<>();
	
	static ArrayList<Airport> airports = new ArrayList<Airport>();
	
	public static ArrayList<Airport> createAirports() {	
		
		BCN_Distances.put("LDN", 1);
		BCN_Distances.put("SXF", 1);
		BCN_Distances.put("NYC", 2);
		BCN_Distances.put("MEX", 2);
		BCN_Distances.put("CA", 2);
		
		LDN_Distances.put("BCN", 1);
		LDN_Distances.put("SXF", 1);
		LDN_Distances.put("NYC", 2);
		LDN_Distances.put("MEX", 2);
		LDN_Distances.put("CA", 2);
		
		SXF_Distances.put("BCN", 1);
		SXF_Distances.put("LDN", 1);
		SXF_Distances.put("NYC", 2);
		SXF_Distances.put("MEX", 2);
		SXF_Distances.put("CA", 2);
		
		NYC_Distances.put("BCN", 2);
		NYC_Distances.put("LDN", 2);
		NYC_Distances.put("SXF", 2);
		NYC_Distances.put("MEX", 1);
		NYC_Distances.put("CA", 1);
		
		MEX_Distances.put("BCN", 2);
		MEX_Distances.put("LDN", 2);
		MEX_Distances.put("SXF", 2);
		MEX_Distances.put("NYC", 1);
		MEX_Distances.put("CA", 1);
		
		CA_Distances.put("BCN", 2);
		CA_Distances.put("LDN", 2);
		CA_Distances.put("SXF", 2);
		CA_Distances.put("NYC", 1);
		CA_Distances.put("MEX", 1);
		
		airports.add(new Airport("BCN", BCN_Distances));
		airports.add(new Airport("LDN", LDN_Distances));
		airports.add(new Airport("SXF", SXF_Distances));
		airports.add(new Airport("NYC", NYC_Distances));
		airports.add(new Airport("MEX", MEX_Distances));
		airports.add(new Airport("CA", CA_Distances));
		
		
		return airports;	
	}	
}
