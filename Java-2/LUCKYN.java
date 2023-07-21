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
		    boolean check = false;
		    while(x>0){
	            int digit=x%10;
	            x=x/10;
	            if(digit==7){
	               check=true;
	             }
	        }
	    if(check)
	    System.out.println("Yes");
	    else
	    System.out.println("No");
		}
	}
}
