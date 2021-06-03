package javaApplication;
import java.util.*;
public class UniersityController {

	public static void main(String[] args) {
		int choice;
		boolean flag=true;
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		EmployeeModuleClass emc=new EmployeeModuleClass();
		Employee_class vec=new Employee_class();
		Student_class vsc=new Student_class();
		StudentModuleClass smc=new StudentModuleClass();
		while(flag)
		{
		System.out.println("press 1 to model Employee");
		System.out.println("press 2 to model Student");
		System.out.println("press 3 to view Employee");
		System.out.println("press 4 to view Student");
		System.out.println("press 5 to exit");
		System.out.println("enter choice");
		 choice=sc1.nextInt();
		
		
		switch(choice)
		{
		case 1:
		{
		System.out.println("enter the first name of Employee");
		String name=sc2.nextLine();
		emc.setFirst_name(name);
		break;
		}
		case 2:
		{
			System.out.println("enter the first name of Student");
			String name=sc2.nextLine();
			smc.setFirst_name(name);
			break;
		}
		case 3:
		{
			vec.display_Employee_Name(emc);
			break;
		}
		case 4:
		{
			vsc.display_Student_Name(smc);
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
