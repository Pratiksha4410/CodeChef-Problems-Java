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
		String res = " ";
		int[]a = new int[3];
		for(int i=0;i<3;i++)
		{
		    a[i] = in.nextInt();
		    res = res + a[i];
		}
		int x = in.nextInt();
		boolean unique = false;
		for(int i=0;i<3;i++)
		{
		    if(x==a[i])
		    {
		        unique = true;
		        break;
		    }
		}
		System.out.println(!unique?"no":"yes");
		
		
		
	}
}
