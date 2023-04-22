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
		   int y = in.nextInt();
		   if((2*x)>(5*y))
		   {
		       System.out.println("Chocolate");
		   }
		   else if((2*x)<(5*y))
		   {
		       System.out.println("Candy");
		   }
		   else{
		       System.out.println("Either");
		   }
		}
	}
}
