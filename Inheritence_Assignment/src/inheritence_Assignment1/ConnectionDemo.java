package inheritence_Assignment1;


import java.util.Scanner;

public class ConnectionDemo {

	public static void main(String[] args) throws ConnectionLockedException {
		// TODO Auto-generated method stub
		Inventory i=new Inventory();
		
		Connection con1=new Prepaid(1,11,300);
		Connection con2=new Prepaid(2,21,600);
		Connection con3=new Prepaid(3,31,500);
		
		i.addConnection(con1);
		i.addConnection(con2);
		i.addConnection(con3);
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the Connection Id");
		int id=sc.nextInt();
		System.out.println("enter the amount to be recharge");
		double recharge=sc.nextDouble();
		System.out.println("new balance after depositing Amount "+i.recharge(id,recharge));
		
		System.out.println("enter the Connection Id");
		int id1=sc.nextInt();
		System.out.println("enter the amount to be deducted");
		double deduct=sc.nextDouble();
		System.out.println("new balance after deducting Amount "+i.deduct(id1,deduct));
		
		System.out.println("Customer id in Bank :");
		System.out.println(i.getUniqueCustomerIds());
		
		System.out.println("Customer details in bank");
		System.out.println(i.getAccountHashMap());
		
		Connection con4=new Prepaid(2,55,700);
		i.addConnection(con4);
		
	

	

	}

}
