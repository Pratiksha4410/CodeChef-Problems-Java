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
		    int n = in.nextInt();
		    int x = in.nextInt();
		    if(n%x==0)
		    {
		        if((n/x)%2==0)
		        {
		           System.out.println("Yes");   
		        }else{
		            System.out.println("No");
		        }
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
