package assignment;

interface Colorable1
{
	
}
class Vehicle //implements Colorable1
{
	
}
class Car extends Vehicle implements Colorable1
{
	
}
public class Tester8 {

	public static void main(String[] args) {
		Vehicle a=new Car();
		Colorable1 i=(Colorable1)a;
		Vehicle b=new Vehicle();
		Colorable1 j=(Colorable1)b;

	}

}
