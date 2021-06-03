package Assignment;

import java.util.Scanner;

public class ConnectionDemo {

	public static double getAverageBalance(Connection c[],int id)
	{
		int j=0;double s[]=new double[3]; double sum=0;
		for(int i=0;i<3;i++)
		{
	if(c[i].customerId==id)
	{
		s[j]=c[i].balance;
	j++;
		}
		}
		for(int i=0;i<3;i++)
		{
			if(id==c[i].customerId)
			sum=sum+s[i];
		}
			return sum/j;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ids;String email; double balance; int ci;
Connection c[]=new Connection[3];
for(int i=0;i<3;i++)
{
	System.out.println("enter connection id");
	ci=sc.nextInt();
	System.out.println("enter the customer id");
	ids=sc.nextInt();
	System.out.println("enter the email");
	email=sc.next();
	System.out.println("enter the balance");
	balance=sc.nextDouble();
c[i]=new Connection(ci,ids,email,balance);
}
System.out.println("enter the id u want to search");
int id=sc.nextInt();
System.out.println("The average salary of desired customer id is : "+ConnectionDemo.getAverageBalance(c, id));
	}

}
