package crs.score;

public class CriteriaClass {
	int educationPoints=0;
	int experiencePoints;
	int agePoints;
	int listenPoints;
	int speakPoints;
	int readPoints;
	int writePoints;
	int relativePoints;
	int studyPoints;
	int workPoints;

	int educationCriteria(String education) {

		if (education.equalsIgnoreCase("PhD")) {
			educationPoints = 25;
		} else if (education.equalsIgnoreCase("Masters")) {
			educationPoints = 23;
		} else if (education.equalsIgnoreCase("University degrees")) {
			educationPoints = 22;
		} else if (education.equalsIgnoreCase("degrees/diplomas")) {
			educationPoints = 21;
		}
		return educationPoints;
	}

	int experienceCriteria(int experience) {

		if (experience == 4 || experience == 5) {
			experiencePoints = 13;
		} else if (experience >= 6) {
			experiencePoints = 15;
		}
		return experiencePoints;
	}

	int ageCriteria(int age) {

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

	int listeningModule(float ieltsListening) {

		if (ieltsListening >= 8) {
			listenPoints = 6;
		} else if (ieltsListening == 7.5) {
			listenPoints = 5;
		}
		return listenPoints;
	}

	int speakingModule(float ieltsSpeaking) {

		if (ieltsSpeaking >= 7) {
			speakPoints = 6;
		} else if (ieltsSpeaking == 6.5) {
			speakPoints = 5;
		}
		return speakPoints;
	}

	int readingModule(float ieltsReading) {

		if (ieltsReading >= 7) {
			readPoints = 6;
		} else if (ieltsReading == 6.5) {
			readPoints = 5;
		}
		return readPoints;
	}

	int writingModule(float ieltsWriting) {

		if (ieltsWriting >= 7) {
			writePoints = 6;
		} else if (ieltsWriting == 6.5) {
			writePoints = 5;
		}
		return writePoints;
	}

	int relativesCriteria(String relative) {
		if (relative.equalsIgnoreCase("Y")) {
			relativePoints = 5;
		} else if (relative.equalsIgnoreCase("N")) {
			relativePoints = 0;
		}
		return relativePoints;
	}

	int studyCriteria(String study) {
		if (study.equalsIgnoreCase("Y")) {
			studyPoints = 5;
		} else if (study.equalsIgnoreCase("N")) {
			studyPoints = 0;
		}
		return studyPoints;
	}

	int workCriteria(String work) {
		if (work.equalsIgnoreCase("Y")) {
			workPoints = 10;
		} else if (work.equalsIgnoreCase("N")) {
			workPoints = 0;
		}
		return workPoints;
	}

}
