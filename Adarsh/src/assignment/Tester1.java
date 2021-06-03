package assignment;

public class Tester1 {

	public static void main(String[] args) {
		
		int x=0,y=0;
		if((true & false)|(true & false) & x++>0)
			System.out.println("stmt1");
		if(false || true| (++y>0 | y++>0))
			System.out.print("stmt2");
		System.out.print(x+""+y);
					

	}

}
