
public interface LibraryUser {

	void registerAccount();
	void requestBook();
}
class KidUser implements LibraryUser
{
	int age;
	String bookType;
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public void registerAccount()
	{
		if(age<=12)
			System.out.println("You have successfully registerd under a kids Account");
		else if(age>12)
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
	}
	public void requestBook() 
	{
		if(bookType.equalsIgnoreCase("Kids"))
			System.out.println("Books issued successfully,please return the book within 10 days ");
		else
			System.out.println("Oops,you are allowed to take only kids book");
	}
}

class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public void registerAccount()
	{
		if(age>=12)
			System.out.println("You have successfully resiterd under an Adult Account");
		else if(age>12)
			System.out.println("Sorry,Age must be greater than 12 to register as an adult");
	}
	public void requestBook() 
	{
		if(bookType.equalsIgnoreCase("fiction"))
			System.out.println("Books issued successfully,please return the book within 7 days ");
		else
			System.out.println("Oops,you are allowed to take only adult fiction book");
	}
}

