package student.guess.game;

import java.util.Scanner;

public class HangManGameClass {

	boolean wannaPlayNewGame() {

		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.println("Do you want to continue? Y/N ");
		input = sc.next();
		if (input.equalsIgnoreCase("Y")) {
			return true;

		} else {
			System.out.println("Bye!" +"\n"+"See you later");

			return false;
		}

	}

}
