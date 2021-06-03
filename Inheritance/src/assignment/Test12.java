package assignment;

class A
{
private void printName()
	{
	System.out.println("value-A");	
	}
}
/*public*/ class B extends A // we cannot have more than one public class in one file
{
	public void printName()
	{
		System.out.println("Name-B");
	}
}
public class Test12 {

	public static void main(String[] args) {
		B b=new B();
		b.printName();

	}

}
