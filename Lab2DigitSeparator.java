//This program will separate the digits of a four-digit number inputted by the user
import java.util.Scanner;
public class Lab2DigitSeparator {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a four-digit integer:");
//This will assign the user input to an integer named number
		int number = input.nextInt();
//These next 4 lines separate the number by using a combination of division mod
		int thousands = number/1000;
		int hundreds = (number%1000)/100;
		int tens = ((number%1000)%100)/10;
		int ones = (((number%1000)%100)%10)/1;
//These next 4 lines will print the separated digits
		System.out.println("The thousands digit is "+thousands);
		System.out.println("The hundreds digit is "+hundreds);
		System.out.println("The tens digit is "+tens);
		System.out.println("The ones digit is "+ones);
		}
}
