package item;

import util.IdGenerator;

public class Item {
private String description;
private double rate;
private int itemId;

public Item(String description,double rate)
{
	this.description=description;
	this.rate=rate;
	this.itemId=IdGenerator.idGen();
}

public String getDescription() {
	return description;
}

public double getRate() {
	return rate;
}

public int getItemId() {
	return itemId;
}

}
