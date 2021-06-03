package collectionAssignment5;
import java.util.ArrayList;
import java.util.List;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>();
		
		//List<Object> list2 = list1;// first we need to downcast the List list1
		
		List<Object> list2 = (List<Object>)(Object)list1;

		list2.add(new Integer(12));
		System.out.println(list2.size());


	}

}
