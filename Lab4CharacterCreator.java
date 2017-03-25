//first we imported the scanner
	import java.util.Scanner;
	public class Lab4CharacterCreator {
		public static void main(String[] args) {
//create new scanner
			Scanner input = new Scanner (System.in);
//ask user three independent questions 
			System.out.println("What gender is your character?");
			String gender = input.next();
			System.out.println("What color will your character wear?");
			String color = input.next();
			System.out.println("How many inches will your character's hair be?");
			int inches = input.nextInt();
//declare these integers and strings so we can refer to them later in the code
			int pet = 0;
			String season = "none";
			int language = 0;
//if the character is male and wears red ask what pet he prefers,otherwise ask what season your character prefers
			if (gender.equalsIgnoreCase("male") && color.equalsIgnoreCase("red")){
				System.out.println("Does the character prefer dogs or cats? Please enter '1' for dogs and '2' for cats.");
				pet = input.nextInt();
			}
			else{
				System.out.println("Does your character prefer winter or summer?");
				season = input.next();
			}
//if the character is female xor wears ask if she prefers java or c++
			if (gender.equalsIgnoreCase("female") ^ color.equalsIgnoreCase("green")){
				System.out.println("Does the character prefer java or c++? Please enter '1' for java and '2' for c++.");
				language = input.nextInt();
			}
//this is where we start printing out information about the users character 
			System.out.println("Your character's gender is " + gender + ".");
			System.out.println("Your character is wearing an awesome " + color + " shirt.");
//create a set of if/else if/else to print out different statements depending on hair length
			if (inches < 5){
				System.out.println("Your character has short hair.");
			}
			else if (inches < 10){
				System.out.println("Your character has medium hair");
			}
			else{
				System.out.println("Your character has long hair");
			}
//if the user was asked what their character's pet preference was, print out the proper statement. using stacked if/else statements to determine which print line to use
			if (gender.equalsIgnoreCase("male") && color.equalsIgnoreCase("red")){
				if (pet == 1){
					System.out.println("Your character really loves dogs.");
				}
				else{
					System.out.println("Your character really loves cats.");
				}
			}
//if the user was not asked what pet the character prefers, print out what season they prefer.
			else{
				System.out.println("Your character enjoys " + season + ".");
			}
//if the user what programming language the character prefers print out the proper statement. using stacked if/else statements to determine which line to print out to user
			if (gender.equalsIgnoreCase("female") ^ color.equalsIgnoreCase("green")){
				if (language == 1){
					System.out.println("Your character loves coding java.");
				}
				else{
					System.out.println("Your character loves coding c++.");
				}
			}
//if the character wears blue or orange print out go gators
			if (color.equalsIgnoreCase("orange") || color.equalsIgnoreCase("blue")){
				System.out.println("Go Gators!");
			}
	}				
}