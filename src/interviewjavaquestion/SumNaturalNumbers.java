/* Write a Program to Calculate the Sum of Natural Numbers*/
package interviewjavaquestion;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100, i = 1, sum = 0;  
		while(i <= num)  
		{
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of First 100 Natural Numbers is = " + sum); 
	}

}
