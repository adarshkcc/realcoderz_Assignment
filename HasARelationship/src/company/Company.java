package company;

import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import item.Item;

public class Company {

	private String companyName;
	private List<Item>itemList=new ArrayList<Item>();
	private List<Customer>customerList=new ArrayList<Customer>();
	
	public Company(String companyName)
	{
		this.companyName=companyName;
	}
	public String getCompanyName() {
		return companyName;
	}
	
	public List<Item> getItemList() {
		return itemList;
	}
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	
	public void addItem(Item item)
	{
		itemList.add(item);
	}
	public void addCustomer(Customer customer)
	{
		customerList.add(customer);
	}
}
