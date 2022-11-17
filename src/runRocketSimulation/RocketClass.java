package runRocketSimulation;

import java.util.ArrayList;

public class RocketClass implements SpaceShip {

	protected double cost;
	protected int currentWeight;
	protected int maxWeight;

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
	// method to load items in a rocket and return the remaining items
	public ArrayList<Item> loadItems(ArrayList<Item> itemsToLoad) {

		ArrayList<Item> itemsNotLoaded = new ArrayList<Item>();

		// Sequential Loading

		for (Item curr_item : itemsToLoad) {
			if (canCarry(curr_item)) {
				carry(curr_item);
			} else {
				itemsNotLoaded.add(curr_item);
			}
		}

		return itemsNotLoaded;
	}

	public double getCost() {
		return cost;
	}

	public int getCurrentWeight() {
		return currentWeight;
	}

}