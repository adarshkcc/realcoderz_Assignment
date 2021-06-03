package classesAndObject;

import java.util.Scanner;

public class Count {

	public void display(int c)
	{
		System.out.println("the number of object created = "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=sc.nextInt();
		int c=0;
		Count p[]=new Count[n];
		for(int i=0;i<n;i++)
		{
		p[i]=new Count();
		c++;
		if(c==n)
			p[i].display(c);
		}
		
		

	
	}
}
