package javaApplication2;
import java.util.*;
public class Political_party {

	public static void main(String[] args) {
		int choice;
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		Party p=new Party();
		Voters v=new Voters();
		ViewParty vp=new ViewParty();
		ViewVoters vv=new ViewVoters();
		boolean flag=true;
		while(flag)
		{
	
	
	System.out.println("press 1 to model party");
	System.out.println("press 2 to model voters");
	System.out.println("press 3 to view party");
	System.out.println("press 4 to view voters");
	System.out.println("press 5 to exit");
	System.out.println("enter the choice");
	choice=sc1.nextInt();
	
	switch(choice)
	{
	case 1:
	{
		System.out.println("enter the party id");
		int a=sc1.nextInt();
		p.setParty_Id(a);
		System.out.println("enter the party name");
		String name=sc2.nextLine();
		p.setParty_Name(name);
		break;
	}
	case 2:
	{
	System.out.println("enter voter Id");
	int a=sc1.nextInt();
	v.setVoter_Id(a);
	System.out.println("enter the name");
	String name=sc2.nextLine();
	v.setVoter_Name(name);
	break;
	}
	case 3:
	{
		vp.display_Party(p);
		break;
	}
	case 4:
	{
		vv.display_voters(v);
		break;
	}
	case 5:
	{
		flag=false;
		break;
	}
	
	}
	
		}

	}

}
