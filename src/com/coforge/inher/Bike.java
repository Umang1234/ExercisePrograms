package com.coforge.inher;

public class Bike extends Vehicle {

	double mileage;
	double price;

	public void showmileage() {
		System.out.println("mileage is "+mileage);
	}

	public Bike(String brand, String model, double price, double mileage) {
		super(brand, model, price);
		this.mileage = mileage;
	}
	
	public double  getDiscountedPrice(double amount) {
		return (price-(amount+500));
	}

}
