/**
 * This class will create a WordGuess object
 * and call its methods to play a game.
 * 
 * @author SS
 * @author Your Name Here
 * @version Your Date Here
 * 
 */

import java.util.Scanner;

public class PlayWordGuess {

   /**
    * main method handles the loop that asks the user to
    * guess letters until the game is over.
    * 
    *Wanghao Ying
    *April 20th
    */
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Set up a new game
      WordGuess game = new WordGuess();
   
      // Loop while the game isn't over yet.
      // ***** TODO 1: your code here
      // #1 TODO 1. Start the while-loop statement.
      while(game.isGameOver()==false) {
    	  
    	  // #2 how many remaining guesses that user has left.
    	  System.out.println("You have " + game.getGuessesLeft() + " guess(es) left.");
    	  
    	  // #3 get the user's word. the '_' for the unknown letters.
    	 System.out.println("The word so far: " + game.getUserWordWithSpaces());
    	 
    	 // #4 get the user's guessed words
    	 System.out.println("You've guessed: " + game.getLettersGuessed());
    	
    	 // #5 the prompt the user for their letters
    	 System.out.print("What letter will you guess next? ");
    	 String userStr = scnr.next();	// <- user's input.
    	 char userChar = userStr.charAt(0); // <- this code store the first letter in a char variable
    	 
    	 // #6 user's guess with the given letter. makeGuess() method.
    	 game.makeGuess(userChar); // <- user guessed letter.
    	 
    	 //#7 after the game is over, print out the result.
    	 System.out.println(game.getGameResult());
    	 
      }
      
      // (call the isGameOver method on the game object to see if the game is done)
      
         // Print out: 
         //   how many guesses the user has left 
         //   (call the getGuessesLeft method on the game object)
         // ***** TODO 2: your code here
      
      
         //   the user's word, with underscores for unknown letters
         //   (call the getUserWordWithSpaces method on the game object)
         // ***** TODO 3: your code here

         //   the letters guessed so far
         //   (call the ??? method on the game object)
         // ***** TODO 4: your code here
         
         // Prompt the user to guess a letter
         //   (use the scanner to get a string and store the first letter in a char variable)
         // ***** TODO 5: your code here
         
         // Use the game object to make the user's guess with the given letter.
         //   (call the ??? method on the game object)
         // ***** TODO 6: your code here
      
      // After the game is over, print out the result.
      // ***** TODO 7: your code here
      // (call the getGameResult method on the game object)
      

      // Close the scanner.
      scnr.close();
      
   } // end of the main method

}