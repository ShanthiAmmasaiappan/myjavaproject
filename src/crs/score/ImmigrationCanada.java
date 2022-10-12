package crs.score;

import java.util.Scanner;

public class ImmigrationCanada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Education Level:");
//		Reads input from the user during runtime
		String education = sc.nextLine();
		System.out.println("Enter your Experience in years:");
		int experience = sc.nextInt();
		System.out.println("Enter your age in years:");
		int age = sc.nextInt();
		System.out.println("Enter your IELTS Score for Listening:");
		float ieltsListen = sc.nextFloat();
		System.out.println("Enter your IELTS Score for Speaking:");
		float ieltsSpeak = sc.nextFloat();
		System.out.println("Enter your IELTS Score for Reading:");
		float ieltsRead = sc.nextFloat();
		System.out.println("Enter your IELTS Score for Writing:");
		float ieltsWrite = sc.nextFloat();
		System.out.println("If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		String relative = sc.next();
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		String study = sc.next();
		System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		String studyNOC = sc.next();
		
//		Creating the Class instance
		CriteriaClass cc = new CriteriaClass();
//		Calling the method
		cc.criteriaMethodOne(education);
//		Returns value from the method
		int points = cc.criteriaMethodOne(education);
		cc.criteriaMethodTwo(experience);
		int yearsPoints = cc.criteriaMethodTwo(experience);
		cc.criteriaMethodThree(age);
		int agePoints = cc.criteriaMethodThree(age);
		cc.criteriaMethodFour(ieltsListen);
		int listenPoints = cc.criteriaMethodFour(ieltsListen);
		cc.criteriaMethodFive(ieltsSpeak);
		int speakPoints = cc.criteriaMethodFive(ieltsSpeak);
		cc.criteriaMethodSix(ieltsRead);
		int readPoints = cc.criteriaMethodSix(ieltsRead);
		cc.criteriaMethodSeven(ieltsWrite);
		int writePoints = cc.criteriaMethodSeven(ieltsWrite);
		cc.criteriaMethodEight(relative);
		int relativePoints = cc.criteriaMethodEight(relative);
		cc.criteriaMethodNine(study);
		int studyPoints = cc.criteriaMethodNine(study);
		cc.criteriaMethodTen(studyNOC);
		int studyNOCPoints = cc.criteriaMethodTen(studyNOC);
		int testScore = points + yearsPoints + agePoints + listenPoints + speakPoints + readPoints + writePoints
				+ relativePoints + studyPoints + studyNOCPoints;
		System.out.println(("Total points you have scored : " + testScore + " Points"));

		if (testScore >= 67) {
			System.out.println("Eligible to submit an Expression of Interest (EOI) to Immigration Canada.");
		} else {
			System.out.println("Not eligible.");
		}
		
	}
}
