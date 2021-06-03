package classesAndObject;

import java.util.Scanner;

public class Employee {
int empNo;
String name;
String department;
double salary;

public  void display(int empNo,String name,String department,double salary)
{
	System.out.println(empNo+" "+name+" "+department+" "+ salary);
}
public static void main(String[] args)
{
	Employee e=new Employee();
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the employee no");
	e.empNo=sc.nextInt();
	
	System.out.println("enter the employee name");
	e.name=sc.next();
	
	System.out.println("enter the department");
	e.department=sc.next();
	
	System.out.println("enter the Salary");
	e.salary=sc.nextDouble();
	
	e.display(e.empNo, e.name, e.department, e.salary);
}
}
