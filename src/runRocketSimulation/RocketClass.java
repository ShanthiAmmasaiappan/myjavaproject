package runRocketSimulation;

import java.util.ArrayList;

public class RocketClass implements SpaceShip {

	int cost;
	int currentWeight;
	int maxWeight;

	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
		return true;
	}

	@Override
	public boolean canCarry(Item item) {

		return (currentWeight + item.getWeightOfEquipment()) <= maxWeight;
	}

	@Override
	public void carry(Item item) {

		currentWeight += item.getWeightOfEquipment();
	}

	@Override
//	 Function to modify the arrayList
	public ArrayList<Item> loadItems(ArrayList<Item> itemsToLoad) {

		ArrayList<Item> itemsNotLoaded = new ArrayList<Item>();

		// Sequential Loading
//		for-each" loop, which is used exclusively to loop through elements in an array
//		for (type variableName : arrayName)
		for (Item curr_item : itemsToLoad) {
			if (canCarry(curr_item)) {
				carry(curr_item);
			} else {
				itemsNotLoaded.add(curr_item);
			}
		}

		return itemsNotLoaded;
	}

	public int getCost() {
		return cost;
	}

}