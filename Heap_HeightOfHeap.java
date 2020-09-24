/*
Given a Binary Heap of size N, write a program to calculate the height of the Heap.

Constraints:
1<=T<=100
1<=N<=103

Example:
Input:
2
6
1 3 6 5 9 8
9
3 6 9 2 15 10 14 5 12
Output:
2
3
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
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String str[] = br.readLine().trim().split(" ");
             
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(str[i]);
            }
            
            int i = 0, count = 0;
            
            while(i < n)
            {
                i = 2*i+1;
                count++;
            }
            
            System.out.println(count-1);
        }
	}
}
