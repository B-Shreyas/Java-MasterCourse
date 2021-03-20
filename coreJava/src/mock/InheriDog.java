package mock;

public class InheriDog extends InheriAnimal {

	public int eyes;
	public String name, colour;

	public InheriDog(String name, int legs, int eyes, double weight, int eyes2, String name2, String colour) {
		super(name, legs, eyes, weight);
		eyes = eyes2;
		name = name2;
		this.colour = colour;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void showDogDetails() {
		System.out.println("Dog name: " + name);
		System.out.println("Dog legs: " + legs);
		System.out.println("Dog color: " + colour);
	}

}
