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
		int A = in.nextInt();
		int B = in.nextInt();
		int first = (A / 10 ) * 100;
		int second = (B / 20 ) * 100;
		
		if (first>second){
		    System.out.println("FIRST");
		}
		
		
		else if (first==second){
		    System.out.println("ANY");
		}
		
		
        else{
		    System.out.println("SECOND");
		}
		
		}
	}
}
