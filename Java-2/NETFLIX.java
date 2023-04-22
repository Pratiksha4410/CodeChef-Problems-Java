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
		int T = in.nextInt();
		while(T-->0)
		{
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int z = in.nextInt();
		    int c = in.nextInt();
		    int p = x+y;
		    int q = x+z;
		    int t = z+y;
		    if((p>=c)||(q>=c)||(t>=c))
		    {
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
