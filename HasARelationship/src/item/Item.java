package item;

public class Item {

	private String description;
	private double rate;
	
	public String getDescription() {
		return description;
	}

	public double getRate() {
		return rate;
	}

	public Item(String description,double rate)
	{
		this.description=description;
		this.rate=rate;
	
	}
}
