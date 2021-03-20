package mock;

public class InheriAnimal {

	public String name;
	public int legs, eyes;
	public double weight;

	public InheriAnimal(String name, int legs, int eyes, double weight) {
		this.name = name;
		this.legs = legs;
		this.eyes = eyes;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Animal eat() method is called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
