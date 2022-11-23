/*  Write a program to write Rock, Paper, Scissors game in java.*/
package interviewjavaquestion;

import java.util.Scanner;

public class RockPaperScissorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		RockPaperScissors rockPaperScissors = new RockPaperScissors();

        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rounds; i++) {
        	rockPaperScissors.playRockPaperScissors(scanner);

	}

}
}
