/*
Given an array, write a program that prints 1 if array represents Inorder traversal of a BST, else prints 0. Note that all keys in BST must be unique.

Example:
Input
3
5
10 20 30 40 50
6
90 80 100 70 40 30
3
1 1 2

Output
1
0
0
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
        int t = Short.parseShort(br.readLine()); 
        
	    while(t-- >0)
	    {
	        int n = Integer.parseInt(br.readLine());
	        String[] str = br.readLine().trim().split(" ");
	        int arr[] = new int[n];
	        
	        for(int i=0 ; i<n ; i++)
	        {
	            arr[i] = Integer.parseInt(str[i]);
	        }
	        
	        int i = 0;
	        for(; i < n-1 ; i++)
	        {
	            if(arr[i+1] <= arr[i])
	                break;
	        }
	        
	        if(i == n-1)
	            System.out.println("1");
	        
	        else
	            System.out.println("0");
	    }
	}
}
