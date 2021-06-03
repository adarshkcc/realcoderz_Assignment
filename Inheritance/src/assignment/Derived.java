package assignment;

class Base
{
private Base()
	{
		System.out.println("base");
	}
}

public class Derived extends Base {
public Derived() // an error will show because parent class constructor is private and because of this child class constructor not able to invoke parent class Constructor.
{
	System.out.println("derived");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Derived();
	}

}
