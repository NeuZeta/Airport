import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		AirController airController = new AirController(random, PlaneControllerSQL.createPlanes(2, 2), AirportControllerSQL.createAirports());
		UserMenuController menuController = new UserMenuController(airController);
		
		airController.createCalendar();

		
		UserMenu menu = new UserMenu(reader, menuController);
		menu.Start();	
	}
}
