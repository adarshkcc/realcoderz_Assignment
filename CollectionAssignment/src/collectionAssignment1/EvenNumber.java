package collectionAssignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EvenNumber {

	ArrayList<Integer> a1=new ArrayList<Integer>();
	ArrayList<Integer> a2=new ArrayList<Integer>();


	ArrayList<Integer> storeEvenNumber(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
				a1.add(i);
			else
				continue;
		}
		return a1;
	}
	//Iterator<Integer> itr=a1.iterator();
	ArrayList<Integer> printEvenNumber()
	{
		Iterator<Integer> itr=a1.iterator();
		int p;
		while(itr.hasNext())
		{
			p=2*itr.next();
			a2.add(p);
		}

		return a2;
	}
	int retrieveEvenNumber(int n)
	{
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext())
		{
			if(n==itr.next())
				return n;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumber e=new EvenNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range to get the even number : ");
		int n=sc.nextInt();
		ArrayList<Integer> al=e.storeEvenNumber(n);
		ArrayList<Integer> bl=e.printEvenNumber();

		//System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		System.out.println();
		itr=bl.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+itr.next());
		}
		System.out.println();
		System.out.println("enter the even number to be Searched in the list");
		int a=sc.nextInt();
		System.out.println(e.retrieveEvenNumber(a));
	}

}
