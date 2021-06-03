package classesAndObject;

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		
int a[]=new int[5];
System.out.println("enter the elements in array");
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
	a[i]=sc.nextInt();
	
	
}
Biggest b=new Biggest();
b.display(a);
	}
	public void display(int a[])
	{
		int max=a[0];
		for(int i=0;i<5;i++)
		{
			if(max>=a[i])
				continue;
			else
				max=a[i];
		}
		System.out.println("the largest element in array is "+max);
	}

}
