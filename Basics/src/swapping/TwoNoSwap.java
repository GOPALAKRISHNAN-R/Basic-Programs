package swapping;

import java.util.Scanner;

/**
 * Simple Java program for swapping concept
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class TwoNoSwap 
{	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter a value:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter b value:");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swapping:");
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}
