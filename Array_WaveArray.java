/*
Given a sorted array arr[] of non-repeating integers without duplicates. Sort the array into a wave-like array and return it.
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
0 ≤ A[i] ≤107

Example:
Input:
1
5
1 2 3 4 5
Output:
2 1 4 3 5

Explanation:
Testcase 1: Array elements after sorting it in wave form are 2 1 4 3 5.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine());
        while(t-- >0)
	    {
	        int n = Integer.parseInt(br.readLine());
	        int arr[]=new int[n];
	        int limit=0,temp=0;
	        
	        if(n%2==0)
	            limit= n-2; 
	        else
	            limit= n-3;
	            
	        StringTokenizer tk = new StringTokenizer(br.readLine());
	        for(int j=0;j<n;j++)
	        {
	            arr[j]=Integer.parseInt(tk.nextToken());
	        }
	        
	        
	        for(int j=0;j<=limit;j=j+2)
	        {
	            temp=arr[j];
	            arr[j]=arr[j+1];
	            arr[j+1]=temp;
	        }
	        
	        for(int j=0;j<n;j++)
	        {
	            System.out.print(arr[j]+" ");
	        }
	        System.out.println();
	    }
	}
}
