/*
Check if array is sorted

Example 1:

Input:
N = 5
Arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
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
	        arr[0] = Integer.parseInt(st[0]);
	        int i=0;
	        for(i=1; i< n; i++)
	        {
	            arr[i] = Integer.parseInt(st[i]);
	            if(arr[i] < arr[i-1])
	                 break;
	        }
	        
	        if(i == n)
	            System.out.println("1");
	        else
	            System.out.println("0");
	    }
	}
}

