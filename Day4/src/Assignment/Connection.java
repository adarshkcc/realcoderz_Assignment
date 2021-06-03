package Assignment;

public class Connection {

	private int connId;
	int customerId;
	private String customerEmail;
	double balance;
	Connection(int connId,int customerId,String customerEmail,double balance)
	{
		this.connId=connId;
		this.customerId=customerId;
		this.customerEmail=customerEmail;
		this.balance=balance;
	}
	public int getConnId() {
		return connId;
	}
	public void setConnId(int connId) {
		this.connId = connId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
