/*  Write a program to write Rock, Paper, Scissors game in java.*/
package interviewjavaquestion;

import java.util.Scanner;

public class RockPaperScissorMain {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		RockPaperScissors rockPaperScissors = new RockPaperScissors();
//
//        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
//        int rounds = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < rounds; i++) {
//        	rockPaperScissors.playRockPaperScissors(scanner);
//
//	}
//
//}
	final static int ROCK = 1, SCISSOR = 2, PAPER = 3;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
        int player1 = scan.nextInt();
        System.out.println("Player 2: Choose (1) - Rock, (2) - Scissors, or (3) - Paper: ");
        int player2 = scan.nextInt();
     
        if (player1 == player2)
        {
            System.out.print("It is a tie");
        } else {
            switch (player1){
            case ROCK:
                if (player2 == SCISSOR)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case SCISSOR:
                if (player2 == PAPER)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case PAPER:
                if (player2 == ROCK)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            }
        }
        scan.close();
    }
}
