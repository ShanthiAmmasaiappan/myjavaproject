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

	public UserDetailClass(String emailId, String pasword, String fulname, String phoneNumber) {

		this.emailId = emailId;
		this.passWord = pasword;
		this.fullName = fulname;
		this.phoNumber = phoneNumber;
	}

	Scanner sc = new Scanner(System.in);

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setPassWord(String password) {
		this.passWord = password;
	}

	public void setFullname(String fulName) {
		this.fullName = fulName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoNumber = phoneNumber;
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

			}

			if (count < 1) {
				System.out.println("Verify your login details.");
				System.exit(0);
			}
		} while (!this.emailId.equalsIgnoreCase(username) && !this.passWord.equals(password));
		System.out.println("Press 'Y' to continue");
		String enter = sc.nextLine();
		if (enter.equalsIgnoreCase("Y")) {
		} else {
			System.exit(0);
		}
	}

	public void setPassword(String existingPassword, String newPassword) {
		do {
			System.out.println("Enter your existing password ");
			existingPassword = sc.next();
			System.out.println("Enter your new password");
			newPassword = sc.next();
			if(existingPassword.equals(newPassword)) {				
				numberOfAttempt++;
				System.out.println("Entered password already exist");
			}
			else if (this.passWord.equals(existingPassword)) {
				this.passWord = newPassword;
				System.out.println("Your password has been changed!");
				noMatch = 0;
				break;
			} else {
				noMatch = 1;
			}

			if (noMatch == 1) {
				numberOfAttempt++;
				System.out.println("Password doesnot match.");
			}
		} while (numberOfAttempt < 3);
		System.out.println("Thank you for using the service!");
		System.exit(0);

	}

	public void setPhoneNumber(String existingPhoneNumber, String newPhoneNumber) {
		do {
			System.out.println("Enter your existing phonenumber ");
			existingPhoneNumber = sc.next();
			System.out.println("Enter your new phonenumber");
			newPhoneNumber = sc.next();
			if(existingPhoneNumber.equals(newPhoneNumber)) {				
				numberOfAttempt++;
				System.out.println("Entered phonenumber already exist");
			}
			else if (this.phoNumber.equals(existingPhoneNumber)) {
				this.phoNumber = newPhoneNumber;
				System.out.println("Your phonenumber has been changed!");
				noMatch = 0;
				break;
			} else {
				noMatch = 1;
			}

			if (noMatch == 1) {
				numberOfAttempt++;
				System.out.println("Phonenumber doesnot match.");
			}
		} while (numberOfAttempt < 3);
		System.out.println("Thank you for using the service!");
		System.exit(0);

	}

	public void setEmail(String existingEmail, String newEmail) {
		do {
			System.out.println("Enter your existing email ");
			existingEmail = sc.next();
			System.out.println("Enter your new email");
			newEmail = sc.next();
			if(existingEmail.equals(newEmail)) {				
				numberOfAttempt++;
				System.out.println("Entered Email already exist.");
			}
			
			else if (this.emailId.equals(existingEmail)) {
				this.emailId = newEmail;				
				System.out.println("Your email has been changed!");
				noMatch = 0;
				break;

			} else {
				noMatch = 1;
			}

			if ((noMatch == 1)) {
				numberOfAttempt++;
				System.out.println("Email doesnot match.");

			}
		} while (numberOfAttempt < 3);
		System.out.println("Thank you for using the service!");
		System.exit(0);

	}

}
