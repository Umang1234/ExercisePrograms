package com.coforge.inher;

public class Car extends Vehicle {

	String accessories;
	double price;
	public void showaccessories() {
		System.out.println("Accessories: "+accessories);
	}

	public Car(String brand, String model, double price, String accessories) {
		super(brand, model, price);
		this.accessories = accessories;
	}

	public double getDiscountedPrice(double amount) {
		return(price-amount);
	}
}
