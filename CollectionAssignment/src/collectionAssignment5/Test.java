package collectionAssignment5;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer a = new Integer(4);
		 Integer b = new Integer(8);
		 Integer c = new Integer(4);
		 HashSet hs = new HashSet();// in hashSet insertion order is not preserved(i.e random order) and dublicacy not allowed
		 hs.add(a);
		 hs.add(b);
		 hs.add(c);
		 System.out.println(hs);


	}

}
