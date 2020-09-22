/*
Given a MxN matrix, count the number of squares in the matrix.

Constraints:
1 <= T <= 102
1 <= M,N <= 104

Example:
Input:

2
2 2
4 3

Output:
5
20
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            long sum=0;
            while(m>0 && n>0)
            {
                sum= sum + m*n;
                m--;
                n--;
            }
            System.out.println(sum);
        }
	}
}
