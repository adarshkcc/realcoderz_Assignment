package day1Assignment;

import java.util.Scanner;

public class ShowDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fixed cost");
	double fixedCost=sc.nextDouble();
	
	System.out.println("enter the variable cost");
	double variableCost=sc.nextDouble();
	
	System.out.println("enter the rate of ticket");
	double ratePerTicket=sc.nextDouble();
	
	System.out.println("enter the number of attendies");
	double noOfAttendies=sc.nextDouble();
	
	System.out.println("profit of the show is = "+calculateProfit(fixedCost,variableCost,ratePerTicket,noOfAttendies));
	

	}
	public static double calculateProfit(double fixedCost,double variableCost,double ratePerTicket,double noOfAttendies)
	{
		double profit=noOfAttendies*(ratePerTicket-variableCost)-fixedCost;
		return profit;
	}

}
