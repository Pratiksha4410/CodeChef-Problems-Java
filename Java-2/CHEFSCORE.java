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
		    int n = in.nextInt();     //no of problems
		    int x = in.nextInt();     //maximum score for each problems
		    int y = in.nextInt();     //score chef wants
		    
		    if(y%x==0)
		    {
		        int d = (y/x);
		        if(d<=n)
		        {
		            System.out.println("Yes");
		        }
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
