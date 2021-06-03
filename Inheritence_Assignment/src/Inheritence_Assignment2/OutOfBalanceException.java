package Inheritence_Assignment2;

public class OutOfBalanceException extends Exception
{
double currentBalance;
double withdrawAmount;
OutOfBalanceException(double currentBalance,double withdrawAmount)
{
	this.currentBalance=currentBalance;
	this.withdrawAmount=withdrawAmount;
}
public String getMessage()
{
	double balance=(currentBalance-withdrawAmount);
	String s=String.valueOf(balance);
	return s;
}
}
