import java.util.Scanner;
public class Lab7TipCalculator {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		
		//ask for inputs
		System.out.println("What is the amount for your bill?");
		double billAmount = input.nextDouble();
		
		System.out.println("What percent do you want to tip for gratuity? (as an integer)");
		int percent = input.nextInt();

		System.out.println("What is your server's name?");
		String serverName = input.next();
		
		//outputs
		
		//call amountTipped method
		double tipAmount = amountTipped(billAmount, percent);
		System.out.println("$" + tipAmount + "\t" + message(tipAmount, serverName));
	}	
	
	//amountTipped method to calculate tip as a double
	public static double amountTipped(double bill, int percent){
		double tipped = bill * (percent / 100.0);
		return tipped;
	}
	
	//message method returns a string with parameters being a double and a string
	public static String message(double tipAmount, String serverName){
		
		//pre-initializing that only exist in "for" loop in the method
		String message = "";
		
		//at least one exclamation mark
		String exclamationString = "!";
		
		//random number between 0 and 11
		int exclamations = (int)((Math.random() * 12));
	
		//for loop to get a string with 1-11 exclamation points
		for(int i = 1; i < exclamations; i++){
			exclamationString += "!";
		}
		
		//selection statements that assign value to string variable "message"
		if(tipAmount <= 5){
			message = "Thanks for your help, " + serverName + ". :)";
		}
		else if(tipAmount > 5 && tipAmount < 10){
			message = "";
		}
		else{
			message = "Have a nice day, " + serverName + ". Don't spend it all in one place" + exclamationString;
		}
		return message;
	}	
}
