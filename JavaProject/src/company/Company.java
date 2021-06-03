package company;

import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import item.Item;

public class Company {
	private String name;
	
	private List<Customer>customerList=new ArrayList<Customer>();
	private List<Item>itemList=new ArrayList<Item>();

	public Company(String name)
	{
		this.name=name;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public String getName() {
		return name;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void addItems(Item item)
	{
		itemList.add(item);
	}

	public void addCustomer(Customer customer)
	{
		customerList.add(customer);
	}
	public double getTotalWorthOrderPlaced()
	{
		double value=0;
		for(Customer customer:customerList)
		{
			value+=customer.getTotalAmountForCustomer();
		}
		return value;
	}
}
