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
		    int p = in.nextInt();
		    int q = in.nextInt();
		    int r = in.nextInt();
		    int s = in.nextInt();
		    
		    int max1 = Math.max(p,q);
		    int max2 = Math.max(r,s);
		    
		    if(max1==max2)
		    {
		        System.out.println("TIE");
		    }
		    else if(max1<max2)
		    {
		        System.out.println("P");
		    }
		    else if(max1>max2)
		    {
		        System.out.println("Q");
		    }
		}
	}
}
