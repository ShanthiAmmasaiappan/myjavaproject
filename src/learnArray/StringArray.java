package learnArray;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameList = { "Shanthi", "Lekshmi", "Paru", "Shanthi", "Kavi", "Kiran" };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name to check : ");

		String name = sc.next();
		int count = 0;

		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].equals(name)) {
				System.out.println("The name is present at " + i + " index");
				count++;
			}
		}
		System.out.println(count + " times the name repeated.");
	}
}
