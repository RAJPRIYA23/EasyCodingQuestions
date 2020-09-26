/*
Given an integer array Arr of size N. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller.
If next element is smaller, update the current index to that element. If not, then  -1.

Example:
Input:
N = 5
Arr[] = {4, 2, 1, 5, 3}
Output:
2 1 -1 3 -1
Explanation: Array elements are 4, 2, 1, 5
3. Next to 4 is 2 which is smaller, so we
print 2. Next of 2 is 1 which is smaller,
so we print 1. Next of 1 is 5 which is
greater, so we print -1. Next of 5 is 3
which is smaller, so we print 3.  Note
that for last element, output is always 
going to be -1 because there is no element
on right.
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
		    
        int t = Integer.parseInt(br.readLine()); 
        
	    while(t-- > 0)
	    {
	        StringBuffer sb = new StringBuffer();
	        
	        int n = Integer.parseInt(br.readLine());
	        int arr[] = new int[n];
            
	        String str[] = br.readLine().trim().split(" ");
	        
	        for(int i = 0 ;  i < n ; i++)
	        {
	            arr[i] = Integer.parseInt(str[i]);
	        }  
	            
	       for(int i = 0 ;  i < n-1 ; i++)
	       {
	           if(arr[i+1] < arr[i])
	               sb.append(arr[i+1]+" ");
	           else
	               sb.append(-1+" ");
	       }
	       sb.append(-1 +" ");
	       
	       System.out.println(sb);
	    }
	}
}
