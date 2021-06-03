package order;

import item.Item;

public class OrderItem {

	private int quantity;
	private Item item;
	
	public OrderItem(int quantity,Item item)
	{
		this.quantity=quantity;
		this.item=item;
	}

	public int getQuantity() {
		return quantity;
	}

	public Item getItem() {
		return item;
	}
}
