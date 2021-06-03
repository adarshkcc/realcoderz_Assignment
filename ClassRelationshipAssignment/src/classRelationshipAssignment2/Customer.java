package classRelationshipAssignment2;

import java.util.ArrayList;

public class Customer extends ToyStore
{
	String custName;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	String searchLeastPriceToy(ToyStore store,String category)
	{
		ArrayList<Toy> list=new ArrayList<Toy>();
		int match=0;
		for(int i=0;i<toys.size();i++)
		{
			if(store.toys.get(i).getCategory()==category)
			{
				list.add(toys.get(i));
				match++;
			}

		}
		double leastPrice=list.get(0).getUnitPrice();
		int index=0;
		for(int i=1;i<list.size();i++)
		{
			if(leastPrice>list.get(i).getUnitPrice())
			{
				leastPrice=list.get(i).getUnitPrice();
				index=i;
			}
			else
				continue;

		}
		if(match>0)
			return list.get(index).toyName;
		else
			return "NA";
	}

	double buyToy(ToyStore store,String toyName,int quantity)
	{
		System.out.println("welcome to "+store.getName()+"😊");
		double billAmount=0;
         System.out.println(toys.size());
		for(int i=0;i<toys.size();i++)
		{
			System.out.println("f");
			if((toys.get(i).getToyName()==toyName) &&(toys.get(i).getStockQty()>=quantity))
			{
               // calculating the bill Amount
				billAmount=toys.get(i).getUnitPrice() * quantity;
               // updating the quantity in store
                store.toys.get(i).setStockQty(toys.get(i).getStockQty()-quantity);
                return billAmount;
			}
		}
	
		return -1;
	}
}
