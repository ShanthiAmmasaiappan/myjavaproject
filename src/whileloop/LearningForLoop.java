package whileloop;

public class LearningForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// for loop
				int actualPIN = 1234;
				int enteredPIN = 1234;
				for (int counter = 1; counter <= 3; counter++) {
					System.out.println("PIN entered " + counter + " times");
					if (actualPIN == enteredPIN) {
						System.out.println("PIN Entered is correct");
						break;
					} else {
						System.out.println("PIN is incorrect");

					}

				}

//				if you have reached your capacity break out of the loop and come out

			}

		

	}

