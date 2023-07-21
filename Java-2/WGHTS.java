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
		    int w = in.nextInt();
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int z = in.nextInt();
		    
		    int a = x+y;
		    int b = x+z;
		    int c = y+z;
		    int d = x+y+z;
		    
		    if(w==x||w==y||w==z||w==a||w==b||w==c||w==d)
		    {
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}
	}
}
