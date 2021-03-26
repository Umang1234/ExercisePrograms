package com.coforge.inher;

public class Vehicle {
	String brand;
	String model;
	int price;

	public Vehicle(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public void getDetails() {
		System.out.println(brand + " " + model + " " + price);
	}
	
	public double getDiscountedPrice(double amount) {
		return 0;
	}
}
