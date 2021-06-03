package assignment;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
for(int i=2;i<=150;i++)
{
	for(int j=1;j<=i;j++)
	{
		if(i%j==0)
			c++;
	}
	if(c==2)
		System.out.print(" "+i);
	c=0;
}
	}

}
