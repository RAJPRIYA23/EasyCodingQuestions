/*
Given an array A[] of N numbers and another number x, determine whether or not there exist three elements in A[] whose sum is exactly x.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 103
1 ≤ A[i] ≤ 105

Example:
Input:
2
6 13
1 4 45 6 10 8
5 10
1 2 4 3 6

Output:
1
1

Explanation:
Testcase 1: There is one triplet with sum 13 in the array. Triplet elements are 1, 4, 8, whose sum is 13.
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
	        String st1[] = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(st1[0]);
	        int x = Integer.parseInt(st1[1]);
	        
	        int arr[] = new int[n];
	        String st2[] = br.readLine().trim().split(" ");
	        
	        for(int i=0; i< n; i++)
	            arr[i] = Integer.parseInt(st2[i]);

            Arrays.sort(arr);
            Boolean tf = false;
            for(int i=0; i < n-2; i++)
            {
                if(arr[i] > x)
                    break;
                for(int j=i+1; j < n-1; j++)
                {
                    if(arr[i]+arr[j] > x)
                        break;
                    for(int k=j+1; k < n; k++)
                    {
                        if(arr[i]+arr[j]+arr[k] == x)
                        {
                            tf = true;
                            break;
                        }
                        else if(arr[i]+arr[j]+arr[k] > x)
                            break;
                    }
                }
            }
            
            if(tf)
                System.out.println("1");
            else
                System.out.println("0");
	    }
	}
}
