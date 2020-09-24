/*
Given an array Arr of N positive integers, find K largest elements from the array.  The output elements should be printed in decreasing order.

Example :
Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the
array is 787 and second largest is 23.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

//-----------------------------------------------------------------

class Solution 
{
    int[] kLargest(int[] arr, int n, int k) 
    {
        int res[] = new int[k];
        
        PriorityQueue<Integer> q = new PriorityQueue<>(); 
            
        for(int i = 0; i < k; i++) 
        { 
            q.add(arr[i]);
        }
            
        int index = 0;
            
        if(k != n)
        {
            for(int i = k; i < n; i++)
            { 
                if(arr[i] >= q.peek())
                {
                    q.remove();
                    q.add(arr[i]);
                }
            }
        }
        
        Iterator<Integer> itr = q.iterator(); 
  
        while(itr.hasNext())  
        { 
            res[index] = q.poll();
            index++;
        }
        
        int res2[] = new int[k];
        
        for(int i = k-1; i >= 0; i--)
        {
            res2[i] = res[k-1-i];
        }
        
        return res2;
    }
    
}
