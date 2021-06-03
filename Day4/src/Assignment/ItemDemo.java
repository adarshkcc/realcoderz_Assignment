package Assignment;

import java.util.Scanner;

public class ItemDemo {

	public static Item getLeastPriceItem(Item brr[])
	{
		Item t=brr[0]; int j=0;
		double netPrice[]=new double[5];
		for(int i=0;i<5;i++)
		{
			netPrice[i]=(brr[i].itemPrice-brr[i].itemDiscount);
		}

		double min=netPrice[0];
		//String s="";
		for(int i=0;i<5;i++)
		{
			if(min<=netPrice[i])
			{

				continue;
			}
			else
			{
				min=netPrice[i];

			}
		}
		for(int i=0;i<5;i++)
		{
			if(netPrice[i]==min)
			{
				t= brr[i];
				break;
			}
		}

		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item t[]=new Item[5];
		int itemId;
		String itemName;
		double itemPrice;
		double discount;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the item id");
			itemId=sc.nextInt();
			System.out.println("enter item name");
			itemName=sc.next();
			System.out.println("enter item price");
			itemPrice=sc.nextDouble();
			System.out.println("enter the discount");
			discount=sc.nextDouble();
			t[i]=new Item(itemId,itemName,itemPrice,discount);
		}
		Item items=ItemDemo.getLeastPriceItem(t);
		System.out.println("the least price item is : "+items.itemName+" price : "+items.getItemPrice()+" itemId : "+items.itemId);
	}

}
