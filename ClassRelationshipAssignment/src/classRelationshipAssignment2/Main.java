package classRelationshipAssignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toy t1=new Toy();
		t1.setCategory("animal");
		t1.setToyName("lion");
		t1.setUnitPrice(50);
		t1.setStockQty(5);
		
		Toy t2=new Toy();
		t2.setCategory("animal");
		t2.setToyName("elephant");
		t2.setUnitPrice(30);
		t2.setStockQty(3);
		
		Toy t3=new Toy();
		t3.setCategory("fruit");
		t3.setToyName("mango");
		t3.setUnitPrice(10);
		t3.setStockQty(12);
		
		
		Toy t4=new Toy();
		t4.setCategory("fruit");
		t4.setToyName("apple");
		t4.setUnitPrice(15);
		t4.setStockQty(10);
		
		ToyStore s1=new ToyStore();
		s1.setName("Toys Collection");
		s1.addNewToy(t4);
		s1.addNewToy(t3);
		s1.addNewToy(t2);
		s1.addNewToy(t1);
		
//		ToyStore s2=new ToyStore();
//		s2.setName("ABCD Store");
//		s2.addNewToy(t4);
//		s2.addNewToy(t1);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		
		Customer c=new Customer();
		c.setCustName(sc.next());
		
		System.out.println("enter the name of Toy u want to buy");
		String name=sc.next();
		System.out.println("enter the quantity");
		int q=sc.nextInt();
		
		System.out.println("Your bill Amount is INR "+c.buyToy(s1, name, q)+"rs");
		
	}

}
