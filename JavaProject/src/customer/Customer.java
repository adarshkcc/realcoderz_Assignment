package customer;

import java.util.ArrayList;
import java.util.List;

import order.Order;
import util.IdGenerator;

public class Customer {

	private String customerName;
	private int customerId;
	private List<Order> orderList=new ArrayList<Order>();
	
	public double getTotalAmountForCustomer()
	{
		double total=0;
		for(Order order:orderList)
		{
			total+=order.getAmountForOrder();
		}
		return total;
	}
	public Customer(String customerName)
	{
		this.customerName=customerName;
		this.customerId=IdGenerator.idGen();
	}
	public String getCustomerName() {
		return customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void placeOrder(Order order)
	{
		orderList.add(order);
	}
	public double getSpecialDiscount()
	{
		return 0;
	}
}
