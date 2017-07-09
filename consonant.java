/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class consonant
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner x=new Scanner(System.in);
		char n=x.next().charAt(0);
		switch (n)
		{ case 'a':System.out.println("it is a vowel");
		break;
		 case 'e': System.out.println("it is a vowel");
		 break;
		 case 'i': System.out.println("it is a vowel");
		 break;
		 case 'o': System.out.println("is is a vowel");
		 break;
		 case 'u': System.out.println("it is a vowel");
		 break;
		 case 'A': System.out.println("it is a vowel");
		 break;
		 case 'E': System.out.println("it is a vowel");
		 break;
		 case 'I': System.out.println("it is a vowel");
		 break;
		 case 'O': System.out.println("it is a vowel");
		 break;
		 case 'U': System.out.println("it is a vowel");
		 break;
		 default:  System.out.println("it is a consonant");
		}
		 
	}
}