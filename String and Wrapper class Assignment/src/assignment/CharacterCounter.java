package assignment;

import java.util.Scanner;

// question 9
public class CharacterCounter {

	int countCharacter(String string,char ch)
{
		int count=0;
	for(char c:string.toCharArray())
	{
		if (ch==c)
			count++;
		else
			continue;
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CharacterCounter c=new CharacterCounter();
Scanner sc=new Scanner(System.in);
System.out.println("enter the character to gets the no.of occurence");
char ch=sc.next().charAt(0);
System.out.println(c.countCharacter("welcome to java programming", ch));
	}

}
