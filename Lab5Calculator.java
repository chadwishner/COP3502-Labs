//Import scanner utility
import java.util.Scanner;
public class Lab5Calculator {
	public static void main (String[] args){
//create new scanner
		Scanner input = new Scanner (System.in);
//ask user for a number that will be the max value, save it as max and use (0-stop) to get minumum value
		System.out.println("What number would you like to stop at (as an integer)?");
		int stop = input.nextInt();
		int negstop = 0-stop;
//ask user for starting number, save as double
		System.out.println("Enter a starting number:");
		double start = input.nextDouble();
//declare variable answer to the same as start (we need to keep writing over 'start')		
		double answer = start;
//use a do-while statement to ensure that the code goes once
		do {
//ask user for operation and use switch statment to ensure that user inputs a proper input
			System.out.println("What operation would you like to do? Multiplication(*), Division(/), Subtraction(-), or Addition(+)");
			String operation = input.next();
			switch (operation){
				case "+":
					break;
				case "-":
					break;
				case "*":
					break;
				case "/":
					break;
				default: System.out.println("Error: Please enter your operation again (+, -, *, /)");
			}
//ask user for second operand and save it
			System.out.println("Enter your new number:");
			double number = input.nextDouble();
//use if-else statements to convert user's input into a math statement
//use Math.round to round to nearest integer
			if (operation.equals("+")) {
				answer = Math.round(answer+number);
				System.out.println("Your running total is " + answer);
			}
			else if (operation.equals("-")) {
				answer = Math.round(answer-number);
				System.out.println("Your running total is " + answer);
			}
			else if (operation.equals("*")) {
				answer = Math.round(answer*number);
				System.out.println("Your running total is " + answer);
			}
			else if (operation.equals("/")) {
				answer = Math.round(answer/number);
				System.out.println("Your running total is " + answer);
			}
//while ensures that the loop continues as long as the answer is between the minimum and maximum that the user inputed earlier
		} while (answer <= stop && answer >= negstop);
	}
}