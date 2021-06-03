package order;

import java.util.ArrayList;
import java.util.List;

import util.IdGenerator;

public class Order {
private int orderId;
private List<OrderItem> orderItemList=new ArrayList<OrderItem>();
public double getAmountForOrder() {
	double total=0;
	for(OrderItem orderItem:orderItemList)
	{
	
	total+=orderItem.getAmountForItem();
	}
	return total;
	
}
public Order()
{
super();
orderId=IdGenerator.idGen();
}
public void addOrderItems(OrderItem orderItem)
{
	orderItemList.add(orderItem);
}
public int getOrderId()
{
	return orderId;
}

public List<OrderItem> getOrderItemList()
{
	return orderItemList;
}





}
