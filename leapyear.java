/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class leapyear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();

		if(n % 4 ==0)
        {     if(n % 100==0)
              {        if(n % 400==0)
                       System.out.println("it is a leap year");
                       else System.out.println("it is not a leap year");
              }
               else  System.out.println("it is a leap year");
               
         
        }
         else System.out.println("it is noy a leap year");
       
	}
}