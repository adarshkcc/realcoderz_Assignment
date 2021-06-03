
//class Grandparent {
//	int a=5;
//    public void Print() {
//        System.out.println("Grandparent's Print()");
//    }
//}
//  
//class Parent extends Grandparent {
//    public void Print() {
//    	super.Print();
//        System.out.println("Parent's Print()");
//    }
//}
//  
//class Child extends Parent {
//    public void Print() {
//       super.Print(); 
//        System.out.println("Child's Print()");
//    }
//}
class A
{
	char ch='A';
	public char display()
	{
		return ch;
	}
}
class B extends A
{
	char ch='B';
	public char display()
	{
		return ch;
	}
}
public class Practice {

	public static void main(String[] args) {
	
		A a=new B();
		System.out.println(a.display()+" " +a.ch);
		
		A a1=new A();
		System.out.println(a1.display()+" "+a1.ch);
		B b=new B();
		System.out.println(b.display()+" "+b.ch);
//		Parent c=new Child();
//		c.Print();
//		String s=new String();                     //String d and Strin s both are valid.
//		String d="";
//		System.out.println(d);
//		System.out.println(s);
//	//	System.out.println(s.charAt(0));



	}

}
