package collectionAssignment5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class MapManager {

	//Question 8
	Set<Integer> s=new HashSet<Integer>();
	Set<Integer> getKeys(HashMap<Integer,String>m1)
	{
		// System.out.println(m1.get(1));
		
		for(Map.Entry<Integer, String> map:m1.entrySet())
		{
			
			s.add(map.getKey());
		}
		return s;
	}

	//Question 9
	String getDate(String format)
	{
		SimpleDateFormat formatter=new SimpleDateFormat(format);
		Date date=new Date();
		return formatter.format(date);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapManager m=new MapManager();
		//Question 8
		HashMap<Integer,String> s=new HashMap<Integer,String>();
		s.put(1, "Adarsh");
		s.put(2,"Rohit");
		s.put(3, "Ashutosh");
		System.out.println(	m.getKeys(s));

		//Question 9
		String format="dd/MM/yy"; 
		System.out.println(	m.getDate(format));


	}

}
