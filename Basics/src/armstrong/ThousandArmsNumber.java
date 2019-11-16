package armstrong;

/**
 * Simple Java program for display armstrong numbers between 1 to 1000
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class ThousandArmsNumber {

	public static void main(String[] args) 
	{
		int a,b,c,i;
		for(i=1;i<=1000;i++)
		{
			 b=i;
			 c=0;
			while(b>0)
			{
				a=b%10;
				b=b/10;
				c=c+a*a*a;
			}
			if(i==c)
		   {
				System.out.println(i+"");
		   }
		}

	}

}
