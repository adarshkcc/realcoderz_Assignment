package classesAndObject;

public class Person {

		String FirstName,LastName;
		
		public  Person(String firstName,String lastName)
		{
			this.FirstName=firstName;
			this.LastName=lastName;

	}
		public String toString()
		{
		return FirstName.concat(LastName);
		}
public static void main(String[] args)
{
	Person p=new Person("Adarsh"," Modanwal");
	System.out.println(p.toString());
}
}
