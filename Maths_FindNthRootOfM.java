/*
You are given 2 numbers (N , M); the task is to find N√M (Nth root of M).
Constraints:
1 <= T <= 200
2 <= N <= 20
1 <= M <= 109+5

Example:
Input:
2
2 9
3 9
Output:
3
-1
*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);  
	    int t= sc.nextInt();  
	    for(int i=1;i<=t;i++)
	    {
	        int n= sc.nextInt();
	        int m= sc.nextInt();
	        double temp=Math.pow(m,(double)1/n);
	        double floor=Math.floor(temp);
            double ceil=Math.ceil(temp);
            if(Math.pow(floor,n)==m)
                System.out.println((int)floor);
            else if(Math.pow(ceil,n)==m)
                System.out.println((int)ceil);
            else
                System.out.println("-1");
	    }
	}
}
