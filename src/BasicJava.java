
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

import java.io.IOException;

public class BasicJava {

	public static void main(String[] args){
		String input = "";
		// TODO Auto-generated method stub
		// type sout and press clt+space and then double click for System.out.println
		// for formatting = clt=shift+f
//		for comment clt + /
//		int age = 25;
//		String name = "Shanthi";
//		System.out.println(name + " " + "Ammasaiappan");
//		System.out.println(22);
//		int i = 11;
//		i = i + i++;
//		System.out.println(i);
//		int temp = 20;
//		
//		
//		if( temp !=20){
//			System.out.println("its a hot day");
//		}
//		else {
//			System.out.println("its a beautiful day");
//		}
//		ArrayList<String> StFile = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		Scanner scnr = null;
//		try {
//		
//		File f = new File("C:\\Users\\ShanthiAmmasaiappan\\Desktop\\Shanthi\\NameList.txt");
//		 scnr = new Scanner(f);
//		
//		String sr;
//		while (scnr.hasNext()) {
//			sr = scnr.next();
//			StFile.add(sr);
//
//		}
//		System.out.println(StFile);
//		String[] array = StFile.toArray(new String[0]);	
//		
//		
//		for (String eachString : array) {
////			System.out.println(eachString);
//
//		}
//	} catch (IOException e) {
//
//		e.printStackTrace();
//		System.out.println("catch block is excepted");
//
//	} 
//		
//		do {
//			// GENERATE A RANDOM NUMBER BETWEEN MIN VAL & MAX VAL
//			Random rand = new Random();
//			int generateRandomNumber = 14;
//			String incorrectLetter = "";
//			int numberOfAttempts = 0;
//
//			// Guess a name: Choose a random number to pick a name from the list of names
//			
////			String guessedName = StFile.get(rand.nextInt(generateRandomNumber));
//			String[] array = StFile.toArray(new String[0]);	
//			String s_ran = array[rand. nextInt(generateRandomNumber)];
////			System.out.println(s_ran);
//			System.out.println("The number of letters in the guessed student name is : " + s_ran.length());
//
//			// Display the Guessed name by replacing with "_"
//			String maskedName = s_ran.replaceAll("\\w", "_");
//			char[] maskedNameArray = maskedName.toCharArray();
//			System.out.println("You are Guessing:" + maskedName);
//
//			// Game logic code
//			do {
//				System.out.println("Guess a letter:");
//				char letterEntered = sc.next().charAt(0);
//				
//				boolean characterMatched = false;
//
//				// checking the entered character with the guessed name
//				char[] nameToCharArray = s_ran.toCharArray();
//				for (int i = 0; i < nameToCharArray.length; i++) {
//
//					if (Character.toLowerCase(nameToCharArray[i]) == Character.toLowerCase(letterEntered)) {
//
//						maskedNameArray[i] = letterEntered;
//						characterMatched = true;
//					}
//				}
//
//				// if entered character is not matching then add to the incorrect letters string
//				if (characterMatched == false) {
//					incorrectLetter = incorrectLetter + " " + letterEntered;
//					numberOfAttempts++;
//				}
//
//				// display the result with number of attempts remaining
//				System.out
//						.println("You have guessed " + (numberOfAttempts) + " times wrong letters:" + incorrectLetter);
//
//				// display the masked character + correctly entered characters
//				System.out.println(String.valueOf(maskedNameArray));
//
//				// check if all the masked characters are same as the guessed name
//				// if true => game completed
//				if (String.valueOf(maskedNameArray).equalsIgnoreCase(s_ran)) {
//					System.out.println("You won!");
//					System.out.println("You have guessed " + "\'" + s_ran + "\'" + " correctly");
//					break;
//				}
//
//				// check for number of attempts
//			} while (numberOfAttempts < 5);
//
//			System.out.println("Do you want to play Hangman? Y/N");
//			input = sc.nextLine();
//			if (input.equalsIgnoreCase("Y")) {
//				break;
//
//			} else {
//				System.out.println("Bye");
//				System.exit(0);
//
//			}
//
//		} while (input.equalsIgnoreCase("Y"));
//
//		System.exit(0);

	}
}