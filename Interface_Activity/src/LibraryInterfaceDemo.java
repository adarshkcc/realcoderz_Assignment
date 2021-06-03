
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidUser k=new KidUser();
		k.setAge(10);
		k.registerAccount();
		k.setAge(18);
		k.registerAccount();
		
		k.setBookType("kids");
		k.requestBook();
		k.setBookType("fiction");
		k.requestBook();
		
		
		AdultUser a=new AdultUser();
		a.setAge(5);
		a.setAge(23);
		
		a.setBookType("kids");
		a.setBookType("fiction");
		

	}

}
