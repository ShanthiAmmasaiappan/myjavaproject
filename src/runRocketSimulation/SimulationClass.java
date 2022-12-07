package runRocketSimulation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.youtube.com/watch?v=0l4Ha_FTMzU
public class SimulationClass {

	// Initializing the array list, to store the items
	Item item = null;
	private ArrayList<Item> itemList;

	protected ArrayList<Item> procureItems() throws IOException {

		itemList = new ArrayList<Item>();
		// Read the file from the path specified
		File file = new File("C:\\Users\\16475\\Desktop\\Shanthi\\phase-1.txt");
		Scanner readFile = new Scanner(file);

		StringTokenizer token = null;

		while (readFile.hasNextLine()) {
			String current_line = readFile.nextLine();
			if (current_line != "") {
				token = new StringTokenizer(current_line, "=");
				item = new Item();
				item.setNameOfEquipment(token.nextToken());
				item.setWeightOfEquipment(Integer.parseInt(token.nextToken()));
				itemList.add(item);
			}
		}
		/*
		 * for (int i = 0; i < itemList.size(); i++) { item = itemList.get(i);
		 * System.out.println(item.getNameOfEquipment());
		 * System.out.println(item.getWeightOfEquipment()); }
		 */
		return itemList;
	}

	// pass arraylist object as method argument
	protected ArrayList<RocketClass> loadItemsInR1Rockets(ArrayList<Item> itemList) {

		ArrayList<RocketClass> r1Rockets = new ArrayList<RocketClass>();

		boolean itemsLeftToLoad = true;

		while (itemsLeftToLoad) {

			R1Class r1 = new R1Class();
			// overwrite itemList with the remainig items(itemsNotLoaded)
			itemList = r1.loadItems(itemList);
			r1Rockets.add(r1);

			if (itemList.size() <= 0) {
				itemsLeftToLoad = false;
			}
		}
		System.out.println("Number of R1 rockets: " + r1Rockets.size()+"\n");
		/*int rocketIndex = 1;
		for (RocketClass current_rocket : r1Rockets) {
			System.out.println("weight of " + rocketIndex + " rocket in R1 - " + current_rocket.getCurrentWeight());
			rocketIndex++;
		}*/
		return r1Rockets;
	}

	protected ArrayList<RocketClass> loadItemsInR2Rocket(ArrayList<Item> itemList) {

		ArrayList<RocketClass> r2Rockets = new ArrayList<>();

		boolean itemsLeftToLoad = true;

		while (itemsLeftToLoad) {

			R2Class r2 = new R2Class();
			itemList = r2.loadItems(itemList);
			r2Rockets.add(r2);

			if (itemList.size() <= 0) {
				itemsLeftToLoad = false;
			}
		}
		System.out.println("Number of R2 rockets: " + r2Rockets.size()+"\n");

		/*int rocketIndex = 1;
		for (RocketClass current_rocket : r2Rockets) {
			System.out.println("Weight of " + rocketIndex + " rocket in R2 - " + current_rocket.getCurrentWeight());
			rocketIndex++;
		}*/
		return r2Rockets;
	}

	protected double runSimulation(ArrayList<RocketClass> rockets) {

		double totalCost = 0;

		for (RocketClass currentRocket : rockets) {
			totalCost += currentRocket.getCost();

			while (!currentRocket.launch() || !currentRocket.land()) {
				totalCost += currentRocket.getCost();
			}
		}
		return totalCost;
	}

}
