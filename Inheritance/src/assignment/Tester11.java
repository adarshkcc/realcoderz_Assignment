package assignment;
interface Colorable
{
	
}
interface Bouncable extends Colorable
{
	
}
class Super implements Bouncable
{
	
}
class Sub extends Super implements Bouncable
{
	
}
class Individual
{
	
}
public class Tester11 {

	public static void main(String[] args) {
	
      System.out.println(new Sub()instanceof Super);
      System.out.println(new Sub()instanceof Colorable);
      System.out.println(new Super()instanceof Sub);
     // System.out.println(new Individual()instanceof Super);
	}

}
