package com;

import java.util.Scanner;

public class ToyDemo {
public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the first category name");
		String category1=sc1.next();
		System.out.println("ener the Second category");
		String category2=sc1.next();

		Toy one = new Toy("Apple",category1,300,20);
		Toy two = new Toy("banana",category1,320,30);		
		Toy three = new Toy("lion",category2,300,50);
		Toy four = new Toy("elephant",category2,400,45);

		String name= toyName(one,two,three,four);
		if(category1.equals("fruits")&& category2.equals("animals"))
			System.out.println("The Least price Toy is: "+name);
		else
			System.out.println(name);
	}

	public static String toyName(Toy one,Toy two,Toy three,Toy four)
	{
		if(one.getCategory().equals("fruits")&& three.getCategory().equals("animals"))
		{

			Toy Least=one;
			double amount,amountOfToy1,amountOfToy2,amountOfToy3,amountOfToy4;
			amountOfToy1=one.getPrice()-one.getDiscount();
			amountOfToy2=two.getPrice()-two.getDiscount();
			amountOfToy3=three.getPrice()-three.getDiscount();
			amountOfToy4=four.getPrice()-four.getDiscount();

			if(amountOfToy1>amountOfToy2)
			{
				amount=amountOfToy2;
				Least=two;
			}
			else
				amount=amountOfToy1;


			if(amount>amountOfToy3)
			{
				amount=amountOfToy3;
				Least=three;
			}
			else if(amount>amountOfToy4)
			{
				amount=amountOfToy4;
				Least=four;
			}
			return Least.getName();
		}
		else return "no category found";
	}

}
