/*  Write a program to replace the numbers in an array with alphabets.*/
package interviewjavaquestion;

//import java.util.Scanner;

public class ReplaceNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//        String[] array = String.valueOf(sc.next()).split("");
//
//        StringBuilder answer = new StringBuilder();
//
//        for (String n : array) {
//            int value = Integer.parseInt(n);
//            if (value == 0) {
//                answer.append("z");
//            } else if (value % 2 == 0) {
//                answer.append("q");
//            } else {
//                answer.append("p");
//            }
//        }
//
//        System.out.print(answer.toString());
//    }
//}
		String[] array = {"10", "2", "98"};
		
		array[0] ="A";
		array[1]= "B";
		array[2]="c";
		for(int i=0; i<array.length;i++) {
		System.out.println(array[i]);
		}

		    
			
	}
}

