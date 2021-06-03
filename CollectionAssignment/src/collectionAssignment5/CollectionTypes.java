package collectionAssignment5;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionTypes {

	public static void main(String[] args) {
	Queue<String> x=new LinkedList<String>();
	
		x.add("one");
		 x.add("two");
		 x.add("one");
		 System.out.println(x.poll());// poll() will first return first element in the list then delete the first element
		 System.out.println(x);


	}

}
