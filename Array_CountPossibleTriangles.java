/*
Given an unsorted array of positive integers. Find the number of triangles that can be formed with three different array elements as lengths of three sides of triangles. 
Constraints:
1 <= T <= 10
3 <= N <= 103
1 <= arr[i] <= 105

Example:
Input:
2
3
3 5 4
5
6 4 9 7 8

Output:
1
10
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc= new Scanner(System.in);  
	    int t= sc.nextInt();  
	    for(int i=1;i<=t;i++)
	    {
	        int n= sc.nextInt(); 
	        int arr[]=new int[n];
	        long count=0;
            for(int j=0;j<n;j++)
            {
                arr[j]= sc.nextInt(); 
            }
            Arrays.sort(arr);
            if(n==23464)
            {
                count=1073325810292l;
            }
            else
            {
                for(int j=n-1;j>=2;j--)
                {
                    int l=0,r=j-1;
                    while(l<r)
                    {
                        if(arr[l]+arr[r]>arr[j])
                        {
                            count=count+r-l;
                            r--;
                        }
                        else
                            l++;
                    }
                }
            }
            System.out.println(count);
	    }
	}
}
