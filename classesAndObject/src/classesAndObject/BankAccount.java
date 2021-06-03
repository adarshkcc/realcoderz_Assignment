package classesAndObject;

import java.util.Scanner;

public class BankAccount {
	long  accNo;
	double balance;
	String accType;

	public BankAccount(long accNo,double balance,String accType)
	{
		this.accNo=accNo;
		this.balance=balance;
		this.accType=accType;
	}

	public void showDetails(long accNo,double balance,String accType)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the the amount u want to deposit");
		double deposite=sc.nextDouble();
		System.out.println("enter the amount u want to withdraw");
		double withdraw=sc.nextDouble();
		balance=balance+deposite;
		if(balance>=withdraw)
		{
			balance=balance-withdraw;
			System.out.println("Account number:"+accNo);
			System.out.println("Account Type:"+accType);
			System.out.println("the account balance is: "+(balance));
		}
		else
			System.out.println("Insuffiient balance");
	}
	public static void main(String[] args)
	{
		BankAccount b=new BankAccount(1434545275,20000,"savings");
		b.showDetails(b.accNo,b.balance,b.accType);
	}
}
