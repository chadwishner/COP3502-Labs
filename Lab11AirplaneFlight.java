import java.util.Scanner;

public class Lab11AirplaneFlight {
	private static String departDest = "Gainesville, Florida";
	private String arrivalDest;
	private double etd;
	private double eta;
	
	public Lab11AirplaneFlight (String departDest, String arrivalDest, double etd, double eta){
		this.departDest = departDest;
		this.arrivalDest = arrivalDest;
		this.etd = etd;
		this.eta = eta;
	}
	public void displayFlight(int flightNumber){
		System.out.println("Flight #" + flightNumber + " Information:");
		System.out.println("Departing Destination:\t" + departDest);
		System.out.println("Arrival Destination:\t" + arrivalDest);
		System.out.println("Est Time of Departure:\t" + formatTime(etd));
		System.out.println("Est Time of Arrival:\t" + formatTime(eta));
	}
	public static Lab11AirplaneFlight createFlight(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Flight Information:");
		System.out.print("Arrival Destination: ");
		String arrivalDest = sc.nextLine();
		System.out.print("Estimated Time of Departure: ");
		double etd = sc.nextDouble();
		System.out.print("Estimated Time of Arrival: ");
		double eta = sc.nextDouble();
		
		return new Lab11AirplaneFlight(departDest, arrivalDest, etd, eta);
	}
	public Lab11AirplaneFlight changeFlight(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Flight Information:");
		System.out.print("Arrival Destination: ");
		String arrivalDest = sc.nextLine();
		System.out.print("Estimated Time of Departure: ");
		double etd = sc.nextDouble();
		System.out.print("Estimated Time of Arrival: ");
		double eta = sc.nextDouble();
		
		return new Lab11AirplaneFlight(departDest, arrivalDest, etd, eta);
	}
	public String formatTime(double time){
		String pm = "am";
		if (time >= 12){
			pm = "PM";
		}
		String formattedTime = (int)time+ ":" + (int)((time%1)*100) + pm;
		
		return formattedTime;
	}
}

