/*
Write a program to calculate nPr. nPr represents n permutation r and value of nPr is (n!) / (n-r)!.

Constraints:
1 <= T <= 100
1 <= n,r <= 20
n >= r

Example:
Input:
2
2 1
10 4
Output:
2
5040
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


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
            int r= sc.nextInt(); 
            long fact=1;
            for(int j=n;j>n-r;j--)
            {
                fact=fact*j;
            }
            System.out.println(fact);
        }
	}
}
