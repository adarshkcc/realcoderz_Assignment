package classRelationshipAssignment2;

import java.util.ArrayList;

public class ToyStore {

	String Name;
	ArrayList<Toy> toys=new ArrayList<Toy>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Toy> getToys() {
		return toys;
	}
	public void setToys(ArrayList<Toy> toys) {
		this.toys = toys;
	}
	
	int addNewToy(Toy toy)
	{
		toys.add(toy);
		System.out.println(toys.size());
		return toys.size();
	}
	
	int addStock(String toyName,int quantity)
	{
		Toy toy=new Toy();
		for(int i=0;i<toys.size();i++)
		{
		if(toyName.equalsIgnoreCase(toys.get(i).toyName))
		{
			
			toy.setStockQty(toy.stockQty+quantity);
			return toy.getStockQty();
		}
	
		}
		return -1;
	}
}
