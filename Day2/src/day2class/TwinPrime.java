package day2class;

public class TwinPrime {

	public void Display(int n)
	{
		int arr[]=new int[n];
		int c=0,d=0;
		for(int i=n;i>=20;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
			{
				d++;
				//System.out.println(i);
				arr[d]=i;

			}
			c=0;
		}
		for(int s=0;s<=d;s++)
		{
			for(int k=s+1;k<=d; k++)
			{
				if(arr[s]-arr[k]==2)
				{
					System.out.println("["+arr[s]+","+arr[k]+"]");  //printing twin prime no. 
					break;
				}
			}
		}

	}
	public static void main(String[] args) {

		TwinPrime p=new TwinPrime();
		p.Display(100);

	}

}
