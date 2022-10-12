package crs.score;

public class CriteriaClass {
	int points;
	int yearsPoints;
	int agePoints;
	int listenPoints;
	int speakPoints;
	int readPoints;
	int writePoints;
	int relativePoints;
	int studyPoints;
	int studyNOCPoints;

	int criteriaMethodOne(String education) {

		if (education.equals("PhD")) {
			points = 25;
		}
		if (education.equals("Masters")) {
			points = 23;
		}
		if (education.equals("University degrees")) {
			points = 22;
		}
		if (education.equals("degrees/diplomas")) {
			points = 21;
		}
		return points;
	}

	int criteriaMethodTwo(int experience) {

		if (experience == 4 || experience == 5) {
			yearsPoints = 13;
		} else if (experience >= 6) {
			yearsPoints = 15;
		}
		return yearsPoints;
	}

	int criteriaMethodThree(int age) {

		if (age < 18) {
			agePoints = 00;
		} else if (age <= 35) {
			agePoints = 12;
		} else if (age == 36) {
			agePoints = 11;
		} else if (age == 37) {
			agePoints = 10;
		} else if (age == 38) {
			agePoints = 9;
		} else if (age == 39) {
			agePoints = 8;
		} else if (age == 40) {
			agePoints = 7;
		} else if (age == 41) {
			agePoints = 6;
		} else if (age == 42) {
			agePoints = 5;
		} else if (age == 43) {
			agePoints = 4;
		} else if (age == 44) {
			agePoints = 3;
		} else if (age == 45) {
			agePoints = 2;
		} else if (age == 46) {
			agePoints = 1;
		} else if (age >= 47) {
			agePoints = 00;
		}
		return agePoints;
	}

	int criteriaMethodFour(float ieltsListening) {

		if (ieltsListening >= 8) {
			listenPoints = 6;
		} else if (ieltsListening == 7.5) {
			listenPoints = 5;
		}
		return listenPoints;
	}

	int criteriaMethodFive(float ieltsSpeaking) {

		if (ieltsSpeaking >= 7) {
			speakPoints = 6;
		} else if (ieltsSpeaking == 6.5) {
			speakPoints = 5;
		}
		return speakPoints;
	}

	int criteriaMethodSix(float ieltsReading) {

		if (ieltsReading >= 7) {
			readPoints = 6;
		} else if (ieltsReading == 6.5) {
			readPoints = 5;
		}
		return readPoints;
	}

	int criteriaMethodSeven(float ieltsWriting) {

		if (ieltsWriting >= 7) {
			writePoints = 6;
		} else if (ieltsWriting == 6.5) {
			writePoints = 5;
		}
		return writePoints;
	}

	int criteriaMethodEight(String relative) {
		if (relative.equalsIgnoreCase("Y")) {
			relativePoints = 5;
		} else if (relative.equalsIgnoreCase("N")) {
			relativePoints = 0;
		}
		return relativePoints;
	}

	int criteriaMethodNine(String study) {
		if (study.equalsIgnoreCase("Y")) {
			studyPoints = 5;
		} else if (study.equalsIgnoreCase("N")) {
			studyPoints = 0;
		}
		return studyPoints;
	}

	int criteriaMethodTen(String studyNOC) {
		if (studyNOC.equalsIgnoreCase("Y")) {
			studyNOCPoints = 10;
		} else if (studyNOC.equalsIgnoreCase("N")) {
			studyNOCPoints = 0;
		}
		return studyNOCPoints;
	}

}
