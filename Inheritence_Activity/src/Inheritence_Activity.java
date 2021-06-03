

 class Employee {
long employeeId;
String employeeName;
String employeeAddress;
double salary;
double basicSalary;
double specialAllowance=25.80;
double Hra=100.50;
double transportAllowance;


public Employee(long Id,double basicSalary,String Name,String address)
{
	employeeId=Id;
	employeeName=Name;
	//this.specialAllowance=specialAllowance;
	employeeAddress=address;
	//this.Hra=Hra;
	this.basicSalary=basicSalary;
	
}
public void calculateSalary()
{
	 this.salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
	 System.out.println("Salary : "+salary);
}
public void calculateTransportAllowance()
{
	
	this.transportAllowance=(10*basicSalary/100);
	System.out.println("transport allowance : "+transportAllowance);
	System.out.println("net Salary :"+(salary-transportAllowance));
}
	
}
class Manager extends Employee
{
	
	public Manager(long Id, double basicSalary, String Name,  String address) {
		super(Id, basicSalary, Name, address);
		
	}

	public void calculateTransportAllowance()
	{
		transportAllowance=(15*basicSalary/100);
		System.out.println("transport allowance : "+transportAllowance);
		System.out.println("net Salary :"+(salary-transportAllowance));
	}
	
		
}
class Trainee extends Employee
{
	public Trainee(long Id,double basicSalary,String Name,String address)
	{
		super(Id,basicSalary,Name,address);
	}
}

public class Inheritence_Activity {

	public static void main(String[] args) {
		
Manager m=new Manager(126534,4000,"peter","chennai India");
	m.calculateSalary();
	m.calculateTransportAllowance();
	Trainee t=new Trainee(29846,45000,"jack","Mumbai");
	t.calculateSalary();
	t.calculateTransportAllowance();
	}

}
