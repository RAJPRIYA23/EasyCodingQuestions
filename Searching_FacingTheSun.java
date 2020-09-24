/*
Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).

Example:

Input: 
N = 5
H[] = {7, 4, 8, 2, 9}
Output: 3
Explanation: As 7 is the first element, it
can see the sunrise. 4 can't see the
sunrise as 7 is hiding it.  8 can see.
2 can't see the sunrise. 9 also can see
the sunrise.
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
	        String str[] = br.readLine().trim().split(" ");
	        int arr[] = new int[1000000];
	        int count=1;
	        arr[0] = Integer.parseInt(str[0]);
	        int max =arr[0];
	        for(int i = 1; i < n; i++)
	        {
	            arr[i] = Integer.parseInt(str[i]);
	            if(arr[i]>max)
	            {
	                count++;
	                max=arr[i];
	            }
	        }
	        System.out.println(count);
	    }
	}
}
