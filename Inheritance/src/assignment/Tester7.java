package assignment;

class Creature1 
{
	String getName()
	{
		return "Creature";	
	}
}
class Bird1 extends Creature1
{
	String getName()
	{
		return"Bird";
	}
	boolean hasFeather()
	{
		return true;
	}
}


public class Tester7 {

	public static void main(String[] args) {

		Creature1 c1=new Bird1();
		System.out.println(c1.getName());
		Bird1 b=(Bird1)c1;
		System.out.println(b.hasFeather());
		
		Creature1 c2=new Creature1();
		System.out.println(c2.getName());

	}

}
