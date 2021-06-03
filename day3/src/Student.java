import java.util.Scanner;

public class Student {

	String name;
	int marks[][]=new int[3][5];
	float total[]=new float[3];
	float average[]=new float[3];

	void accept()
	{
		System.out.println("Enter Student Nmae");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();

		for(int i=0;i<marks.length;i++)
		{
			System.out.println("semester"+(i+1));
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.println("enter the marks "+(j+1));
				marks[i][j]=sc.nextInt();
			}

		}
	}
	void display()
	{
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("marks for Sem"+(i+1));
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.println(marks[i][j]);
			}

		}
	}
	void Total()
	{
		int s=0;
		int k=0;

		for(int i=0;i<marks.length;i++)
		{

			for(int j=0;j<marks[i].length;j++) 
			{
				s=s+marks[i][j];
			}
			total[k]=s;
			k++;
			s=0;
		}
		for(k=0;k<total.length;k++)
		{
			System.out.println("total marks for sem "+(k+1)+" is"+total[k]);
			average[k]=(total[k]/5);
			System.out.println("average marks for sem "+(k+1)+" per subject is"+average[k]);
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.accept();
		s.display();
		s.Total();

	}

}
