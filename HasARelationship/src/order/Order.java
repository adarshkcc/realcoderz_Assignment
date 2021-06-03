package order;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<OrderItem>orderItemList=new ArrayList<OrderItem>();

	public void addOrderItem(OrderItem orderItem)
	{
		orderItemList.add(orderItem);
	}
	
}
