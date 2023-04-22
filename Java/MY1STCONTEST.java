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
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		
		int res = N-A;
		System.out.print(res+" ");
		res = res - B;
		System.out.println(res);
		
	}
}
