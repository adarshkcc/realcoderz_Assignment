package customer;

public class RegisterCustomer extends Customer
{
private double specialDiscount;
public RegisterCustomer(String customerName,double specialDiscount)
{
	super(customerName);
	this.specialDiscount=specialDiscount;
}
public double getSpecialDiscount()
{
	return specialDiscount;
}
	public double getTotalAmountForCustomer()
	{
		double total=0;
		total=super.getTotalAmountForCustomer();
		total-=(total*specialDiscount/100);
		return total;
	}
}
