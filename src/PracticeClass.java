import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PracticeClass {

	public static void main(String[] args) {
/*      Remove the last character
		String str = "Remove Last CharacterY";
		String result = "";
		result = str.substring(0, str.length() - 1);
		System.out.println("After removing s1==" + result + "==");
		*/
		/* to find minimun in the arraylist
		List<Integer> arrayList = new ArrayList<>();		
		arrayList.add(93);
		arrayList.add(35);
		arrayList.add(65);
		arrayList.add(13);
		arrayList.add(45);
		int min =Collections.min(arrayList);
		System.out.println(min);
		*/
		/*Write a java program to generate random email address */
		
//		String signsSet = "abcdefghijklmnoprqstuvwxyz";
//        char[] chars = signsSet.toCharArray();
//        String randString = "";
//        Random rand = new Random();
//        int length = rand.nextInt((5 - 3) + 1) +3;       
//        while (length > 0) {
//            randString += chars[rand.nextInt(chars.length)];
//            length--;        
//        }        
//        String str3 = "gmail";
//        System.out.println(String.format("%s@%s.com", randString, str3));    
        Random rand = new Random();
        int length = rand.nextInt(1000); 
        
        System.out.println(length + "gmail.com");
		
	}
}
	
