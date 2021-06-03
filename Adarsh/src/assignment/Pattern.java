package assignment;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[6];
		int j=0;
		for(int i=1;i<=6;i++)
		{
		arr[j]=i;
		for(int k=0;k<=j;k++)
		{
			System.out.print(arr[k]+" ");	
		}
		System.out.println();
		j++;
		}
		int c=5;
		j=0;
		for(int i=1;i<=5;i++)
		{
			arr[j]=i;
			j++;
		}
		for(int s=5;s>=1;s--)
		{
			for(int k=0;k<c;k++)
			{
				System.out.print(arr[k]+" ");
			}
			c--;
			System.out.println();
		}
			
			
		
	}
	
	}


