package assignment;

public class Tester {

	public static void main(String[] args) {

		//Question 1

		String stmt = "Java is a Programming Language";
		for (String token : stmt.split("//s")) 
		{ 
			// split() returns a string Array, split method contain two parameter split(String regex,int limit)	,split() splits the String from desired String,default limit is 0.

			//s.split(String regex,int limit)
			//s.split("s",4) split String 3 times from s.
			System.out.println(token + " ");

			//Question 2

			boolean stmt1 = "hello" == "hello"; //true

			boolean stmt2 = new String("hello") == "hello"; //false

			boolean stmt3 = new String("hello") == new String("hello");//false

			System.out.println(stmt1 && stmt2 || stmt3);


			// Question 3
			StringBuffer buffer1 = new StringBuffer("java");
			StringBuffer buffer2 = new StringBuffer(buffer1); 
			if (buffer1.equals(buffer2)) //false
				System.out.println("true");
			else
				System.out.println("false");

			// Question 4

			StringBuffer sb1 = new StringBuffer("java");
			StringBuffer sb2 = new StringBuffer("java");

			boolean stm1 =sb1.equals(sb2) ;
			boolean stm2 = sb1 == sb2; 

			String s1 = new String("java"); 
			String s2 = new String("java"); 

			boolean stm3 = s1.equals(s2); //true
			boolean stm4 = s1 == s2;

			// Question 5

			String str = "java";
			StringBuffer sb = new StringBuffer("java"); 
			//	sb.insert(9, "programming"); //index outOfBoundException index should be <=length of String
			str.concat("exercise");
			if (sb.length() < 6 || str.equals("java")) 
			{
				System.out.print(sb);
			}
			sb.delete(2, 7);
			System.out.println(sb);

			// question 6

			String s3 = null;
			String s4 = null;
			if (s1 == s2) System.out.print("A");
			if (s1.equals(s2)) 
				System.out.println("B");
			
			// Question 7
			
			System.out.print("1");
			try {
			
				return;
			} catch (Exception e)
			{
			System.out.print("2");
			
			} 
			finally // it will always execute weather we get exception or not or whatever operation we perform 
			{
			System.out.print("3");
			}
			System.out.print("4");// coz of return in try block,this line will not execute.



		}
	}

}
