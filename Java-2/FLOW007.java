import java.lang.*;
import java.util.*;

class CodeChef
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0; 
        while(t-->0)
        {
            int n = in.nextInt();
            while(n!=0)
            {
                int r = n%10;
                sum = sum*10 + r;
                n = n/10;
            }
            System.out.println(sum);
            sum = 0;
        }
        System.out.println();
    }
}