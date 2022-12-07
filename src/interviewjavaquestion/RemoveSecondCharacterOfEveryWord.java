/*  write a program to remove second letter of every word in a sentence*/
package interviewjavaquestion;

public class RemoveSecondCharacterOfEveryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = " My java class is hard";
		String[] array = sentence.split(" ");
		
		for(int i=0; i<array.length; i++) {
			char[] charArray = array[i].toCharArray();
			char[] newString = new char[charArray.length];
			for(int j=0,k=0; j<charArray.length;j++) {
				if(j == 1) {
					continue;
				}else {
					newString[k] = charArray[j];
				}
				++k;
				}
				String string = String.valueOf(newString);
				System.out.println(string);
			}
		}

	}


