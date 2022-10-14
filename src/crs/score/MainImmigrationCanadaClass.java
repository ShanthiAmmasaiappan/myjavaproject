package crs.score;

import java.util.Scanner;

public class MainImmigrationCanadaClass {

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
		String work = sc.next();

//		Creating the Class instance
		CriteriaClass cc = new CriteriaClass();
//		Calling the method
		cc.educationCriteria(education);
//		Returns value from the method
		int educationPoints = cc.educationCriteria(education);
		cc.experienceCriteria(experience);
		int experiencePoints = cc.experienceCriteria(experience);
		cc.ageCriteria(age);
		int agePoints = cc.ageCriteria(age);
		cc.listeningModule(ieltsListen);
		int listenPoints = cc.listeningModule(ieltsListen);
		cc.speakingModule(ieltsSpeak);
		int speakPoints = cc.speakingModule(ieltsSpeak);
		cc.readingModule(ieltsRead);
		int readPoints = cc.readingModule(ieltsRead);
		cc.writingModule(ieltsWrite);
		int writePoints = cc.writingModule(ieltsWrite);
		cc.relativesCriteria(relative);
		int relativePoints = cc.relativesCriteria(relative);
		cc.studyCriteria(study);
		int studyPoints = cc.studyCriteria(study);
		cc.workCriteria(work);
		int workPoints = cc.workCriteria(work);

		int testScore = educationPoints + experiencePoints + agePoints + listenPoints + speakPoints + readPoints
				+ writePoints + relativePoints + studyPoints + workPoints;
		System.out.println(("Total points you have scored : " + testScore + " Points"));

		if (testScore >= 67) {
			System.out.println("Eligible to submit an Expression of Interest (EOI) to Immigration Canada.");
		} else {
			System.out.println("Not eligible.");
		}

	}
}
