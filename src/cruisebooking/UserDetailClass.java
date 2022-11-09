package cruisebooking;

import java.util.Scanner;

public class UserDetailClass {

	private String emailId;
	private String passWord;
	private String fullName;
	private String phoNumber;
	String username;
	String password;
	int noMatch = 0;
	int count = 3;
	int numberOfAttempt = 0;

	 UserDetailClass(String emailId, String pasword, String fulname, String phoneNumber) {

		this.emailId = emailId;
		this.passWord = pasword;
		this.fullName = fulname;
		this.phoNumber = phoneNumber;
	}

	
	
	 Scanner sc = new Scanner(System.in);

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	 boolean validateEmailId(String emailId) {
		boolean isEmailValid;
		do {
			System.out.println("Enter your email address:");
			emailId = sc.nextLine();

			if (emailId.matches("^[a-zA-Z0-9_.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,3}$")) {

				isEmailValid = true;
			} else {
				System.out.println("Please enter an valid email with '@' and'.'");
				isEmailValid = false;
			}
		} while (!emailId.matches("^[a-zA-Z0-9_.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,3}$"));
		return isEmailValid;
	}

	public void setPassWord(String password) {
		this.passWord = password;
	}

	 boolean validatePassword(String password) {
		boolean isPasswordValid;
		do {
			System.out.println("Enter the password that you want to use.");
			password = sc.nextLine();

			if (passWord
					.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "((?=\\S+$).{8,20})$")) {
				isPasswordValid = true;
			} else {
				System.out.println("Doesnot contain the matches (a-z),(A-Z),(0-9) and 1 special character");
				isPasswordValid = false;

			}
		} while (!passWord.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])((?=\\S+$).{8,20})$"));
		return isPasswordValid;
	}

	public void setFullname(String fulName) {
		this.fullName = fulName;
	}

	 boolean validateFullName(String fulname) {
		boolean isFullNameValid;
		do {
			System.out.println("Enter your Full Name.");
			fulname = sc.nextLine();

			if (fullName.matches("^((?=.*[a-z])(?=.*[A-Z]).{8,20})$")) {
				isFullNameValid = true;
			} else {
				System.out.println("Doesnot contain the matches (a-z),(A-Z) and character between 8 - 20.");
				isFullNameValid = false;

			}
		} while (!fullName.matches("^((?=.*[a-z])(?=.*[A-Z]).{8,20})$"));
		return isFullNameValid;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoNumber = phoneNumber;
	}

	 boolean validatePhoneNumber(String phoneNumber) {
		boolean isPhoneNumberValid;
		do {
			System.out.println("Enter your phone number.");
			phoneNumber = sc.nextLine();

			if (phoNumber.matches("^(\\+\\d{1,3}[- ]?)?\\d{10}$")) {
				isPhoneNumberValid = true;
			} else {
				System.out.println("Doesnot contain the matches of length 10.");
				isPhoneNumberValid = false;

			}
		} while (!phoNumber.matches("^(\\+\\d{1,3}[- ]?)?\\d{10}$"));
		return isPhoneNumberValid;

	}

	 void updateLoginDetails() {
		do {
			System.out.println("Please enter the Username/email:");
			username = sc.nextLine();
			System.out.println("Enter the password .");
			password = sc.nextLine();

				if ((this.emailId.equalsIgnoreCase(username) || this.fullName.equals(username))
						&& this.passWord.equals(password)) {
					System.out.println("Login is successful.\n");

				} else {
					count--;
					System.out.println("Username and Password doesnot match.");
//					break;
				}


			if (count < 1) {
				System.out.println("Verify your login details.");
				System.exit(0);
			}
		} while (!(this.emailId.equalsIgnoreCase(username) || this.fullName.equals(username)
				&& this.passWord.equals(password)));
		System.out.println("Press 'Y' to continue");
		String enter = sc.nextLine();
		if (enter.equalsIgnoreCase("Y")) {
			
		} else {
			System.exit(0);
		}

	}

	 void validatePassword(String existingPassword, String newPassword) {

		do {
			System.out.println("Enter your existing password ");
			existingPassword = sc.next();
			System.out.println("Enter your new password");
			newPassword = sc.next();
			numberOfAttempt++;
			if (existingPassword.equals(newPassword)) {
				System.out.println("Entered password already exist.Please try again");
			} else if (!newPassword
					.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "((?=\\S+$).{8,20})$")) {
				System.out.println("Doesnot contain the matches (a-z),(A-Z),(0-9) and 1 special character");
			} else if (this.passWord.equals(existingPassword)) {
				this.passWord = newPassword;
				System.out.println("Your password has been changed!");
				noMatch = 0;
				break;
			} else {
				noMatch = 1;
				System.out.println("Password doesnot match.Please try again");
			}

			if (noMatch == 1) {

			}
		} while (numberOfAttempt < 3);
		System.out.println("Thank you for using the service!");
		System.exit(0);

	}

	 void validatePhoneNumber(String existingPhoneNumber, String newPhoneNumber) {
		do {
			System.out.println("Enter your existing phonenumber ");
			existingPhoneNumber = sc.next();
			System.out.println("Enter your new phonenumber");
			newPhoneNumber = sc.next();
			numberOfAttempt++;
			if (existingPhoneNumber.equals(newPhoneNumber)) {
				System.out.println("Entered phonenumber already exist.Please try again.");
			} else if (!newPhoneNumber.matches("^(\\+\\d{1,3}[- ]?)?\\d{10}$")) {
				System.out.println("Doesnot contain the matches of length 10. Please try again.");
			} else if (this.phoNumber.equals(existingPhoneNumber)) {
				this.phoNumber = newPhoneNumber;
				System.out.println("Your phonenumber has been changed!");
				noMatch = 0;
				break;
			} else {
				noMatch = 1;
				System.out.println("Phonenumber doesnot match.Please try again");
			}

			if (noMatch == 1) {

			}
		} while (numberOfAttempt < 3);
		System.out.println("Thank you for using the service!");
		System.exit(0);

	}

	 void validateEmail(String existingEmail, String newEmail) {
		do {
			System.out.println("Enter your existing email ");
			existingEmail = sc.next();
			System.out.println("Enter your new email");
			newEmail = sc.next();
			numberOfAttempt++;
			if (existingEmail.equals(newEmail)) {
				System.out.println("Entered Email already exist.Please try again");
			} else if (!newEmail.matches("^[a-zA-Z0-9_.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,3}$")) {
				System.out.println("Please enter an valid email with '@' and'.'. Please try again");
			}

			else if (this.emailId.equals(existingEmail)) {
				this.emailId = newEmail;
				System.out.println("Your email has been changed!");
				noMatch = 0;
				break;

			} else {
				noMatch = 1;
				System.out.println("Email doesnot match.Please try again");
			}

			if ((noMatch == 1)) {

			}
		} while (numberOfAttempt < 3);
		System.out.println("Thank you for using the service!");
		System.exit(0);

	}

	

}
