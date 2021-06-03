package InheritenceAssignment5;

public abstract class Faculty 
{
	String name;
	int age;
	int id;
	String course;
	double salary;
	int duration;
	double bonus;
	double hra;
	static int countTemporary=0;
	static int countPermanent=0;

	abstract void search();

	Faculty(String name,int age,int id,String course,double salary,int duration)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.course=course;
		this.salary=salary;
		this.duration=duration;
		countTemporary++;
	}
	Faculty(String name,int age,int id,String course,double salary,double bonus,double hra)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.course=course;
		this.salary=salary;
		this.bonus=bonus;
		this.hra=hra;
		countPermanent++;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getCourse() {
		return course;
	}

	public double getSalary() {
		return salary;
	}

	public int getDuration() {
		return duration;
	}

	public double getBonus() {
		return bonus;
	}

	public double getHra() {
		return hra;
	}

	static void getFacultyCount()
	{
		System.out.println("Total number of Faculty in college are : "+(countPermanent+countTemporary));
	}

}
class PermanentFaculty extends Faculty
{
	PermanentFaculty(String name,int age,int id,String course,double salary,double bonus,double hra)
	{
		super(name,age,id,course,salary,bonus,hra);
	}
	 void search()
	{
       System.out.println("Total number of permanent Faculty is : "+countPermanent);
	}
}
class TemporaryFaculty extends Faculty
{
	TemporaryFaculty(String name,int age,int id,String course,double salary,int duration)
	{
		super(name,age,id,course,salary,duration);
	}
	void search()
	{
		System.out.println("Total number of Temporary Faculty is : "+countTemporary);
	}
}
