package swapping;

import java.util.Scanner;

/**
 * Simple Java program for swapping concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class SwapTwoNo 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a,b,t;
		System.out.println("Enter a value:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		System.out.println("Before Swapping a="+a+"b="+b);
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("After Swapping a="+a+"b="+b);
	}

}
