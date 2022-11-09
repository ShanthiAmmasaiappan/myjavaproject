package student.guess.game;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class StudentGuessGameMainClass {
	

	public static void main(String[] args)  {
		
		StudentGuessGameClass guessGameClass = new StudentGuessGameClass();

		Scanner sc = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<String>();
		try {
		

		// INPUT FILE
		File f = new File("C:\\Users\\ShanthiAmmasaiappan\\Desktop\\Shanthi\\NameList.txt");

		// READ THE ABOVE FILE AND STORE IN A STRING ARRAY LIST

		BufferedReader b = new BufferedReader(new FileReader(f));

		String readLine = "";

		while ((readLine = b.readLine()) != null) {
			if (!readLine.isEmpty()) {
				ar.add(readLine);
				System.out.println(readLine);
			}
		}
	} catch (IOException e) {

		e.printStackTrace();

	}

		do {
			// GENERATE A RANDOM NUMBER BETWEEN MIN VAL & MAX VAL
			Random rand = new Random();
			int generateRandomNumber = 14;
			String incorrectLetter = "";
			int numberOfAttempts = 0;		
			
			// Guess a name: Choose a random number to pick a name from the list of names
			String guessedName = ar.get(rand.nextInt(generateRandomNumber));
			System.out.println("The number of letters in the guessed student name is : " + guessedName.length());

			// Display the Guessed name by replacing with "_"
			String maskedName = guessedName.replaceAll("\\w", "_");
			char[] maskedNameArray = maskedName.toCharArray();
			System.out.println("You are Guessing:" + maskedName);

			//Game logic code
			do {
				System.out.println("Guess a letter:");
				char letterEntered = sc.next().charAt(0);

				boolean characterMatched = false;

				//checking the entered character with the guessed name
				char[] nameToCharArray = guessedName.toCharArray();
				for (int i = 0; i < nameToCharArray.length; i++) {

					if (Character.toLowerCase(nameToCharArray[i]) == Character.toLowerCase(letterEntered)) {

						maskedNameArray[i] = letterEntered;
						characterMatched = true;
					}
				}

				//if entered character is not matching then add to the incorrect letters string
				if (characterMatched == false) {
					incorrectLetter = incorrectLetter + " " + letterEntered;
					numberOfAttempts++;
				}

				//display the result with number of attempts remaining
				System.out.println("You have guessed " + (numberOfAttempts) + " times wrong letters:" + incorrectLetter);
				
				//display the masked character + correctly entered characters
				System.out.println(String.valueOf(maskedNameArray));

				//check if all the masked characters are same as the guessed name
				//if true => game completed
				if (String.valueOf(maskedNameArray).equalsIgnoreCase(guessedName)) {
					System.out.println("You won!");
					System.out.println("You have guessed " + "\'" + guessedName + "\'" + " correctly");
					break;
				}
				
			//check for number of attempts
			} while (numberOfAttempts < 5);
	
		} while (guessGameClass.restartGame());

		System.exit(0);

	}
}
