package prime;
import java.util.Scanner;

/**
 * Simple Java program for checking given number is prime or not
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class PrimeNumber
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int n,m,f=0;
		
		System.out.println("Enter n value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=n/2;
		
		if(n==0||n==1)
		{
			System.out.println("Not a prime");
		}
		
		
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not a prime");
					f=1;
					break;
				}
			}
		
		
		if(f==0)
		{
			System.out.println("a prime");
		}
		}
		
		
		
	}
}	

	



