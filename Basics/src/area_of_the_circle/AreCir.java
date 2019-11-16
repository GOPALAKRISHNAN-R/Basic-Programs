package area_of_the_circle;

import java.util.Scanner;

/**
 * Simple Java program for finding area and perimeter of a circle
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class AreCir 
{
	
	public double area(double r)
	{
		r=Math.PI*r*r;
		return r;
	}
	public double peri(double r)
	{
		r=2*Math.PI*r;
		return r;
	}
	public static void main(String[] args)
	{
	 AreCir a=new AreCir();
	 double r;
	 System.out.println("Enter the Radious value for a circle:");
	 Scanner sc=new Scanner(System.in);
	 r=sc.nextDouble();
	 System.out.println("     Area of the Circle is\t"+a.area(r));
	  System.out.println("Perimeter of the circle is\t"+a.peri(r));
	 sc.close();
	}

}
