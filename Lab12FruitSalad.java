import java.util.*;

public class Lab12FruitSalad {
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		Lab12Fruit [] array = new Lab12Fruit [Integer.parseInt(args[0])];
		while (true){
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Cut ingredients");
			System.out.println("4. Start over");
			System.out.println("5. Print ingredients");
			System.out.println("6. Finish");
			System.out.println("Choice: ");
			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
				case 1: add(array, input);
					break;
				case 2: remove(array, input);
					break;
				case 3: cut(array);
					break;
				case 4: restart(array);
					break;
				case 5: display(array);
					break;
				case 6: display(array); System.exit(0);
					break;
			}
		}
	
	}
	
	public static void add(Lab12Fruit [] a, Scanner s){
		Lab12Fruit newFruit;
		System.out.println("Do you know the weight? (\"yes\"/\"no\")");
		String knowWeight = s.nextLine();
		
		int weight = 0;
		if (knowWeight.equalsIgnoreCase("yes")){
			System.out.println("What is the weight of the fruit: ");
			weight = s.nextInt();
			s.nextLine();
		}
		System.out.println("What is the name of the fruit: ");
		String name = s.nextLine();
		System.out.println("What is the color of the fruit: ");
		String color = s.nextLine();
		
		if (knowWeight.equalsIgnoreCase("yes")){
			System.out.println("Is the fruit cut");
			boolean cut = s.nextBoolean();
			newFruit = new Lab12Fruit(name, color, weight, cut);
		}
		else {
			newFruit = new Lab12Fruit(name, color);

		}
		for (int row = 0; row < a.length; row++){
			if (a[row] == null){
				a[row] = newFruit;
			}
		}
	}
	
	public static void remove(Lab12Fruit [] f, Scanner s){
		System.out.println("Which fruit would you like to remove: ");
		String removeFruit = s.nextLine();
		
		for (int row = 0; row > f.length; row++){
			if (f[row].getName().equalsIgnoreCase(removeFruit)){
				f[row] = null;
				break;
			}
		}
	}
	
	public static void cut(Lab12Fruit [] f){
		boolean cut = true;
		for (int row = 0; row > f.length; row++){
			f[row].setCut(cut);
		}
	}
	
	public static void restart(Lab12Fruit [] f){
		for (int row = 0; row > f.length; row++){
			f[row] = null;
		}
	}
	
	public static void display(Lab12Fruit [] f){
		for (int row = 0; row < f.length; row++){
			if (f[row] != null){
				System.out.println("Fruit: " + f[row].getName());
				System.out.println("Color: " + f[row].getColor());
				System.out.println("Weight: " + f[row].getWeight());
				System.out.println("Cut: " + f[row].isCut());
				System.out.println();
			}
		}
	}
}


