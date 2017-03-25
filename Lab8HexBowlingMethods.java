import java.util.Scanner;   /* Hint: You'll need this for getNumGames() and getNumFrames() */
 
public class Lab8HexBowlingMethods {
    /**
     * Main method. Do not modify it, but instead implement the functions that is uses:
     * TODO: Implement playGame()
     * TODO: Implement getNumGames() +
     * TODO: Implement getNumFrames() +
     * TODO: Implement getFrameScore() +
     */
    public static void main(String[] args){
        /* Print the program greeting */
        System.out.println("WELCOME TO HEXBOWLING!!!!");
 
        /* Get the number of games to play */
        int numberOfGames = getNumGames();
 
        /* Get the number of frames that each game will have */
        int numberOfFrames = getNumFrames();
 
        /* Call playGame the specified number of times, each game consisting of the specified number of frames */
        for(int gameNumber = 1; (gameNumber <= numberOfGames); gameNumber++){
            System.out.println("Game " + gameNumber + " Results:");
            playGame(numberOfFrames);
        }
 
        /* Print the goodbye message */
        System.out.println("What a Day! Thanks for Playing!");
    }
 
    /**
     * playGame():
     * Simulates a Hexbowling game of a given number of frames.
     *
     * Should print each of the game's frames as a single line.
     * For example, this is a possible result from calling playGame(4):
     *
     *      Frame 1 |   E00     |   Omg.. a gutter
     *      Frame 2 |   D20     |   Nice Spare!
     *      Frame 3 |   420     |
     *      Frame 4 |   F00     |   WAAAHOOO what a Strike!
     *
     * Makes use of getFrameScore() and getFrameComment() to make the second and third column of each frame's printout
     *
     * @param numFrames     number of frames that the game will consist of
     * @return              void. No return type, it just prints the game results as shown above.  */
    private static void playGame(int numFrames){
    	for (int x = 1; x <= numFrames; x++){		
			//Prints results in proper formatting, no new line to add comments about the results
			String score = getFrameScore();
    		System.out.println("Frame" + x + "\t\t|\t" + score + "\t|\t" + getFrameComment(score));
    	}
    }
    /**
     * getNumGames():
     * Prompts the user to input the number of games they wish to simulate.
     * Uses a locally-declared and locally-initialized Scanner object to read user input from System.in.
     * Returns the number the user inputs. Does not do any input validation.
     *
     * @return     the number input by the user
     */
    private static int getNumGames(){
        /* Get first input: Number of games to be played */
    	Scanner input = new Scanner(System.in);
    	System.out.println("How Many Games would you like to bowl today?");
		int games = input.nextInt();
		return games;
    }
 
    /**
     * getNumFrames():
     * Prompts the user to input the number of frames they wish for each game to have.
     * Uses a locally-declared and locally-initialized Scanner object to read user input from System.in.
     * Returns the number the user inputs. Does not do any input validation.
     *
     * @return     the number input by the user
     */
    private static int getNumFrames(){
        /* Get second input: Number of frames per game */
    	Scanner input = new Scanner(System.in);
    	System.out.println("How Many frames would you like to bowl?");
		int frames = input.nextInt();
		return frames;
    }
 
 
    /**
     * getFrameScore():
     * Randomly generates and returns a randomly-generated 3-hex-digit score as specified in Lab 6.
     *
     * @return      a string such as "D20", "F00", or "E02", as per the Lab 6 specifications
     */
    private static String getFrameScore(){
		String score ="";
    	// variable to track pins remaining and for use in the random number generator
		int pins = 16;
		
		//Gets a random int from 0 to pins exluding pins
		int attempt1 = (int)(Math.random() * (pins));
		
		//uses attempt to get the corresponding hex value from hex string
		String ball1 = Integer.toHexString(attempt1);
		
		//keeps track of pins that were knocked down
		pins -= attempt1;
		
		//repeats the above process twice
		int attempt2 = (int)(Math.random() * (pins));
		String ball2 = Integer.toHexString(attempt2);
		pins -= attempt2;
		int attempt3 = (int)(Math.random() * (pins));
		String ball3 = Integer.toHexString(attempt3);
		pins -= attempt3;
		score += ball1 + ball2 + ball3;
		return score;
    }
    /**
     * Freebie!
     * getFrameComment():
     * Takes in a 3-hex-digit frame score as a String and determines what comment it should go with.
     * @see getFrameScore()
     *
     * @return      a randomly-generated String such as "D20", "F00", or "E02", as per the Lab 6 specifications
     */
    private static String getFrameComment(String score){
        int throw1 = Integer.parseInt(""+score.charAt(0),16);
        int throw2 = Integer.parseInt(""+score.charAt(1),16);
        int throw3 = Integer.parseInt(""+score.charAt(2),16);
 
        if(throw1 == 15)
            return ("WAAAHOOO what a Strike!");
        else if(throw1 + throw2 + throw3 == 15)
            return ("Nice Spare!");
        else if(throw1 == 0 || throw2 == 0 || throw3 == 0)
            return ("Omg.. a gutter");
        else return "";
    }
}
