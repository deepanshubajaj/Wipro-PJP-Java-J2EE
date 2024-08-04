package com.automobile;

public class Honda extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
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
	
	public void cdplayer() {
		System.out.println("Accessing CD Player.");
	}

}
