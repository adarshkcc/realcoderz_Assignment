package Inheritence_Assignment2;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args)throws OutOfBalanceException {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		Account acc1=new SavingAccount(1,11,40000);
		Account acc2=new SavingAccount(2,21,50000);
		Account acc3=new SavingAccount(3,31,30000);
		
	
		b.addAccount(acc1);
		b.addAccount(acc2);
		b.addAccount(acc3);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the Account Id");
		int id=sc.nextInt();
		System.out.println("enter the amount to be deposited");
		double deposite=sc.nextDouble();
		System.out.println("new balance after depositing Amount "+b.deposite(id,deposite));
		
		System.out.println("enter the Account id");
		int Id=sc.nextInt();
		System.out.println("enter the amount to withdraw");
		double withdraw=sc.nextDouble();
		System.out.println("New balance after withdrawing "+b.withdraw(Id, withdraw));
		
		System.out.println("Customer id in Bank :");
		System.out.println(b.getUniqueCustomerIds());
		
		System.out.println("Customer details in bank");
		System.out.println(b.getAccountHashMap());
		
		
		Account acc4=new SavingAccount(2,12,65000);
		b.addAccount(acc4);
	}

}
