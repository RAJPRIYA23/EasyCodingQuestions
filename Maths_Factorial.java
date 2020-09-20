/*
Given a positive integer, N. Find the factorial of N.
 
Example :
Input:
N = 5
Output:
120
Explanation:
5*4*3*2*1 = 120
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------


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
            long fac=1;
            for(int j=1;j<=n;j++)
            {
                fac=fac*j;
            }
            System.out.println(fac);
        }
	}
}
