package ifelse;

public class PizzaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean pepperoniToppings = true;
		boolean extraCheese = !true;
		int finalBill = 0;
		int flag = 0;

		String pizzaSize = "small";
		if (pizzaSize.equals("small")) {
			finalBill = finalBill + 15;

		} else if (pizzaSize.equals("medium")) {
			finalBill = finalBill + 20;

		} else if (pizzaSize.equals("large")) {
			finalBill = finalBill + 25;

		} else {
			flag = 1;
		}
		if (pepperoniToppings) {
			if (pizzaSize.equals("small")) {
				finalBill = finalBill + 2;

			} else if (pizzaSize.equals("medium") || pizzaSize.equals("large")) {
				finalBill = finalBill + 3;

			} else {
				flag = 1;
			}
			if (extraCheese) {
				if (pizzaSize.equals("small") || pizzaSize.equals("medium") || pizzaSize.equals("large")) {
					finalBill = finalBill + 1;

				}
			} else {
				flag = 1;
			}

			if (flag == 0) {
				System.out.println(("The order is not placed."));
			} else {
				System.out.println("The bill = $" + finalBill);
			}

		}

	}

}
