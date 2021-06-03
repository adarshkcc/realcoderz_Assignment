package Inheritence_Assignment2;

public abstract class Account {
int accountId;
int customerId;
double balance;

Account(int accountId,int customerId,double balance)
{
	this.accountId=accountId;
	this.customerId=customerId;
	this.balance=balance;
}

public int getAccountId() {
	return accountId;
}

public int getCustomerId() {
	return customerId;
}

public double getBalance() {
	return balance;
}
abstract double deposite(double deposite);
abstract double withdraw(double withdraw);
}
class SavingAccount extends Account
{
	SavingAccount(int accountId,int customerId,double balance)
	{
		super( accountId,customerId,balance);
	}
	
	double deposite(double deposite)
	{
		balance=balance+deposite;
		return balance;
	}
	double withdraw(double withdraw)
	{
		balance=balance-withdraw;
		return balance;
	}
}



