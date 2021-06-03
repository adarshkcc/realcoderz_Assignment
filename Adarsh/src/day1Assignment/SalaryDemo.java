package day1Assignment;

import java.util.Scanner;

public class SalaryDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Salary");
		double basicSalary=sc.nextDouble();
		System.out.println("enter the HRA% of salary");
		double HRA=sc.nextDouble();
		System.out.println("enter the DA% of salary");
		double DA=sc.nextDouble();
		System.out.println("enter the amount of insurance premium");
		double InsurancePremium=sc.nextDouble();
		System.out.println("enter the PF% of salary");
		double PF=sc.nextDouble();
		System.out.println("Hand Salary = "+calculateGrossSalary(basicSalary,HRA,DA,InsurancePremium,PF));
	}
		
		public static double calculateGrossSalary(double basic,double hra,double da,double premium,double pf)
		{
			double salary;
			salary=basic+(basic*hra/100)+(basic*da/100)-premium-(basic*pf/100);
			return salary;
		}
		

	

}
