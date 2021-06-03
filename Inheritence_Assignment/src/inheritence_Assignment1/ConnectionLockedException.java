package inheritence_Assignment1;

public class ConnectionLockedException extends Exception 
{
double currentBalance;

ConnectionLockedException(double curentBalance)
{
	this.currentBalance=currentBalance;
}
public String getMessage()
{
	String s=String.valueOf(currentBalance);
	return s;
}
}
