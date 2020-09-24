/*
Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

Example 1:

Input:
N = 6
Arr[] = {2, 4, 8, 10, 12, 14}
Output: 6
Explanation: Actual AP should be 
2, 4, 6, 8, 10, 12, 14.

Constraints:
2 <= N <= 105
0 <= |Arr[i]| <= 107
There will always be only one missing element.
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
	        int n = Integer.parseInt(br.readLine().trim());
	        int arr[] = new int[n]; 
	        String st[] = br.readLine().trim().split(" ");
	        long sum=0,totalsum=0;
	        for(int i=0 ; i<n ;i++)
	        {
	            arr[i] = Integer.parseInt(st[i]);
	            sum=sum+arr[i];
	        }
	        totalsum=((n+1)*(arr[0]+arr[n-1]))/2;
	        System.out.println(totalsum-sum);
	    }
	}
}
