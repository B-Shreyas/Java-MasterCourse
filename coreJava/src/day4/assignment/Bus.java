package day4.assignment;

public class Bus {

	public void useVehicle() {
		System.out.println("The Bus is used:");
	}

}

class Train {
	public void useVehicle(int passenger) {
		System.out.println("The Train is used for --> " + passenger + " passengers");
	}
}

class Aeroplane {

	public void useVehicle(String planeClass) {
		System.out.println("The Plane is used for --> " + planeClass);
	}

}
