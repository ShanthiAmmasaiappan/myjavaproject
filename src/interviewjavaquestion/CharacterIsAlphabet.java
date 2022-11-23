/* Write a Program to Check Whether a Character is Alphabet or Not */
package interviewjavaquestion;

public class CharacterIsAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'b';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
    }

	}

}
