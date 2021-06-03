package inheritence_Assignment1;

public abstract class Connection {

	int connectionId;
	int customerId;
	double balance;
	
	Connection(int connectionId,int customerId,double balance)
	{
		this.connectionId=connectionId;
		this.customerId=customerId;
		this.balance=balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getConnectionId() {
		return connectionId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	 abstract double recharge(double recharge);
	 abstract double deduct(double deduct);

	
	 
}
class Prepaid extends Connection
{
	
	Prepaid(int connectionId,int customerId,double balance)
	{
		super(connectionId,customerId,balance);
	}
	
	double recharge(double recharge)
	{
		this.balance=balance+recharge;
		return balance;
	}
	double deduct(double deduct)
	{
		this.balance=balance-deduct;
		return balance;
	}
	
}

