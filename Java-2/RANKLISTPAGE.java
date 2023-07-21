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
		    float X=in.nextInt();
		    int x=(int)X;
		    
		    float ans=Math.abs(X/25);
		    int ans1=x/25;
		    
		    if(ans>ans1){
		        System.out.println(ans1+1);
		    }
		    else{
		        System.out.println(ans1);
		    }
		}
	}
}
