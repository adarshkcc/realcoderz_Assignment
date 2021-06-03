package assignment;

public class PrimeChecker {

	public boolean checkPrime(int n)
	{
		int c=0;
		for(int j=1;j<=n;j++)
		{
			if(n%j==0)
				c++;
		}
		if(c==2)
			return true;
		else return false;
		
	}
	public static void main(String[] args) 
	{
		PrimeChecker p=new PrimeChecker();
		System.out.println(p.checkPrime(20));

	}

}
