package com.coforge.inher;

class Vehicl {
	String brand;
	String model;
	int price;

	public Vehicl(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public void getDetails() {
		System.out.println(brand + " " + model + " " + price);
	}
}

class Bik extends Vehicl {
	int mileage;
	public void showMileage() {
		System.out.println("mileage is 60kmpl");
	}
	public Bik(String brand, String model, int price, int mileage) {
		super(brand, model, price);
		this.mileage = mileage;
	}
}

class Ca extends Vehicl {
	String accessories;
	public void showAccessories() {
		System.out.println("Music Player");
	}
	public Ca(String brand, String model, int price, String accessories) {
		super(brand, model, price);
		this.accessories = accessories;
	}
}

public class Inher {
	public static void main(String[] args) {

		Vehicl v = new Vehicl("Hyundai", "tre", 100000);
		Ca c = new Ca("Maruti", "i10", 50000, "sound system");
		Bik b = new Bik("Pulsar", "new", 11000, 12);
		v.getDetails();
		c.showAccessories();
		v.getDetails();
		b.showMileage();
	}


}
