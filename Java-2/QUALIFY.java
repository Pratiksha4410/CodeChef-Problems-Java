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
		    int a = in.nextInt();
		    int b = in.nextInt();
		    
		    int res = (a*1)+(b*2);
		    
		    if(res>=x)
		    {
		        System.out.println("Qualify");
		    }else{
		        System.out.println("NotQualify");
		    }
		}
	}
}
