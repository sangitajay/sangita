/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class natural
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int i;
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int m=x.nextInt();

		int sum=0;
		for(i=m;i<=n;i++)
		 sum += i;
		
		System.out.println("the sum of" +n+ "  natural no is=" + sum);
	}
}