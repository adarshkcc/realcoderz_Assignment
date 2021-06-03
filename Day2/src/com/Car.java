package com;

public class Car {
private String make;

private String model;
private int passengerCapicity;
private double onRoadPrice;

public Car(String make,String model,int passengerCapicity,double onRoadPrice)
{
	this.make=make;
	this.model=model;
	this.passengerCapicity=passengerCapicity;
	this.onRoadPrice=onRoadPrice;
	
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getPassengerCapicity() {
	return passengerCapicity;
}
public void setPassengerCapicity(int passengerCapicity) {
	this.passengerCapicity = passengerCapicity;
}
public double getOnRoadPrice() {
	return onRoadPrice;
}
public void setOnRoadPrice(double onRoadPrice) {
	this.onRoadPrice = onRoadPrice;
}
}
