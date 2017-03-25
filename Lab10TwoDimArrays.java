import java.*;
/* Chad, Seth, Kevin 
 */

public class Lab10TwoDimArrays {
	
	public static void main(String [] args){
		//call convertArgs method in order to convert the arguments into ascii ints to save them in a 2D array
		int [][] convertedArgs = convertArgs(args);
		//calls the printArray to print the array in the proper format
		printArray(convertedArgs);
	}
	
	public static void printArray (int[][] array){
		//create a nested for loop to go through each array index and print in the proper format
		for(int i = 0; i<array.length; i++){
			for(int j = 0; j<array[i].length; j++){
				System.out.format("%-10d", array[i][j]);
		
			}
			//create a new line
			System.out.println();
		}
	}
	
	public static int[][] convertArgs (String [] array){
		
		//create and initialize a variable to save the length of the longest word to find out how man columns we want
		int longestWord = 0;
		//for loop with if-statement to save the length of the longest word
		for(int i = 0; i<array.length; i++ ){
			if (array[i].length()>longestWord){
				longestWord = array[i].length();
			}
		}
		
		//create the 2D array and make the row and collumns the correct amount
		int [][] arrayConverted = new int[array.length][longestWord];
		
		//nested for loop to set all values to -1 from the start
		for(int i = 0; i<array.length; i++){
			for(int j = 0; j<longestWord; j++){
				arrayConverted[i][j] = -1;
			}
		}
		
		//nested for loop to run through each word and save the ascii value in the correct 2D array index
		for(int i = 0; i<array.length; i++ ){
			int word = array[i].length();
			for(int j = 0; j<word; j++){
				arrayConverted[i][j] = (int)array[i].charAt(j);
			}
		}
		//return the converted array
		return arrayConverted;
	}
	
}
