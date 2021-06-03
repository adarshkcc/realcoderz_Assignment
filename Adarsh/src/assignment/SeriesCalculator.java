package assignment;

public class SeriesCalculator {

	public int calculateSum(int n)
	{
		int d=2,a=1,sum;
		sum=((n)*((2*a)+(n-1)*d))/2;
		return sum;	
	}
	public static void main(String[] args) {
		
		SeriesCalculator c=new SeriesCalculator();
	System.out.println(c.calculateSum(3));
	}

}
