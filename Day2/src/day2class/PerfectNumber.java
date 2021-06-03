package day2class;

public class PerfectNumber {

	public static void Display(int n)
	{
		int arr[]=new int[n
		                  ];
		int k,b;
		for(int i=3;i<=n;i++)
		{
			k=0;
			b=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					arr[k]=j;
					k++;
				}
			}

			for(int s=0;s<k;s++)
			{
				b=b+arr[s];
			}
			if(b==i)
			{
				System.out.println(i+" is a perfect no.");

			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber.Display(100);
	}
}
