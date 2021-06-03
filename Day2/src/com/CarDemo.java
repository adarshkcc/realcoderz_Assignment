package com;

public class CarDemo {

	public static void main(String[] args) {
		Car one =new Car("Hyundai","Santro",5,700000);
		Car two=new Car("Chevrolet","tavera",10,1200000);
		Car three=new Car("Suzuki","Ertica",6,1000000);
		Car four=new Car("Mahindra","Bolero",8,900000);
		
		char ch='c';
		System.out.println(getBestCar(one,two,three,four,ch));
		

	}
	public static String getBestCar(Car one,Car two,Car three,Car four,char ch)
	{
	Car capacity=one;	
	
	if(capacity.getPassengerCapicity()<two.getPassengerCapicity())
		capacity=two;
	if(three.getPassengerCapicity()>capacity.getPassengerCapicity())
		capacity=three;
	if(four.getPassengerCapicity()>capacity.getPassengerCapicity())
		capacity=four;
	return capacity.getMake()+"-"+capacity.getModel();
	}

}
