package InheritenceAssignment5;

import java.util.Scanner;

public class FacultyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//permanent Faculty
		Faculty f1=new PermanentFaculty("Adarsh",22,1,"computer science",40000,500,200);
		Faculty f2=new PermanentFaculty("Rohit",22,2,"computer science",30000,500,200);
		Faculty f3=new PermanentFaculty("Ashutosh",22,3,"history",20000,500,200);
		Faculty f4=new PermanentFaculty("tauseef",22,4,"biology",43000,500,200);
		Faculty f5=new PermanentFaculty("saurav",24,5,"chemistry",49000,500,200);

		//temporaryFaculty
		Faculty f6=new TemporaryFaculty("Rishab",22,6,"computer science",40000,5);
		Faculty f7=new TemporaryFaculty("Mihir",24,7,"computer science",30000,2);
		Faculty f8=new TemporaryFaculty("Ashutosh",8,3,"history",20000,3);
		Faculty f9=new TemporaryFaculty("tauseef",9,4,"biology",43000,3);
		Faculty f10=new TemporaryFaculty("virat",10,5,"chemistry",49000,1);

		// adding faculty member to the list	
		FacultyList f=new FacultyList();
		f.addFaculty(f1);
		f.addFaculty(f2);
		f.addFaculty(f3);
		f.addFaculty(f4);
		f.addFaculty(f5);
		f.addFaculty(f6);
		f.addFaculty(f7);
		f.addFaculty(f8);
		f.addFaculty(f9);
		f.addFaculty(f10);

		Faculty.getFacultyCount();
		System.out.println("The number of Permanent Faculty member are : "+Faculty.countPermanent);
		System.out.println("The number of Temporary Faculty member are : "+Faculty.countTemporary);

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to get the details of faculty member");
		int id =sc.nextInt();
		f.getDetails(id);


	}

}
