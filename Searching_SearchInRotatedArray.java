/*
Given a sorted and rotated array A of N distinct elements which is rotated at some point, and given an element K.
The task is to find the index of the given element K in the array A.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
0 ≤ Ai ≤ 108
1 ≤ K ≤ 108

Example:
Input:
3
9
5 6 7 8 9 10 1 2 3
10
3
3 1 2
1
4
3 5 1 2
6

Output:
5
1
-1

Explanation:
Testcase 1: 10 is found at index 5.
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
	        int ptr=n, res=-1;
	        for(int i=0 ; i<n ;i++)
	        {
	            arr[i] = Integer.parseInt(st[i]);
	            if(i > 0 && arr[i] < arr[i-1] )
	            {
	                ptr=i;
	            }
	        }
	        int k = Integer.parseInt(br.readLine().trim());
	        
	        Search s = new Search();
	        if(k >= arr[0])
	        {
	            res = s.bin_search(arr,0,ptr-1,k);
	        }
	        else
	        {
	            res = s.bin_search(arr,ptr,n-1,k);
	        }
	        
	        if(res == -1)
	            System.out.println("-1");
	        else
	            System.out.println(res);
	    }
	}
}

class Search
{
    int bin_search(int arr[], int left, int right, int key)
    {
        int res = -1;
	    int mid = (left+right)/2;
        
        if(left>right)
            return -1;
        if(arr[mid]==key)
            return mid;
    
        else
        {
            if(key < arr[mid])
                res = bin_search(arr,left,mid-1,key);
            else
                res = bin_search(arr,mid+1,right,key);
        }
        return res;
    }
}
