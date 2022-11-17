package runRocketSimulation;

public class R2Class extends RocketClass {
	public R2Class() {
		cost = 120000000;
		currentWeight = 18000;
		maxWeight = 29000;
	}

	@Override
	public boolean launch() {
		return getXPercentFailure(4);
	}

	@Override
	public boolean land() {
		return getXPercentFailure(8);
	}

	private boolean getXPercentFailure(int percent) {

		return percent * (currentWeight / maxWeight) <= (Math.random() * 100) + 1;
	}
}