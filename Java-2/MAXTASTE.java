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
		int max1 = 0,max2=0;
		while(t-->0)
		{
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    int d = in.nextInt();
		    
		    if(a>b)
		    {
		        max1 = a;
		    }
		    else{
		        max1 = b;
		    }
		    if(c>d)
		    {
		        max2 = c;
		    }else{
		        max2 = d;
		    }
		    System.out.println(max1+max2);
		}
	}
}
