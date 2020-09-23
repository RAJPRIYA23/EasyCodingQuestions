/*
Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Example 1:
Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.

Example 2:
Input:
N = 5
a[] = {2,3,1,2,3}
Output: 2 3 
Explanation: 2 and 3 occur more than once
in the given array.

Constraints:
1 <= N <= 105
0 <= A[i] <= N-1, for each valid i
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution 
{
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        int cnt=0,last_number=-1;
        ArrayList<Integer> dup= new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(last_number==arr[i])
		    {
		        if(cnt==0)
		        {
		            dup.add(last_number);
		            cnt++;
		        }
		        if(cnt!=0 && dup.get(cnt-1)!=last_number)
		        {
		            dup.add(last_number);
		            cnt++;
		        }
		    }
		    last_number=arr[i];
        }
        
        if(dup.isEmpty()==true)
             dup.add(-1);
            
       return dup;
    }
}


