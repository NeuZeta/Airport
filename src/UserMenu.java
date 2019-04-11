import java.util.Scanner;

public class UserMenu {
	
	private Scanner reader;
	private UserMenuController menuController;
	
	public UserMenu(Scanner reader, UserMenuController menuController) {
		this.reader = reader;
		this.menuController = menuController;
	}
	
	public void Start() {
		System.out.println("Welcome to NeuZeta Airlines");
		
		menuController.ask("Select your departure airport:" + "\n" + "BCN , LDN , SXF , NYC , MEX , CA ");
		String departureAirport = reader.nextLine();
		
		menuController.ask("Search flight by:" + "\n" + "Destination [1] , Date [2]");
		String command = reader.nextLine();
		
		if (command.equals("1")) {	
			menuController.ask("Destination?:" + "\n" + "BCN , LDN  , SXF  , NYC  , MEX  , CA ");
			String destination = reader.nextLine();
			
			String response = menuController.findFlightByDestination(departureAirport, destination);
			System.out.println(response);
			
		} else if (command.equals("2")) {
			menuController.ask("Date? (number day from 1 to 30):");
			int day = reader.nextInt();
			
			String response = menuController.findFlightByDate(departureAirport, day);
			System.out.println(response);	
		}	
	}
}
