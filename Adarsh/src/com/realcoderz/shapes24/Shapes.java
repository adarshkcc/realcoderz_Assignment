package com.realcoderz.shapes24;

import java.util.Scanner;

public class Shapes {

public void calculateShapeArea(int numOfSides,int sides)
{
	if(numOfSides==1)
	{
		Circle c=new Circle();
		System.out.print("The area of Circle is ");
		c.calculateArea(sides);
	}
	else if(numOfSides==3)
	{
		Triangle t=new Triangle();
		System.out.print("The area of Triangle is ");
		t.calculateArea(sides);
	}
	else if(numOfSides==4)
	{
		Square s=new Square();
		System.out.print("The area of Square is ");
		s.calculateArea(sides);
	}
	else
		System.out.println("can't find the suitable shape based on number of sides");
}
public static void main(String[] args)
{
	int numOfSides;
	System.out.println("enter the no.of sides");
	Scanner sc=new Scanner(System.in);
	numOfSides=sc.nextInt();
	System.out.println("enter the side length");
	int sides=sc.nextInt();
	
	Shapes s=new Shapes();
	s.calculateShapeArea(numOfSides, sides);
}
}
