/*
Given three increasingly sorted arrays A, B, C of sizes N1, N2, and N3 respectively, you need to print all common elements in these arrays.
Note: Please avoid printing the same common element more than once.

Constraints:
1 <= T <= 100
1 <= N1, N2, N3 <= 107
1 <= Ai, Bi, Ci <= 1018

Example:
Input:
1
6 5 8
1 5 10 20 40 80
6 7 20 80 100
3 4 15 20 30 70 80 120
Output:
20 80

Explanation:
Testcase1:  20 and 80 are the only common elements
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
	        int n1 = Integer.parseInt(str[0]);
	        int n2 = Integer.parseInt(str[1]);
	        int n3 = Integer.parseInt(str[2]);
	        int arr1[] = new int[n1]; 
	        int arr2[] = new int[n2]; 
	        int arr3[] = new int[n3]; 
	        int cnt = 0, min = 0;
	        if(n1 < n2)
	            min = n1;
	        else 
	            min = n2;
	            
	        int result[] =new int[min];
	        
	        String st1[] = br.readLine().trim().split(" ");
	        for(int i = 0 ; i < n1; i++)
	        {
	            arr1[i] = Integer.parseInt(st1[i]); 
	        }
	        
	        String st2[] = br.readLine().trim().split(" ");
	        for(int i = 0 ; i < n2; i++)
	        {
	            arr2[i] = Integer.parseInt(st2[i]); 
	            Search s = new Search();
	            int res = -1;
	            res = s.bin_search(arr1,0,n1-1,arr2[i]);
	            if(res != -1)
	            {
	                result[cnt]=res;
	                cnt++;
	            }
           }
           
           
	        String st3[] = br.readLine().trim().split(" ");
	        for(int i = 0 ; i < n3; i++)
	        {
	            arr3[i] = Integer.parseInt(st3[i]); 
	        }
	        
	        Boolean is_true = false;
	        for(int i = 0 ; i < cnt; i++)
	        {
	            Search s = new Search();
	            int res = -1;
	            res = s.bin_search(arr3,0,n3-1,result[i]);
	            if(res == -1)
	            {
	                result[i]= -1;
	            }
	            else
	            {
	                is_true = true;
	            }
	        }
	        
	        if(is_true)
	        {
	            if(result[0] != -1)
	                System.out.print(result[0]+" ");
	            for(int i=1; i < cnt; i++)
	            {
	                if(result[i] != -1 && result[i-1] != result[i])
	                    System.out.print(result[i]+" ");
	            }
                System.out.println();
	        }
	        else
	            System.out.println("-1");
	    }
	}
}

class Search
{
	int bin_search(int A[], int left, int right, int k)
	{
	    int res = -1;
	    int mid = (left+right)/2;
        
        if(left>right)
            return -1;
        if(A[mid]==k)
            return A[mid];
    
        else
        {
            if(k < A[mid])
                res = bin_search(A,left,mid-1,k);
            else
                res = bin_search(A,mid+1,right,k);
        }
        return res;
	}
}
