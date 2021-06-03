package assignment;

class Creature
{
	void grow()
	{
		
	}
}
class Bird extends Creature
{
	void fly()
	{
		
	}
}
class Falcon extends Bird
{
	void hunt()
	{
		
	}
}


public class Tester6 {

	public static void main(String[] args) {
		Creature c1=new Bird();
		Falcon c2=new Falcon();
		//Falcon c3=new Bird(); we can have only parent reference to child class object
       // Falcon c4=new Creature();
		Bird c5=new Falcon();
	}

}
