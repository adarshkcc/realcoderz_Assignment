package assignment;

public class Increment {

	public static void main(String[] args) {
	
		int x=0,y=0;
		x=5+y++;       // in post-increment value of y is incremented after evaluation of expression
		System.out.println(x+""+y);
		
		x=0;
		y=0;
		
        x=5+ ++y;    //in pre-increment value of y is incremented before evaluation of expression.
System.out.println(x+""+y);


	}

}
