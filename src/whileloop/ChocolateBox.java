/*Write a program that will keep adding 5 chocolates to a box 
 * which already has 27 chocolates and add a mechanism that number of chocolates should never go above 63
 */
package whileloop;

public class ChocolateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfChocolate = 27;
		while (numberOfChocolate <= 63) {
			System.out.println("The number of chocolate inside the box - " + numberOfChocolate);
			numberOfChocolate += 5;
		}
		if (numberOfChocolate >= 62) {
			System.out.println("The chocolate box is full.");
		}
	}
}
