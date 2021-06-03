package main;

import company.Company;
import customer.Customer;
import item.Item;
import order.Order;
import order.OrderItem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//company name
Company company=new Company("Chroma");

//List of customer
Customer c1=new Customer("Adarsh");
Customer c2=new Customer("Rohit");
Customer c3=new Customer("Tauseef");

//company has List of customer
company.addCustomer(c1);
company.addCustomer(c2);
company.addCustomer(c3);

//various Items in company
Item t1=new Item("Laptop",40000);
Item t2=new Item("Cooler",40000);
Item t3=new Item("Fan",40000);
Item t4=new Item("Iron",40000);
Item t5=new Item("Washing Machine",40000);

//ordered item are
OrderItem oi1=new OrderItem(1,t1);
OrderItem oi2=new OrderItem(2,t2);
OrderItem oi3=new OrderItem(4,t3);
OrderItem oi4=new OrderItem(1,t4);
OrderItem oi5=new OrderItem(1,t5);

//various orders are
Order o1=new Order();
o1.addOrderItem(oi1);
o1.addOrderItem(oi2);
o1.addOrderItem(oi4);

Order o2=new Order();
o2.addOrderItem(oi5);
o2.addOrderItem(oi3);

Order o3=new Order();
o3.addOrderItem(oi2);
o3.addOrderItem(oi1);
	}

}
