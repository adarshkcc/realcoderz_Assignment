package assignment;
import java.util.Scanner;
public class MessagePrinter {

	public void printMessage(String name)
	{
		System.out.println("hello"+" "+name);
	}
	
	public static void main(String[] args) {
		
System.out.println("enter the name");
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();
MessagePrinter print=new MessagePrinter();
print.printMessage(name);
	}

}
