package classesAndObject;

import java.util.Scanner;

 
 public class Employees
 {
	 
	 
	int empno;
	 String name;
	 String department;
	 double salary;
	 
	 public Employees(int empNo,String name,String department,double salary)
	 {
		 this.empno=empNo;
		 this.name=name;
		 this.department=department;
		 this.salary=salary;
	 }
	
	public static void display(Employees br[])
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("employee no : "+br[i].empno+" Employee name : "+br[i].name);
		}
	}
	
	public static void highestSalary(Employees br[])
	{
		double salary=br[0].salary;
		for(int i=0;i<10;i++)
		{
			if(salary>=br[i].salary)
				continue;
			else
				salary=br[i].salary;
		}
		for(int i=0;i<10;i++)
		{
			if(salary==br[i].salary)
		System.out.println("the highest salary is of "+br[i].name+"." +" salary : "+salary);
		}
	}

	public static void main(String jk[])
	 {
		Scanner sc=new Scanner(System.in);
		int empNo;
		String name;
		String department;
		double salary;
		Employees arr[]=new Employees[10];
for(int i=0;i<10;i++)
{
	System.out.println("Enter the empNo");
	empNo=sc.nextInt();
	System.out.println("enter the name");
	name=sc.next();
	System.out.println("enter the department");
	department=sc.next();
	System.out.println("enter the salary");
	salary=sc.nextDouble();
	
	
	arr[i]=new Employees(empNo,name,department,salary);
}
Employees.display(arr);
Employees.highestSalary(arr);
		 
	
	
	
		
	 }
 }
