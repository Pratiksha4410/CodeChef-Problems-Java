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
		int t, x, n, total, i;
		BufferedReader bi = new BufferedReader(
            new InputStreamReader(System.in));
        t = Integer.parseInt(bi.readLine());
        for(i=0; i<t; i++)
        {
            String[] s = bi.readLine().split(" ");
            n = Integer.parseInt(s[0]);
            x = Integer.parseInt(s[1]);
            
            total = x*3;
            if(n>=total)
                System.out.println(n/total);
            else
                System.out.println("0");
        }
	}
}
