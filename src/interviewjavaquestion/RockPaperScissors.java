/* Write a program to write Rock, Paper, Scissors game in java. */
package interviewjavaquestion;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	 public void playRockPaperScissors(Scanner scanner) {
	        // Getting input from the user
	        System.out.println("Make a move! (rock/paper/scissors)");
	        String playerMove = scanner.nextLine();

	        // Getting input from the computer
	        Random random = new Random();
	        int randomNumber = random.nextInt(3);

	        String computerMove;
	        if (randomNumber == 0) {
	            computerMove = "rock";
	        } else if (randomNumber == 1) {
	            computerMove = "paper";
	        } else {
	            computerMove = "scissors";
	        }
	        System.out.println("Computer chose " + computerMove + "!");

	        // Print results
	        if (playerMove.equals(computerMove)) {
	            System.out.println("It's a draw!");
	        } else if (playerWins(playerMove, computerMove)) {
	            System.out.println("Player wins!");
	        } else {
	            System.out.println("Computer wins!");
	        }
	    }
	 public boolean playerWins(String playerMove, String computerMove) {
	        if (playerMove.equals("rock")) {
	            return computerMove.equals("scissors");
	        } else if (playerMove.equals("paper")) {
	            return computerMove.equals("rock");
	        } else {
	            return computerMove.equals("paper");
	        }
	    }

}
