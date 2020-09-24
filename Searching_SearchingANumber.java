/*
Given an array Arr of N elements and a integer K. Your task is to return the position of first occurence of K in the given array.
Note: Position of first element is considered as 1.

Example:

Input:
N = 5, K = 16
Arr[] = {9, 7, 2, 16, 4}
Output: 4
Explanation: K = 16 is found in the
given array at position 4.
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
	        int k = Integer.parseInt(str[1]);
	        int arr[] = new int[1000000]; 
	        String st[] = br.readLine().trim().split(" ");
	        int i = 0;
	        for(i = 0 ; i < n; i++)
	        {
	            arr[i] = Integer.parseInt(st[i]); 
	            if(arr[i] == k)
	            {
	                System.out.println(i+1);
	                break;
	            }
	        }
	        if(i == n)
	            System.out.println("-1");
	    }
	}
}
