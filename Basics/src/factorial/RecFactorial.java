package factorial;

import java.util.Scanner;

/**
 * Simple Java program for Recursive Method to find Factorial
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class RecFactorial 
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter the value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The Factorial of "+n+" is "+fact(n));
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}

}
