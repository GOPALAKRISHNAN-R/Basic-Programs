package armstrong;

import java.util.Scanner;

/**
 * Simple Java program for checking given number is armstrong or not.
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class ArmStrong {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int n,a,b,c=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		b=n;
		
		while(b>0)
		{
			a=b%10;
			b=b/10;
			c=c+a*a*a;
		}
		
		if(n==c)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
		

	}

}
