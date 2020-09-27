/*
Given a sorted array. Write a program that creates a Balanced Binary Search Tree using array elements.
If there are N elements in array, then floor(n/2)'th element should be chosen as root and same should be followed recursively.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ A[i] ≤ 10000

Example:
Input:
1
7
1 2 3 4 5 6 7

Output:
4 2 1 3 6 5 7
*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node left = null;
    Node right = null;
    
    Node(int data)
    {
        this.data = data;
    }
}

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
            
            Node root = convert(arr, 0, n-1);
            preorder(root);
            System.out.println(" ");
        }
	}
	
	
	static Node convert(int arr[], int start, int end)
    {
        if(start > end)
            return null;
        
        int mid = (start + end) / 2; 
        Node root = new Node(arr[mid]);
        
        root.left = convert(arr, start, mid-1);
        root.right = convert(arr, mid+1, end);
        
        return root;
    }
	
	static void preorder(Node root)
	{
	    if(root != null)
	    {
	        System.out.print(root.data + " ");
	        preorder(root.left);
            preorder(root.right);
	    }
	}
	
}
