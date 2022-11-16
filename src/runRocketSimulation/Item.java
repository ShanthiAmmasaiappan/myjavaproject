package runRocketSimulation;

public class Item {

	private String nameOfEquipment;
	private int weightOfEquipment;

	public Item() {
		this.nameOfEquipment = "";
		this.weightOfEquipment = 0;
	}

	public String getNameOfEquipment() {
		return nameOfEquipment;
	}

	public void setNameOfEquipment(String nameOfEquipment) {
		this.nameOfEquipment = nameOfEquipment;
	}

	public int getWeightOfEquipment() {
		return weightOfEquipment;
	}

	public void setWeightOfEquipment(int weightOfEquipment) {
		this.weightOfEquipment = weightOfEquipment;
	}
}

//	https://javarevisited.blogspot.com/2014/02/stringtokenizer-example-in-java-multiple-delimiters.html#axzz7keKbFmsy
//	https://www.youtube.com/watch?v=jMbbvMeZuDc
