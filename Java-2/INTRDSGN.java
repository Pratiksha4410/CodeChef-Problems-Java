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
		    int x1 = in.nextInt();
		    int y1 = in.nextInt();
		    int x2 = in.nextInt();
		    int y2 = in.nextInt();
		    
		    if((x1+y1)<(x2+y2))
		    {
		        System.out.println(x1+y1);
		    }else{
		        System.out.println(x2+y2);
		    }
		}
	}
}
