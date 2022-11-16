package runRocketSimulation;

public class R1Class extends RocketClass {

	public R1Class() {
		cost = 100000000;
		currentWeight = 10000;
		maxWeight = 18000;
	}

	@Override
	public boolean launch() {
		return getXPercentFailure(5);
	}

	@Override
	public boolean land() {
		return getXPercentFailure(1);
	}

	public boolean getXPercentFailure(int percent) {
//		Math.random() * (max - min) + min;(https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random)
//		https://www.youtube.com/watch?v=majXnw6leB0
		return percent * (currentWeight / maxWeight) <= (Math.random() * 100) + 1;
	}

}