package Inheritence_Assignment4;

public interface Shape {

	double getArea(int area);
	
}
 class Circle implements Shape
{
	public double getArea(int radius)
	{
		double area=3.14*radius*radius;
		return area;
	}
}
