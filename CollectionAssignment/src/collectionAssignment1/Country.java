package collectionAssignment1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Country {
HashSet<String> h1=new HashSet<String>();

HashSet<String> storeCountryName(String countryName)
{
	h1.add(countryName);
	return h1;
}

	String retrieveCountry(String countryName)
	{
		Iterator<String> itr=h1.iterator();
		while(itr.hasNext())
		{
		if(countryName.equalsIgnoreCase(itr.next()))
		{
		
			return countryName;
		}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Country c1=new Country();
c1.storeCountryName("India");
c1.storeCountryName("Australia");
c1.storeCountryName("America");
c1.storeCountryName("Brajil");

Scanner sc=new Scanner(System.in);
System.out.println("enter the country name");
String s=sc.next();
System.out.println(c1.retrieveCountry(s));
	}

}
