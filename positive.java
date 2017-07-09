/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class positive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner x=new Scanner(System.in);
		float n=x.nextFloat();
		if(n<0.0)
		System.out.println("it is a negative no");
		else if (n>0.0)
		System.out.println("it is a positive no");
		else if(n==0.0)
		System.out.println("it is zero");
	}
}