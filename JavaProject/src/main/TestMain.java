package main;

import company.Company;
import customer.Customer;
import item.Item;
import order.Order;
import order.OrderItem;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//company
		Company company=new Company("chroma");
		//item
		Item t1=new Item("computer",25000);
		Item t2=new Item("laptop",25000);
		Item t3=new Item("washing machine",350000);
		Item t4=new Item("fridge",20000);
		Item t5=new Item("ac",15000);
		Item t6=new Item("iron",7000);

		//customer
		Customer c1=new Customer("savya sachi");
		Customer c2=new Customer("Tauseef");
		Customer c3=new Customer("Adarsh");
		Customer c4=new Customer("Rohit");
		Customer c5=new Customer("Tarun");

		//add customer
		company.addCustomer(c1);
		company.addCustomer(c2);
		company.addCustomer(c3);
		company.addCustomer(c4);
		company.addCustomer(c5);

		//customer chooses item for order
		OrderItem oi1=new OrderItem(1,t1);
		OrderItem oi2=new OrderItem(2,t2);
		OrderItem oi3=new OrderItem(3,t3);
		OrderItem oi4=new OrderItem(1,t4);
		OrderItem oi5=new OrderItem(4,t5);
		OrderItem oi6=new OrderItem(2,t6);

		Order order1=new Order();
		order1.addOrderItems(oi1);
		order1.addOrderItems(oi2);

		Order order2=new Order();
		order2.addOrderItems(oi3);

		Order order3=new Order();
		order3.addOrderItems(oi4);
		order3.addOrderItems(oi5);

		Order order4=new Order();
		order4.addOrderItems(oi6);

		Order order5=new Order();
		order5.addOrderItems(oi1);
		order5.addOrderItems(oi2);

		c1.placeOrder(order1);
		c2.placeOrder(order2);
		c3.placeOrder(order3);
		c4.placeOrder(order4);
		c5.placeOrder(order5);

		System.out.println("company name "+company.getName());
		for(Customer customer :company.getCustomerList())
		{
			System.out.println("\n customer Id "+customer.getCustomerId()+"\n customer name "+customer.getCustomerName());
			for(Order order:customer.getOrderList())
			{
				System.out.println("order List");
				for(OrderItem orderItem:order.getOrderItemList())
				{
					System.out.println("\t\t Item : "+orderItem.getItem().getDescription()+"\t Rate"+orderItem.getItem().getRate()+" Quantity "+orderItem.getQuantity()+" Total Rs : "+orderItem.getAmountForItem()+" Exclusive Discount");

				}
			}
		}
		System.out.println("\n====================================================");
		System.out.println("\t\t\t\t\t\t Order Value Total Rs "+company.getTotalWorthOrderPlaced()+" Inclusive Discount");
	}

}
