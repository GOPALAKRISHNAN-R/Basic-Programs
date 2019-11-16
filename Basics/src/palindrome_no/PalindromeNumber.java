package palindrome_no;

import java.util.Scanner;

/**
 * Simple Java program for checking given number is Palindrome or not
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class PalindromeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int a,n,temp,s=0;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			s=(s*10)+a;
			
		}
		
		if(temp==s)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		

	}

}
