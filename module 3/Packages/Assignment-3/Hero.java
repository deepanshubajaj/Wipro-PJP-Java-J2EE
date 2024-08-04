package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	public void getModelName() {
		System.out.println("modelName: " + modelName);
	}

	
	public void getRegistrationNumber() {
		System.out.println("registrationNumber: " + registrationNumber);
	}

	public void getOwnerName() {
		System.out.println("ownerName: " + ownerName);
	}

	public int getSpeed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("Accessing the radio");
	}
	
}