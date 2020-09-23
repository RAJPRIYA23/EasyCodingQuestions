/*
You are given an array A of size N. You need to find all pairs in the array that sum to a number K. If no such pair exists then output will be -1. 
The elements of the array are distinct and are in sorted order.
Note: (a,b) and (b,a) are considered same. Also, an element cannot pair with itself, i.e., (a,a) is invalid.

Constraints:
1 <= T <= 100
0 <= Ai <=107
2 <= N <= 107
0 <= K <= 107

Examples:
Input:
2
7
1 2 3 4 5 6 7
98
7
1 2 3 4 5 6 7
8
Output:
-1
1 7 8
2 6 8
3 5 8

Explanation:
Testcase1: We cannot find any pair that sums to 98
Testcase2: We find 3 such pairs that sum to 8 (1,7) (2,6) (3,5)
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
        
	    while(t-- >0)
	    {
	        int n = Integer.parseInt(br.readLine());
	        int arr[] = new int[n];
	        Boolean exist = false;
	        
	        StringTokenizer tk = new StringTokenizer(br.readLine());
	        for(int i = 0; i < n ; i++)
	        {
	            arr[i] = Integer.parseInt(tk.nextToken());
	        }
	        int k = Integer.parseInt(br.readLine());
	        
	        int l=0, r=n-1;
	        while(l<r)
	        {
	            if(arr[l]+arr[r]==k)
                {
                    System.out.println(arr[l]+" "+arr[r]+" "+k);
	                l++;
	                r--;
	                exist=true;
                }
                else if(arr[l]+arr[r] < k)
                    l++;
                else
                    r--;
	        }
	        if(exist==false)
	            System.out.println("-1");
	    }
	}
}
