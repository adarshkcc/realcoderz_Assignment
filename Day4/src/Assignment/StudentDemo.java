package Assignment;

import java.util.Scanner;

public class StudentDemo {
	
	public static Student[] splitStudentArray(Student s[],char ch)
	{
		Student d[]=new Student[5];int j=0;
		if(ch=='o')
		{
		for(int i=0;i<5;i++)
		{
			if(s[i].marks%2!=0)
			{
				d[j]=s[i];
				j++;
				
			}
				
		}

		}
		else if(ch=='e')
		{
			for(int i=0;i<5;i++)
			{
				if(s[i].marks%2==0)
				{
					d[j]=s[i];
					j++;
					
				}
			}
		
		}
		return d;
	}
	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
Student s[]=new Student[5];
int rollNo;String name;double marks;char c;
for(int i=0;i<5;i++)
{
	System.out.println("enter the rollNo of Student");
	rollNo=sc.nextInt();
	System.out.println("enter the name of Student");
	name=sc.next();
	System.out.println("enter the marks of "+name);
	marks=sc.nextDouble();
	s[i]=new Student(rollNo,name,marks);
}
System.out.println("enter the character to get the details of Student");
c=sc.next().charAt(0);

Student a[];
a=StudentDemo.splitStudentArray(s, c);// returned array are stored in another array
for(int i=0;i<a.length;i++)
{
	if(a[i]!=null)
	System.out.println("name : "+a[i].getName()+" marks="+a[i].marks);
	else 
		break;
}

	}

}
