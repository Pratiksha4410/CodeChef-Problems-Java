/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int T = in.nextInt();
	    while(T-->0)
	    {
	        int x = in.nextInt();
	        if(x<7)
	        System.out.println("YES");
	        else
	        System.out.println("NO");
	    }
	}
}
