package assignment;



 interface Foldable {

	public void Fold() throws Exception;
}
 class Paper implements Foldable
{
	public void Fold() 
	{
		System.out.println("fold");
	}
}
 class Tester5
 {
	 public static void main(String[]args)throws Exception
	 {
		 Foldable obj1=new Paper();
		 obj1.Fold();
		 Paper obj2=new Paper();
		 obj2.Fold();
	 }
 }