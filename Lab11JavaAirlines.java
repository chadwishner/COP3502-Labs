import java.util.Scanner;

public class Lab11JavaAirlines {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello and Welcome to Java Airlines!\nWhat will be the flight schedule for today?\n");
		
		//Make the three airplane flights
		Lab11AirplaneFlight flightOne = Lab11AirplaneFlight.createFlight();
		System.out.println();
		Lab11AirplaneFlight flightTwo = Lab11AirplaneFlight.createFlight();
		System.out.println();
		Lab11AirplaneFlight flightThree = Lab11AirplaneFlight.createFlight();
		
		while (true){
			System.out.println("\nMain Menu"); 
			System.out.println("1. View Plane Flight");  
			System.out.println("2. Change Flight Information");
			System.out.println("3. Exit");

			System.out.print("\nInput: ");
			int option = input.nextInt();
			System.out.println();
			
			int flight;
			
			//View Plane Flight
			if (option==1){
				System.out.print("Enter Flight Number: ");
				flight = input.nextInt();
				input.nextLine();
				
				switch (flight){
					case 1: flightOne.displayFlight(flight);
							break;
					case 2: flightTwo.displayFlight(flight);
							break;
					case 3: flightThree.displayFlight(flight);
							break;
				}
			}
			
			//Change Flight
			else if (option==2){
				System.out.print("Enter Flight Number: ");
				flight = input.nextInt();
				input.nextLine();
				
				switch (flight){
					case 1: flightOne.changeFlight();
							break;
					case 2: flightTwo.changeFlight();
							break;
					case 3: flightThree.changeFlight();
							break;
				}
			}
					
			//Exit
			else if (option == 3){
				break;
			}
		}
	}
}
