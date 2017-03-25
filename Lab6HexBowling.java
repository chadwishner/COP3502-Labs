import java.util.Scanner;

public class Lab6HexBowling {

	public static void main (String [] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//This is so it looks nice
		System.out.println("_________________________________________________________________");
		System.out.println("WELCOME TO HEXBOWLING!!!!");
		
		//This gets how many games with how many frames storing them in their respective variables
		System.out.println("How Many Games would you like to bowl today?");
		int games = input.nextInt();
		System.out.println("How Many frames would you like to bowl?");
		int frames = input.nextInt();
		
		//Creates a string to retrieve hex characters
		String hex = "0123456789ABCDEF";
		
		//For loop to repeat games
		for (int i = 1; i <= games; i++){
			
			//Preface for each game
			System.out.println("Game " + i + " Results:");
			
			//For loop to repeat frames
			for (int x = 1; x <= frames; x++){
				
				// variable to track pins remaining and for use in the random number generator
				int pins = 16;
				
				//Gets a random int from 0 to pins exluding pins
				int attempt1 = (int)(Math.random() * (pins));
				
				//uses attempt to get the corresponding hex value from hex string
				char ball1 = hex.charAt(attempt1);
				
				//keeps track of pins that were knocked down
				pins -= attempt1;
				
				//repeats the above process twice
				int attempt2 = (int)(Math.random() * (pins));
				char ball2 = hex.charAt(attempt2);
				pins -= attempt2;
				int attempt3 = (int)(Math.random() * (pins));
				char ball3 = hex.charAt(attempt3);
				pins -= attempt3;
				
				//Prints results in proper formatting, no new line to add comments about the results
				System.out.print("Frame" + x + "\t\t|\t" + ball1 + ball2 + ball3 + "\t|\t");
				
				//If strike appends appropriate congratulations
				if (attempt1==15){
					System.out.println("WAAAHOOO what a Strike!");
				}
				
				//if spare appends appropriate congratulations
				else if(pins==1){
					System.out.println("Nice Spare!");
				}
				
				//if any gutters without scoring spare mocks user
				else if(attempt1 == 0 || attempt2 == 0 || attempt3 == 0){
					System.out.println("Omg… a gutter ball");
				}
				
				//if none of the above happens ends line
				else{
					System.out.println();
				}
			}
		}
		
		//this is so it looks nice
		System.out.println("What a Day! Thanks for Playing!");
		System.out.println("_________________________________________________________________");
		
		//closes scanner
		input.close();
	}
}