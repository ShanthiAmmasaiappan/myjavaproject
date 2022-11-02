package student.guess.game;

import java.util.Scanner;

import java.io.File;

import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class HangManGameMainClass {

	public static void main(String[] args) {

		HangManGameClass hangManGameClass = new HangManGameClass();

		Scanner sc = new Scanner(System.in);

		ArrayList<String> storeNameListFile = new ArrayList<String>();

		Scanner scnr = null;
		try {

			File f = new File("C:\\Users\\ShanthiAmmasaiappan\\Desktop\\Shanthi\\NameList.txt");
			scnr = new Scanner(f);

			String sr;
			while (scnr.hasNext()) {
				sr = scnr.next();
				storeNameListFile.add(sr);

			}
		} catch (IOException e) {

			e.printStackTrace();

		}

		do {
			// GENERATE A RANDOM NUMBER BETWEEN MIN VAL & MAX VAL
			Random rand = new Random();
			int randomNumberGenerator = 14;
			String incorrectLetter = "";
			int numberOfAttempts = 0;
			int points = 5;

			// Guess a name: Choose a random number to pick a name from the list of names

			String[] array = storeNameListFile.toArray(new String[0]);
			String guessedName = array[rand.nextInt(randomNumberGenerator)];

			System.out.println("The number of letters in the guessed student name is : " + guessedName.length());

			// Display the Guessed name by replacing with "_"
			String maskedName = guessedName.replaceAll("\\w", "_");
			char[] maskedNameArray = maskedName.toCharArray();
			System.out.println("You are Guessing:" + maskedName);

			// Game logic code
			do {
				System.out.println("Guess a letter:");
				char letterEntered = sc.next().charAt(0);

				boolean characterMatched = false;

				// checking the entered character with the guessed name
				char[] nameToCharArray = guessedName.toCharArray();
				for (int i = 0; i < nameToCharArray.length; i++) {

					if (Character.toLowerCase(nameToCharArray[i]) == Character.toLowerCase(letterEntered)) {

						maskedNameArray[i] = letterEntered;
						characterMatched = true;
					}
				}

				// if entered character is not matching then add to the incorrect letters string
				if (characterMatched == false) {
					incorrectLetter = incorrectLetter + " " + letterEntered;
					numberOfAttempts++;
					points--;
				}

				// display the result with number of attempts remaining
				System.out.println("You have guessed " + numberOfAttempts + " times wrong letters:" + incorrectLetter);
				System.out.println("The points you scored is " + points + " points");
				if (points == 0) {
					System.out.println("Game over");
					System.exit(0);
				}

				// display the masked character + correctly entered characters
				System.out.println(String.valueOf(maskedNameArray));

				// check if all the masked characters are same as the guessed name
				// if true => game completed
				if (String.valueOf(maskedNameArray).equalsIgnoreCase(guessedName)) {
					System.out.println("You have guessed " + "\'" + guessedName + "\'" + " correctly");
					System.out.println("The points you scored is " + points + " points");
					System.out.println("You won the game!" + "\n" + "Congragulations");

					break;
				}

				// check for number of attempts
			} while (numberOfAttempts < 5);

		} while (hangManGameClass.wannaPlayNewGame());

		System.exit(0);

	}
}
