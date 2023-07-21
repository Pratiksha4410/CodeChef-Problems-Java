/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0)
		{
		    int n = in.nextInt();
		    if(n>=1 && n<=10)
		    {
		        System.out.println("Lower Double");
		    }
		    else if(n>=11 && n<=15)
		    {
		        System.out.println("Lower Single");
		    }
		    else if(n>=16 && n<=25)
		    {
		        System.out.println("Upper Double");
		    }
		    else if(n>=26 && n<=30)
		    {
		        System.out.println("Upper Single");
		    }
		}
	}
}
