/* Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: 
Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: 
Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
Extra cheese for any size pizza: + $1
*/

package switchcase;

public class PizzaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallPizza = 15;
		int mediumPizza = 20;
		int largePizza = 25;
		boolean pepperoniSmall = false;
		boolean pepperoniMedium = false;
		boolean pepperoniLarge = false;
		boolean extraCheese = false;
		int finalAmount;

		String pizzaType = "small";
		switch (pizzaType) {
		case "small":
			finalAmount = smallPizza;
			if (pepperoniSmall) {
				finalAmount = finalAmount + 2;
			}
			if (extraCheese) {
				finalAmount = finalAmount + 1;
			}
			System.out.println("The final bill = $" + finalAmount);
			break;
		case "medium":
			finalAmount = mediumPizza;
			if (pepperoniMedium) {
				finalAmount = finalAmount + 3;
			}
			if (extraCheese) {
				finalAmount = finalAmount + 1;
			}
			System.out.println("The final bill = $" + finalAmount);
			break;
		case "large":
			finalAmount = largePizza;
			if (pepperoniLarge) {
				finalAmount = finalAmount + 3;
			}
			if (extraCheese) {
				finalAmount = finalAmount + 1;
			}
			System.out.println("The final bill = $" + finalAmount);
			break;
		default:
			System.out.println("Order is not placed");
		}
	}
}
