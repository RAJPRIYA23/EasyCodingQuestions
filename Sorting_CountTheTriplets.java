/*
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 
Example 1:
Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets: 
1 + 2 = 3 and 3 + 2 = 5

Example 2:
Input: 
N = 3
arr[] = {2, 3, 4}
Output: 0
Explanation: No such triplet exits

Constraints:
1 ≤ N ≤ 103
1 ≤ arr[i] ≤ 105
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
	        int count=0;
	        String st[] = br.readLine().trim().split(" ");
	        
	        for(int i=0; i<n; i++)
	            arr[i] = Integer.parseInt(st[i]);
	       
	        Arrays.sort(arr);
	        for(int i=0; i < n-2; i++)
            {
                for(int j=i+1; j < n-1; j++)
                {
                    for(int k=j+1; k < n; k++)
                    {
                        if(arr[i]+arr[j] == arr[k])
                        {
                            count++;
                            break;
                        }
                    }
                }
            }
            if(count == 0)
                System.out.println("-1");
            else
                System.out.println(count);
	    }
	}
}
