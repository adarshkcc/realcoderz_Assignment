package assignment;

class Employee
{
	String empId;
	Employee(String empId)
	{
		this.empId=empId;
		System.out.println("Name :"+this.empId);
	}
}

public class Manager extends Employee
{
int salary;
Manager(String name,int salary)
{
	super(name);
	this.salary=salary;
	System.out.println("salary:"+this.salary);
}
	public static void main(String[] args) {
		Manager manager=new Manager("Adarsh",30000);

	}

}
