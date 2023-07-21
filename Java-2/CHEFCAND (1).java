/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
   {   
	    Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		
		    int a=(x-y)/4;
		    if(y>=x){
		        System.out.println("0");
		    }
		    else{
		        x=x-y;
		        if(x%4==0){
		            System.out.println(x/4);
		        }else{
		            System.out.println((x/4)+1);
		        }
		    }
		}
	}
}