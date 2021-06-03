package assignment;

class Plant
{
	Plant()
	{
		System.out.println("plant created");
		
	}
}
class Tree extends Plant
{
	Tree()
	{
		super();// it will invoke the constructor of immediate parent class constructor.
		System.out.println("tree created");
		//super();  super()	should always be first line of Contructor.
		}
	
}

public class Test {

	
	public static void main(String[] args) {
	
Tree tree=new Tree();
	}

}
