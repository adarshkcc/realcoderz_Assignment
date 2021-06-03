package order;

import item.Item;

public class OrderItem {
private int quantity;
private Item item;

public OrderItem(int quantity,Item item)
{
	this.item=item;
	this.quantity=quantity;
}
public int getQuantity()
{
	return quantity;
	
}
public Item getItem()
{
	return item;
}
public double getAmountForItem()
{
	return(item.getRate()*this.getQuantity());
}
}
