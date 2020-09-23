/*
Given a string S, find length of the longest substring with all distinct characters. 
For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.

Constraints:
1 ≤ T ≤ 100
1 ≤ size of str ≤ 10000

Example:
Input:
2
abababcdefababcdab
geeksforgeeks

Output:
6
7
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
	        String str = br.readLine();
	        int left=0, right=0, max=0;
	        int arr[]=new int[26];
	        
	        while(right < str.length())
	        {
	            arr[str.charAt(right)-'a']+=1;
	            if(arr[str.charAt(right)-'a']>1)
	            {
	                if((right-left) > max)
	                    max=right-left;
	                arr[str.charAt(right)-'a']-=1;
	                
	                while(str.charAt(left) != str.charAt(right)){
	                    arr[str.charAt(left)-'a'] -= 1;
	                    left++;
	                }
	                left++;
	                
	            }
	            right++;
	        }
	        if((right-left) > max)
	            max=right-left;
	        System.out.println(max);
	    }
	}
}
