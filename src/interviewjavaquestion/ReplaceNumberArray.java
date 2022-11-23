/*  Write a program to replace the numbers in an array with alphabets.*/
package interviewjavaquestion;

import java.util.Scanner;

public class ReplaceNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] ary = String.valueOf(sc.next()).split("");

        StringBuilder answer = new StringBuilder();

        for (String n : ary) {
            int value = Integer.parseInt(n);
            if (value == 0) {
                answer.append("z");
            } else if (value % 2 == 0) {
                answer.append("q");
            } else {
                answer.append("p");
            }
        }

        System.out.print(answer.toString());
    }
}
		

