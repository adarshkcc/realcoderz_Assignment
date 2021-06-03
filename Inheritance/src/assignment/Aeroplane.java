package assignment;
// if any method is abstract then child class must implement the abstract method other wise it give compile error
abstract class AirPlane
{
	abstract void fly();
	void land()
	{
	System.out.println("Landing...");	
	}
}
class Airjet extends AirPlane
{
	Airjet()
	{
		super();
	}
	void fly()
	{
		System.out.println("Flying..");
	}
	//abstract void land();// abstract method should always be used in abstract class.
}
public class Aeroplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
