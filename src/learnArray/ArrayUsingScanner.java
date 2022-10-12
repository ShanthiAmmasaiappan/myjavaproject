package learnArray;

import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of names:");
		int number = scan.nextInt();
		// https://www.youtube.com/watch?v=k69tOK9CJQc

		String[] arrayNames = new String[number];
		int count = 0;

		System.out.println("Enter the name");
		for (int i = 0; i < arrayNames.length; i++) {
			arrayNames[i] = scan.next();
		}

		for (int i = 0; i < arrayNames.length; i++) {
			System.out.println(arrayNames[i]);
		}
		for (int i = 0; i < arrayNames.length; i++) {
			if (arrayNames[i].equals("shan")) {
				System.out.println("shan is present at " + i + " index");
				count++;
			}
		}

		System.out.println(count + " times the name repeated.");

	}
}
