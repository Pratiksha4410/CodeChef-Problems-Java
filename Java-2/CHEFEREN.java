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
		    int a = in.nextInt();
		    int x = in.nextInt();
		    int y = in.nextInt();
		    if(a%2==0)
		    {
		        int res = a/2;
		        System.out.println((res*x)+(res*y));
		    }else{
		        int res = a/2;
		        System.out.println((res*x)+((res+1)*y));
		    }
		}
	}
}
