package collectionAssignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Question 5
public class ListManager {

		List<String> removeElements(List<String>list1,List<String>list2)
		{
	
			list1.retainAll(list2);//it will only retain the elements of List1 that also present in list2
			
//			
			
		
			return list1;
		}

	//Question 6
	List<String>l1=new ArrayList<String>();

	List<String> getArrayList(String s[])
	{
	
		l1 = Arrays.asList(s);
		Collections.sort(l1);
		return l1;
	}

	//Question 7
	HashSet<String> h1=new HashSet<String>();

	List<String> getCollection(String s[])
	{

		List<String> list=new ArrayList<String>();
	
		for(int i=0;i<s.length;i++)
		{
			h1.add(s[i]);
		}

		list.addAll(h1);

		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListManager m=new ListManager();
		String s[]= {"zainab","Rohit","Adarsh","Ashutosh","Aditya","Adarsh","Saurav","Rohit","Abahy","tauseef"};
		
		String s2[]= {"Rohit","Abahy","tauseef"};
		List<String>l1=new ArrayList<String>();
		List<String>l2=new ArrayList<String>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l2.add("a");
		l2.add("b");
		l2.add("x");
	System.out.println(m.removeElements(l1, l2));

		System.out.println(m.getArrayList(s));

		System.out.println(m.getCollection(s));

	}


}
