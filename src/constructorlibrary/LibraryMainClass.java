package constructorlibrary;

import java.util.Scanner;

public class LibraryMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDetails romeoAndJuliet = new BookDetails("Romeo and Juliet", "Shakespere");
		BookDetails peaceOfMind = new BookDetails("Peace of Mind", "Allen");
		BookDetails homeBody = new BookDetails("Home Body", "Rupi Kaur");
		BookDetails twoStates = new BookDetails("Two States", "Chetan Bhagat");
		BookDetails halfGirlfriend = new BookDetails("Half Girlfriend", "Chetan Bhagat");
		BookDetails oliverTwist = new BookDetails("Oliver Twist", "Charles Dickens");
		BookDetails macbeth = new BookDetails("Macbeth", "Shakespere");
		BookDetails harrypotter1 = new BookDetails("Harry Potter and the Sorcere's Stone", "J K Rowling");
		BookDetails malgudyDays = new BookDetails("Malgudy Days", "R K Narayan");
		BookDetails alchemist = new BookDetails("Alchemist", "Paulo Coehlo");

		// Array of Objects - classname variablename = {obj};
		BookDetails[] bookDetails = { romeoAndJuliet, peaceOfMind, homeBody, twoStates, halfGirlfriend, oliverTwist,
				macbeth, harrypotter1, malgudyDays, alchemist };
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int bookCount = 0;
		int count = 0;

		do {

			System.out.println("Which book you want to be issued");
			String requiredBookName = sc.nextLine();
			System.out.println("Who is the author");
			String bookAuthor = sc.nextLine();

			// iterating over the array
			for (int i = 0; i < bookDetails.length; i++) {
				if (requiredBookName.equals(bookDetails[i].bookName) && bookAuthor.equals(bookDetails[i].authorName)
						&& !bookDetails[i].isBookIssued) {
					bookDetails[i].isBookIssued = true;
					System.out.println(bookDetails[i].bookName + " is issued");
					flag = 0;
					bookCount++;

					if (count < 2) {
						System.out.println("Do you want to continue:");
						String proceed = sc.nextLine();

						if (proceed.equalsIgnoreCase("Y")) {
							count++;
						} else if (proceed.equalsIgnoreCase("N")) {
							System.exit(0);
						}

					}
					break;

				} else if (requiredBookName.equals(bookDetails[i].bookName)
						&& bookAuthor.equals(bookDetails[i].authorName) && bookDetails[i].isBookIssued) {
					bookDetails[i].isBookIssued = false;

					System.out.println("Book is already issued");
					System.out.println("Do you want to continue:");
					String proceed = sc.nextLine();
					flag = 0;
					if (proceed.equalsIgnoreCase("Y")) {
						break;
					} else if (proceed.equalsIgnoreCase("N")) {
						System.exit(0);
					}
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("Not in the list");
			}
		} while (bookCount < 3);
		System.exit(0);
	}

}
