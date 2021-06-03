package Inheritence_Assignment4;

public interface Shape2 {

	double getArea(int length,int width);
}
class Rectangle implements Shape2
{
public	double getArea(int length,int width)
	{
		double area=length*width;
		return area;
	}
}
