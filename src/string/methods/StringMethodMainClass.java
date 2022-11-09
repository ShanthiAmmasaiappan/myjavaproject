package string.methods;

public class StringMethodMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Shanthi";
		String lastName = "Ammasaiappan";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		System.out.println("Full name is "+firstName + " "+lastName.replaceAll("\\w","*"));
		
//		String updatedLastName = lastName.replaceAll("\\w","*");		
//		System.out.println(updatedLastName);
		System.out.println("Name is "+firstName);
		System.out.println("Length of my name is "+firstName.length());
		System.out.println("Name is "+firstName + " "+lastName.replace("Ammasaiappan", ""));
		System.out.println(fullName.substring(0, 7));
		
		System.out.println("replace 'h' by 'y' in first name - " +firstName.replace("h", "y"));
		
		
		System.out.println();
		
		String name = "Shanthi";
		
		
		
		

	}

}
