/*
Given an integer array of which both first half and second half are sorted. The task is to merge two sorted halves of the array into a single sorted array.

Constraints:
1<=T<=100
1<=n<=103
-103<=a[i]<=103

Example:
Input:
2
6
2 3 8 -1 7 10
5
-4 6 9 -1 3
Output:
-1 2 3 7 8 10 
-4 -1 3 6 9 
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args)throws Exception
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
	        int index = 0;
	        for(int i=1; i<n; i++)
	            arr[i] = Integer.parseInt(st[i]);
	       
	        int half = (int) Math.ceil(n/2);
	        
	        int left[] = new int[half];
            int right[] = new int[n-half];
        
            for (int i = 0; i < half; i++)
                left[i] = arr[i];
            for (int i = half; i < n ; i++)
                right[i-half] = arr[i];
                
	        int i = 0, j = 0;
        
            int k = 0;
            while (i < half && j < n-half)
            {
                if (left[i] <= right[j])
                {
                    arr[k] = left[i];
                    i++;
                }
                else
                {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            
            while(i < half)
            {
                arr[k] = left[i];
                i++;
                k++;
            }
        
            while(j < n-half)
            {
                arr[k] = right[j];
                j++;
                k++;
            }
            
            StringBuffer sb = new StringBuffer();
            for(i=0; i<n ; i++)
                sb.append(arr[i]+" ");
                
            System.out.println(sb);
	    }
	}
}
