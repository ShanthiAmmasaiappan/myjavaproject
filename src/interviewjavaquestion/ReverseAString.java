/*Write a program to reverse a String with for loop. */
package interviewjavaquestion;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Selenium";
        
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+(s.charAt(i));
        }
        System.out.println(reverse);
	}

}
