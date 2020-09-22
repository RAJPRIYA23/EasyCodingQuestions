/*
Given an array A of N elements. Find the majority element in the array. 
A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Constraints:
1 <= T<= 100
1 <= N <= 107
0 <= Ai <= 106

Example:
Input:
2
5
3 1 3 3 2
3
1 2 3

Output:
3
-1
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine());
	    for(int i=1;i<=t;i++)
	    {
	        int n = Integer.parseInt(br.readLine());
	        int num=-1,limit=0,curr=0,cnt=0;
	        int arr[]=new int[n];
	        
	        HashMap<Integer, Integer> list1 = new HashMap<Integer, Integer>();
	        
	        limit=n/2+1;
	       
	        StringTokenizer tk = new StringTokenizer(br.readLine());
	        for(int j=0;j<n;j++)
	        {
	            arr[j]=Integer.parseInt(tk.nextToken());
	            if(j==0)
	                curr=arr[0];
	                
	            if(curr==arr[j])
	                cnt++;
	            else 
	                cnt--;
	            if(cnt==0)
	            {
	                curr=arr[j];
	                cnt++;
	            }
	        }
	        if(cnt>0)
	        {
	            cnt=0;
	            for(int j=0;j<n;j++)
	            {
    	            if(arr[j]==curr)
    	                cnt++;
    	            if(cnt==limit)
    	            {
    	                num=curr;
    	                break;
    	            }
	            }
	        }
            System.out.println(num);
	    }
	}
}
