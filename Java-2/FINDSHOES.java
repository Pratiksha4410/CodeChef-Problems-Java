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
		    int b = in.nextInt();
		    System.out.println(shoeFind(a,b));
		}
	
	}
		 static int shoeFind(int a,int b)
		{
		    int right = a;
		    if(b>=a)
		    {
		        return right;
		    }
		    else{
		        return (2*a)-b;
		    }
		}
}
