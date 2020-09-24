/*
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the
given array.
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
	        float x = Float.parseFloat(str[1]);
	        float arr[] = new float[n]; 
	        String st[] = br.readLine().trim().split(" ");
	        for(int i=0 ; i<n ;i++)
	            arr[i] = Float.parseFloat(st[i]);
	       
	        float left_x = x - 0.5f;  
	        float right_x = x + 0.5f;
	        int lptr=0;
	        int rptr=0;
	        
	        //right boundary
	        int left=0, right=n-1;
	        int mid=0;
	        while(left<=right)
	        {
	            if(right_x < arr[left])
	            {
	                rptr = left-1;
	                break;
	            }
	            else if(right_x > arr[right])
	            {
	                rptr = right;
	                break;
	            }
	            else
	            {
	                mid=(left+right)/2;
	                if(arr[mid] == right_x)
	                {
	                    rptr = mid;
	                    break;
	                }
	                else if(arr[mid]> right_x)
	                {
	                    right=mid-1;
	                }
	                else
	                {
	                    left=mid+1;
	                }
	            }
	        }
	        
	        //left boundary
	        left=0;
	        right=n-1;
	        mid=0;
	        while(left<=right)
	        {
	            if(left_x < arr[left])
	            {
	                lptr = left;
	                break;
	            }
	            else if(left_x > arr[right])
	            {
	                lptr = right+1;
	                break;
	            }
	            else
	            {
	                mid=(left+right)/2;
	                if(arr[mid] == left_x)
	                {
	                    lptr = mid;
	                    break;
	                }
	                else if(arr[mid]> left_x)
	                {
	                    right=mid-1;
	                }
	                else
	                {
	                    left=mid+1;
	                }
	            }
	        }
	        
	        if(rptr>=lptr)
	            System.out.println(rptr-lptr+1);
	        else
	            System.out.println("-1");
	    }
	}
}
