package runRocketSimulation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.youtube.com/watch?v=0l4Ha_FTMzU
public class SimulationClass {

//	Initializing the array list, to store the items
	Item item = null;

	public ArrayList<Item> procureItems() throws IOException {

		ArrayList<Item> itemList = new ArrayList<Item>();

		//// Read the file from the path specified
		File file = new File("C:\\Users\\ShanthiAmmasaiappan\\Desktop\\Shanthi\\phase-1.txt");
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
		 * for (int i = 0; i < itemList.size(); i++) {
		 *  item = itemList.get(i);
		 * System.out.println(item.getNameOfEquipment());
		 * System.out.println(item.getWeightOfEquipment()); }
		 */

		return itemList;

	}

// pass arraylist object as function argument
	public ArrayList<RocketClass> loadItemsInR1Rockets(ArrayList<Item> itemList) {

		ArrayList<RocketClass> r1Rockets = new ArrayList<RocketClass>();

		boolean itemsLeftToLoad = true;

		while (itemsLeftToLoad) {

			R1Class r1Rocket = new R1Class();
			itemList = r1Rocket.loadItems(itemList);
			r1Rockets.add(r1Rocket);

			if (itemList.size() <= 0) {
				itemsLeftToLoad = false;
			}

		}
		System.out.println("Number of R1 rockets: " + r1Rockets.size());
		return r1Rockets;

	}

	public ArrayList<RocketClass> loadItemsInR2Rocket(ArrayList<Item> itemList) {

		ArrayList<RocketClass> r2Rockets = new ArrayList<>();

		boolean itemsLeftToLoad = true;

		while (itemsLeftToLoad) {

			R2Class r2Rocket = new R2Class();
			itemList = r2Rocket.loadItems(itemList);
			r2Rockets.add(r2Rocket);

			if (itemList.size() <= 0) {
				itemsLeftToLoad = false;
			}
		}

		System.out.println("Number of R2 rockets: " + r2Rockets.size());

		return r2Rockets;

	}

	public int runSimulation(ArrayList<RocketClass> rockets) {

		int totalCost = 0;

		for (RocketClass currentRocket : rockets) {
			totalCost += currentRocket.getCost();

			while (!currentRocket.launch() || !currentRocket.land()) {
				totalCost += currentRocket.getCost();
			}
		}
		return totalCost;
	}
}
