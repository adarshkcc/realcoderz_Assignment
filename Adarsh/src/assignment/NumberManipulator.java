package assignment;

public class NumberManipulator {
	
	public int reverseNumber(int n)
	{
		int r,s=0,p=100;
		while(n>0)
		{
		r=n%10;
		s=s+p*r;    
		n=n/10;
		p=p/10;
	}
		return s;
	}
public int sum(int n)
{
	int sum=0,r;
	while(n>0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
		
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NumberManipulator o=new NumberManipulator();
System.out.println("the reverse of number is "+ o.reverseNumber(678));
System.out.println("the sum of digit of reverse number is "+o.sum(o.reverseNumber(678)));
	}

}
