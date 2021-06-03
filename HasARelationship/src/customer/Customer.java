package customer;

import java.util.ArrayList;
import java.util.List;

import order.Order;

public class Customer {

	private String customerName;
	private List<Order>orderList=new ArrayList<Order>();
	
	public Customer(String customerName)
	{
		this.customerName=customerName;
	}
	
	public void placeOrder(Order o)
	{
		
	}
}
