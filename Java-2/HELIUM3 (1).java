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
		int t = in.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    int d = in.nextInt();
		    
		    if((c*d)>=(a*b))
		    {
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
