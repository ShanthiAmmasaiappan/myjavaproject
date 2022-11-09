package student.guess.game;

import java.util.Scanner;

public class StudentGuessGameClass  {
	Scanner sc = new Scanner(System.in);
	
	
	boolean restartGame() {
		String input = "";
		System.out.println("Do you want to play Hangman? Y/N");
		input = sc.next();
		if (input.equalsIgnoreCase("Y")) {
			return true;

		} else {
			System.out.println("Bye");
			
			return false;
		}
		
	}

}
