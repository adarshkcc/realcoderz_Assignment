package assignment;

public class Tester10 {

	int x=12;
	static Tester10 reset(Tester10 obj)
	{
		obj=null;
		return obj;
	}
	public static void main(String[] args) {
    Tester10 o=new Tester10();		
    o=reset(o);
    System.out.println(o.x);

	}

}
 