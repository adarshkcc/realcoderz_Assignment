package classesAndObject;

public class Rectangle {
double length=1;
double width=1;

public void calculateArea(double length,double width)

{
	double area=length*width;
	System.out.println("the area of rectangle is : "+area);
}
	public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		r.calculateArea(r.getLength(),r.getWidth());
		

	}

}
