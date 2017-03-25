//Import scanner to recieve user inputs 
import java.util.Scanner;
public class Lab3IdeaSpread {
	public static void main (String [] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("How many people will you share your majorly controversial idea with, risking loss of friendship and respect?");
//Save user input as followers 	
		int followers = userinput.nextInt();
//Calculate a random number between 0<=x<1
//Multiply it by 1000 and cast as an integer in order to truncate to 1 decimal point 	
		double retweetsPercentage = (int) (Math.random()*1000);
//Print the percentage of retweets, divide our variable by 10 in order to get proper percentage		
		System.out.println("The percentage of your follower that retweet your controversial idea is " + retweetsPercentage/10);
//Save number of retweets as integer then calculate each round 
		int numRetweeters = (int)(followers * retweetsPercentage/1000);
		int round1 = (int) (Math.pow(numRetweeters, 1));
		int round2 = (int) (Math.pow(numRetweeters, 2));
		int round3 = (int) (Math.pow(numRetweeters, 3));
		int round4 = (int) (Math.pow(numRetweeters, 4));
		System.out.println("Projecting four rounds into the future..." + (round1+round2+round3+round4));
	}
}