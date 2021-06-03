package collectionAssignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountryMap {

	HashMap<String,String> m1=new HashMap<String,String>();
	
	HashMap<String,String> storeCountryCapital(String countryName,String capital)
	{
		m1.put(countryName, capital);
		return m1;
	}
	String retrieveCapital(String countryName)
	{
		if(m1.containsKey(countryName))
			return m1.get(countryName); 
		return null;
	}
	String retrieveCountry(String capital)
	{
		for(Map.Entry<String,String> map:m1.entrySet())
		{
			if(map.getValue().equalsIgnoreCase(capital))
				return map.getKey();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		CountryMap c=new CountryMap();
		c.storeCountryCapital("India", "Delhi");
		c.storeCountryCapital("Australia", "Canbera");
		c.storeCountryCapital("America", "NewYork");
		
		System.out.println(c.retrieveCapital("India"));
		System.out.println(c.retrieveCountry("CanbeRa"));

	}

}
