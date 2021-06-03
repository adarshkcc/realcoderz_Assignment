package day1Assignment;

import java.util.Scanner;

public class HollowAreaDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the outer radius of ball");
		double outerRadius=sc.nextDouble();
		System.out.println("enter the inner radius of the ball");
		double innerRadius=sc.nextDouble();
		System.out.println("Hollow area inside a ball is = "+calculateHollowArea(outerRadius,innerRadius));

	}
	public static double calculateHollowArea(double outerRadius,double innerRadius)
	{
		double area=4*3.14*outerRadius*outerRadius-4*3.14*innerRadius*innerRadius;
		return area;
	}

}
