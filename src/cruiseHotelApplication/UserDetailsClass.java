package cruiseHotelApplication;

import java.util.Scanner;

public class UserDetailsClass {
	private String emailID, passWord, fullName, phoNumber;	
	int noMatch = 0;
	int count = 3;
	int numberOfAttempt = 0;

	protected UserDetailsClass() {
		this.emailID = "abcd1@email.com";
		this.passWord = "123XYZ@abc";
		this.fullName = "John Doe";
		this.phoNumber = "4561237890";
	}

	Scanner sc = new Scanner(System.in);

	protected void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	protected void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	protected void setFullName(String fullName) {
		this.fullName = fullName;
	}

	protected void setPhoNumber(String phoNumber) {
		this.phoNumber = phoNumber;
	}

	private void validateEmailId() {
		System.out.println("Enter your email address:");
		String emailId = sc.nextLine();
		while (!emailId.matches("^[a-zA-Z0-9_.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,3}$")) {
			System.out.println("Please enter an valid email with '@' and'.'");
			emailId = sc.nextLine();
		}
	}

	private void validatePassword() {

		System.out.println("Enter the password that you want to use.");
		String password = sc.nextLine();
		while (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])((?=\\S+$).{8,20})$")) {
			System.out.println(
					"A password should contain the matches (a-z),(A-Z),(0-9) and 1 special character. Please try again");
			password = sc.nextLine();
		}

	}

	private void validateFullName() {

		System.out.println("Enter your Full Name.");
		String fulName = sc.nextLine();
		while (!fulName.matches("^((?=.*[a-z])(?=.*[A-Z]).{8,20})$")) {
			System.out.println("A name should be of 8 -20 characters. Please try again");
			fulName = sc.nextLine();
		}
	}

	private void validatePhoneNumber() {	
		System.out.println("Enter your phone number.");
		String phoneNumber = sc.nextLine();
		while (!phoneNumber.matches("^(\\+\\d{1,3}[- ]?)?\\d{10}$")) {
			System.out.println("A phone number should be of 10 digits. Please try again");
			phoneNumber = sc.nextLine();
		}
	}

	public void userRegisterationvalidation() {
		validateEmailId();
		validatePassword();
		validateFullName();
		validatePhoneNumber();
	}

	protected void updateLoginDetails() {
		String username;
		String password;
		do {
			System.out.println("Please enter the Username/email:");
			username = sc.nextLine();
			System.out.println("Enter the password .");
			password = sc.nextLine();
			if ((emailID.equalsIgnoreCase(username) || fullName.equals(username)) && passWord.equals(password)) {
				System.out.println("Login is successful.\n");
			} else {
				count--;
				System.out.println("Username and Password doesnot match.");
			}
			if (count < 1) {
				System.out.println("Verify your login details.");
				System.exit(0);
			}
		} while (!(emailID.equalsIgnoreCase(username) || fullName.equals(username)) && passWord.equals(password));
		System.out.println("Press 'Y' to continue");
		String enter = sc.nextLine();
		if (enter.equalsIgnoreCase("Y")) {
		} else {
			System.exit(0);
		}
	}

	protected void validatePassword(String existingPassword, String newPassword) {

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
			} else if (passWord.equals(existingPassword)) {
				passWord = newPassword;
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

	protected void validatePhoneNumber(String existingPhoneNumber, String newPhoneNumber) {
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
			} else if (phoNumber.equals(existingPhoneNumber)) {
				phoNumber = newPhoneNumber;
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

	protected void validateEmail(String existingEmail, String newEmail) {
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
			} else if (emailID.equals(existingEmail)) {
				emailID = newEmail;
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
