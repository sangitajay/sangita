/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class noofdigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int count=0;
		while(n!=0)
		{ n=n/10;
		++count;
		}
      System.out.println("the no of digitd id "+ count);
	}
}