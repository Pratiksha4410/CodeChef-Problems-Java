// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double y = in.nextDouble();
        if(x+0.5>y)
        {
            System.out.println(y);
        }else if(x%5!=0){
            System.out.println(y);
        }else{
            System.out.println(y-x-0.5);
        }
    }
}

