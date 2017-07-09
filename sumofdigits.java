
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sumofdigits{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
	    int d;
		int sum=0;

		while(n!=0)
		{  d=n%10;
		   sum=sum+d;
			n=n/10;
		
		}
	  
	    
		 System.out.println("the sum is"+sum);

	}
}