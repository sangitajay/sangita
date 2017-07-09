/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alphanum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner x =new Scanner(System.in);
		char n=x.next().charAt(0);
		
		System.out.println( Character.isLetter(n));
		
	}
}