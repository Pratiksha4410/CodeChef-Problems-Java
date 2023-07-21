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
		    int[]n = new int[4];
		    int res1=0,res2=0;
		    for(int i=0;i<n.length;i++)
		    {
		        n[i] = in.nextInt();
		        res1 = Math.abs(n[0]-n[2]);
		        res2 = Math.abs(n[1]-n[3]);
		    }
		    System.out.println(Math.max(res1,res2));
		}
	}
}
