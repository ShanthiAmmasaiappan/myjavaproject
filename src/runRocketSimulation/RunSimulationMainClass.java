package runRocketSimulation;

import java.io.IOException;
import java.util.ArrayList;

public class RunSimulationMainClass {

	public static void main(String[] args) throws IOException {

		SimulationClass simulation = new SimulationClass();
		ArrayList<Item> itemList = simulation.procureItems();

		ArrayList<RocketClass> r1Rockets = simulation.loadItemsInR1Rockets(itemList);
		double r1Cost = simulation.runSimulation(r1Rockets);		
		System.out.println("Total cost for R1 fleet :  $" + String.format("%,.2f", r1Cost)+"\n");

		ArrayList<RocketClass> r2Rockets = simulation.loadItemsInR2Rocket(itemList);
		double r2Cost = simulation.runSimulation(r2Rockets);
		System.out.println("Total cost for R2 fleet :  $" + String.format("%,.2f", r2Cost)+"\n");

	}
}
