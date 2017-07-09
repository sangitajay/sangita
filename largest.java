/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner x=new Scanner(System.in);
		float n=x.nextFloat();
		Scanner y=new Scanner(System.in);
		float m=x.nextFloat();
       Scanner z=new Scanner(System.in);
		float p=x.nextFloat();
	
		if(n>m && n>p)
		
	System.out.println("it is the greatest no" + n);
		else if(m>n && m>p)
		System.out.print("it is the largest no"+ m);
		else if(p>n && p>m)
System.out.println("is is the largest no" + p);

	}
}