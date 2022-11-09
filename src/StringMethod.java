
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shanthi Ammasaiappan";

		char[] nameToCharArray = name.toCharArray();
		int counter = 0;
		for (int i = 0; i < nameToCharArray.length; i++) {
			System.out.println(nameToCharArray[i]);
			if (nameToCharArray[i] == 'A' || nameToCharArray[i] == 'a') {
				counter++;
			}

		}

		System.out.println("Occurances of A in the name is " + counter);

	}

}

//if(readTextFile !=null) {
//	sc.nextLine();
//System.out.println(readTextFile);
//}
