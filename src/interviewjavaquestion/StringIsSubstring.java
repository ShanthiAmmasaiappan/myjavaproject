/* Write a program to find if a string is a substring of another String.*/
package interviewjavaquestion;

public class StringIsSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt = "This is Programiz";
		String str1 = "Programiz";
		String str2 = "Programming";

		boolean result = txt.contains(str1);
		System.out.println(result);
//		if (result) {
//			System.out.println(str1 + " is present in the string.");
//		} else {
//			System.out.println(str1 + " is not present in the string.");
//		}
//
//		result = txt.contains(str2);
//		if (result) {
//			System.out.println(str2 + " is present in the string.");
//		} else {
//			System.out.println(str2 + " is not present in the string.");
//		}

	}

}
