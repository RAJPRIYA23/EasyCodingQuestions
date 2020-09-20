/*
Print all pairs (sets) of prime numbers (p,q) such that p*q <= n, where n is given number.
Constraints:
1 ≤ T ≤ 50
4 ≤ N ≤ 400

Example:
Input:
2
4
8
Output:
2 2
2 2 2 3 3 2

Explanation:
Testcase 1: Pair (2, 2) which has both prime numbers as well as satisfying the condition 2*2 <= 4.
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
	        int n=sc.nextInt();
	        int cnt=0;
	        int arr[]=new int[410];
	        for(int k=2;k<=n;k++)
	        {
	            int temp=(int)Math.sqrt(k);
	            if(k%2==0 && k!=2) 
                { 
                    continue;
                } 
                else
                {
                    int j;
                    for(j=3;j<=temp;j+=2) 
                    { 
                        if(k%j==0) 
                        { 
                        break;
                        } 
                    }
                    if(j>temp)
                    {
                        arr[cnt]=k;
                        cnt++;
                    }
                }
	        }
	        for(int a=0;a<cnt;a++)
	        {
	            for(int b=0;b<cnt;b++)
                {
                    if(arr[a]*arr[b]<=n)
                    {
                        System.out.print(arr[a]+" "+arr[b]+" ");
                    }
                    else
                    {
                        break;
                    }
                }
            }
	        System.out.println();  
        }
	}
}
