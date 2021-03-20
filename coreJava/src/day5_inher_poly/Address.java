package day5_inher_poly;

public class Address {

	int srvno, pin;
	String soci, city;

	public int getSrvno() {
		return srvno;
	}

	public void setSrvno(int srvno) {
		this.srvno = srvno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getSoci() {
		return soci;
	}

	public void setSoci(String soci) {
		this.soci = soci;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(int srvno, int pin, String soci, String city) {
		System.out.println(" Inside para Constructor of Address");
		this.srvno = srvno;
		this.pin = pin;
		this.soci = soci;
		this.city = city;
	}

	public Address() {
	}

	public void showAddress() {
		System.out.println(srvno + " ," + soci + ", " + city + ", PIN " + pin);
	}

}
