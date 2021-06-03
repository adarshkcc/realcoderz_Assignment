
public class Basic {

	int a=5;
	
 void show()
	{
		a=10;
	}
 void display()
 {
	 System.out.println(a);
 }
 public static void main(String[] args)
 {
	 Basic b=new Basic();
	 b.show();
	 b.display();
	 Basic b1=new Basic(); 
	 b1.display();
	 
 }
 // every object have seprate copy of instance variable.
}
