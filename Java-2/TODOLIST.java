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
		    int[]a = new int[n];
		    int c = 0;
		    for(int i=0;i<n;i++)
		    {
		        a[i] = in.nextInt();
		        if(a[i]>=1000)
		        {
		            c++;
		        }
		        
		    }
		    System.out.println(c);
		}
	}
}
