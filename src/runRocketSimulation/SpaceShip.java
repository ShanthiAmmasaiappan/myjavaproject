package runRocketSimulation;

import java.util.ArrayList;

public interface SpaceShip {

	public boolean launch();

	public boolean land();

	public boolean canCarry(Item item);

	public void carry(Item item);
	
	public ArrayList<Item> loadItems(ArrayList<Item> itemsToLoad);

}
