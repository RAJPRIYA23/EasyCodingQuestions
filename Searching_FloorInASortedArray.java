/*
Given a sorted array arr[] of size N without duplicates, and given a value x. Find the floor of x in given array.
Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^7
1 ≤ arr[i] ≤ 10^18
0 ≤ X ≤ arr[n-1]

Example:
Input:
3
7 0
1 2 8 10 11 12 19
7 5
1 2 8 10 11 12 19
7 10
1 2 8 10 11 12 19

Output:
-1
1
3

Explanation:
Testcase 1: No element less than 0 is found. So output is "-1".
Testcase 2: Number less than 5 is 2, whose index is 1(0-based indexing).
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader
		(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine().trim()); 
        
	    while(t-- >0)
	    {
	        String str[] =br.readLine().trim().split(" ");
	        int n = Integer.parseInt(str[0]);
	        long x = Long.parseLong(str[1]);
	        long arr[] = new long[n]; 
	        String st[] = br.readLine().trim().split(" ");
	        for(int i=0 ; i<n ;i++)
	        {
	            arr[i] = Long.parseLong(st[i]);
	        }
	        
	        int left=0, right=n-1;
	        int mid=0;
	        while(left<=right)
	        {
	            if(x < arr[left])
	            {
	                System.out.println(left-1);
	                break;
	            }
	            else if(x > arr[right])
	            {
	                System.out.println(right);
	                break;
	            }
	            else
	            {
	                mid=(left+right)/2;
	                if(arr[mid]==x)
	                {
	                    System.out.println(mid);
	                    break;
	                }
	                else if(arr[mid]>x)
	                {
	                    right=mid-1;
	                }
	                else
	                {
	                    left=mid+1;
	                }
	            }
	        }
	    }
	}
}
