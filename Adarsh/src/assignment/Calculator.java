package assignment;

public class Calculator {

	public int calculateSum(int num1,int num2)
	{
		return (num1+num2);
	}
	
	public int calculateDifference(int num1,int num2)
	{
		return(num1-num2);
	}
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println(cal.calculateSum(100, 50));
		System.out.println(cal.calculateDifference(100, 50));
		

	}

}
