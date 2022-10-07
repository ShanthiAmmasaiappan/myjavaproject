/* Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: 
Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: 
Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
Extra cheese for any size pizza: + $1
*/
package ifelse;

public class PizzaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean pepperoniToppings = !false;
		boolean extraCheese = !false;
		int finalBill = 0;
		int flag = 1;

		String pizzaSize = "small";

		// CHOOSING SIZE
		if (pizzaSize.equals("small")) {
			finalBill = finalBill + 15;
		} else if (pizzaSize.equals("medium")) {
			finalBill = finalBill + 20;
		} else if (pizzaSize.equals("large")) {
			finalBill = finalBill + 25;
		} else {
			// ORDER NOT PLACED
			flag = 0;
		}

		// CHOOSE TOPPINGS
		if (pepperoniToppings && (flag == 1)) {
			if (pizzaSize.equals("small")) {
				finalBill = finalBill + 2;
			}
			if (pizzaSize.equals("medium") || pizzaSize.equals("large")) {
				finalBill = finalBill + 3;
			}
		}

		// EXTRA CHEESE
		if (extraCheese && (flag == 1)) {
			finalBill = finalBill + 1;
		}

		if (flag == 0) {
			System.out.println(("The order is not placed."));
		} else {
			System.out.println("The bill = $" + finalBill);
		}

	}

}
