package assignment;

import java.util.Scanner;

public class SimpleIntrestCalculator {

	public void claculatesimpleIntrest(double p,double r, int n)
	{
		double SimpleIntrest=(p*r*n)/100;
		System.out.println("simple intrest is "+SimpleIntrest );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount");
		double principleAmount=sc.nextDouble();
		
		System.out.println("enter the no. of years");
		int numOfYears=sc.nextInt();
		
		double r;
	
		SimpleIntrestCalculator c=new SimpleIntrestCalculator();
		
		if((principleAmount>100000) &&(numOfYears>10))
		{
			r=10;
		c.claculatesimpleIntrest(principleAmount,r,numOfYears);
		}
		else if((principleAmount>100000) &&(numOfYears<10))
		{
			r=9.5;
			c.claculatesimpleIntrest(principleAmount,r,numOfYears);
		}
		else if((principleAmount<100000) &&(numOfYears>10))
		{
			r=5;
			c.claculatesimpleIntrest(principleAmount,r,numOfYears);
		}
		else if((principleAmount<100000) &&(numOfYears<10))
		{
			r=4.5;
			c.claculatesimpleIntrest(principleAmount,r,numOfYears);
		}
		
		
		

	}

}
