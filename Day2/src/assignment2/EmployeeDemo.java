package assignment2;
import java.util.Scanner;
public class EmployeeDemo {

	public void storeData(Employee e)
	{
		System.out.println("enter empId");
		Scanner sc=new Scanner(System.in);

		int empId=sc.nextInt();
		e.setEmpId(empId);

		System.out.println("enter empName");
		String empName=sc.next();
		e.setEmpName(empName);

		Address a=new Address();

		System.out.println("enter the first address");
		String addr1=sc.next();

		System.out.println("ente the Second address");
		String addr2=sc.next();

		System.out.println("enter the city");
		String city=sc.next();

		System.out.println("enter the pincode");
		int pin=sc.nextInt();
		e.setAddress(a);
		a.setAddr1(addr1);
		a.setAddr2(addr2);
		a.setCity(city);
		a.setPin(pin);
	}
	public void showData(Employee e)
	{
		System.out.println(e.getEmpId()+" "+ e.getEmpName()+" "+e.getAddress().getAddr1()+" "+e.getAddress().getAddr2()+" "+e.getAddress().getCity()+" "+e.getAddress().getPin());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		EmployeeDemo d=new EmployeeDemo();
		d.storeData(e);
		d.showData(e);
	}
}
