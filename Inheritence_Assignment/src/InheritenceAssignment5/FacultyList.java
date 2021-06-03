package InheritenceAssignment5;

import java.util.ArrayList;

public class FacultyList {
	ArrayList<Faculty>faculty=new ArrayList<Faculty>();

	void addFaculty(Faculty f)
	{
		faculty.add(f);

	}
	void getDetails(int id)
	{
		for(int i=0;i<faculty.size();i++)
		{
			if(id==faculty.get(i).getId())
			{
				System.out.println("The details of faculty member are : "+"\n name : "+faculty.get(i).getName()+"\n age : "+faculty.get(i).getAge()+"\n course : "+faculty.get(i).getCourse()+"\n salary : "+faculty.get(i).getSalary());
			}
		}
	}
}
