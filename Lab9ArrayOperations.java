import java.util.*;

public class Lab9ArrayOperations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//gets input for size of array and max value for numbers
		System.out.println("How many numbers would you like to generate?");
		int size=input.nextInt();
		System.out.println("What is the max value you would like to generate?");
		int max=input.nextInt();
		
		//generates array using the above parameters
		int[] array = generate(size, max);
		
		//displays forward
		display(array);
		
		//reverses then displays reverse
		reverse(array);
		display(array);
		
		input.close();
	}

	public static int[] generate (int size, int max){
		
		//creates array with the length of the size parameter
		int[] randArray = new int[size];
		
		//assigns random values to each index
		for(int i = 0; i<size; i++){
			randArray[i] = (int)(Math.random()*(max+1));
		}
		
		return randArray;
	}
	
	public static void display(int[] array){
		
		//beginning of format for neat printing
		String display="[";
		
		//loops through each index and appends to string
		for (int i = 0; i<array.length; i++){
			display = display + array[i] + ", ";			
		}
		
		//removes extra comma and space from the end
		display = display.substring(0, (display.length()-2));
		
		//finishes formatting of string
		display = display + "]";
		
		//prints string
		System.out.println(display);
	}
	
	public static void reverse(int[] array){
		
		//creates new array with same length as parameter
		int [] arrayCopy = new int[array.length];
		
		//copies values into the new array
		for (int i = 0; i<array.length; i++){
			arrayCopy[i] = array[i];
		}
		
		//copies values back into the parameter array in reverse order
		int x=0;
		for (int j = array.length-1; j>=0; j--){
			array[j]=arrayCopy[x];
			x++;
		}
		
	}
}
