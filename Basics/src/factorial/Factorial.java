package factorial;

import java.util.Scanner;

/**
 * Simple Java program for finding Factorial for given number
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int n,fact=1;
		System.out.println("Enter the value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
		

	}

}
