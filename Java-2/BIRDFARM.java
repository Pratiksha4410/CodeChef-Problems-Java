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
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int z = in.nextInt();
		    
		    if(z%x==0 && z%y==0)
		    {
		        System.out.println("Any");
		    }
		    else if(z%x==0)
		    {
		        System.out.println("Chicken");
		    }
		    else if(z%y==0)
		    {
		        System.out.println("Duck");
		    }
		    else{
		        System.out.println("None");
		    }
		}
	}
}
