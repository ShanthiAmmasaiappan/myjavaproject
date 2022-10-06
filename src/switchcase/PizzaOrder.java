package switchcase;

public class PizzaOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallCheesePizza = 15;
		int mediumCheesePizza = 20;
		int largeCheesePizza = 25;
		int pepperoniSmallPizza = 2;
		int pepperoniMediumPizza, pepperoniLargePizza ;
		pepperoniMediumPizza = pepperoniLargePizza = 15;
		int extraCheese = 1;
		int finalAmount;
		
		String pizzaType = "mediumPepperoni and cheese";
		switch(pizzaType) {
		case "smallpizza":
			finalAmount = smallCheesePizza ;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "smallpepperoni":
			finalAmount = smallCheesePizza + pepperoniSmallPizza ;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "smallPepperoni and cheese":
			finalAmount = smallCheesePizza + extraCheese;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "smallextracheese":
			finalAmount = smallCheesePizza + pepperoniSmallPizza + extraCheese;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "mediumpizza":
			finalAmount = mediumCheesePizza;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "mediumpepperoni":
			finalAmount = mediumCheesePizza + pepperoniMediumPizza;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "mediumPepperoni and cheese":
			finalAmount = mediumCheesePizza + pepperoniMediumPizza + extraCheese;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "mediumextracheese":
			finalAmount = mediumCheesePizza + extraCheese;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "largepizza":
			finalAmount = largeCheesePizza ;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "largepepperoni":
			finalAmount = largeCheesePizza+pepperoniLargePizza;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "largePepperoni and cheese":
			finalAmount = largeCheesePizza + pepperoniLargePizza + extraCheese;
			System.out.println("The final bill = $" +finalAmount);
			break;
		case "largeextracheese":
			finalAmount = largeCheesePizza + extraCheese;
			System.out.println("The final bill = $" +finalAmount);
			break;
			
			default:
				System.out.println("Order is not placed");
		}
	}
}
		
