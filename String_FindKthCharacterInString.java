/*
Given a decimal number m. Convert it into a binary string and apply n iterations, in each iteration 0 becomes 01, and 1 becomes 10. Find the kth (1-indexing) character in the string after nth iteration.

Example 1:

Input: m = 5, n = 2, k = 5
output: 0
Explanation: Binary represntation of m 
is "101", after one iteration binary 
reprentation will be "100110", and after 
second iteration binary repreentation 
will be "100101101001". 
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
        while(t-- >0)
	    {
	      String strarr[] = br.readLine().trim().split(" ");

	      int m =Integer.parseInt(strarr[0]); 
	      int k =Integer.parseInt(strarr[1]);
	      int n =Integer.parseInt(strarr[2]);
	      
	      StringBuffer str = new StringBuffer(); 
	      String s = Integer.toBinaryString(m);
	      
	      for(int i = 0; i < n ; i++)
	      {
	            for(int j = 0; j < s.length(); j++ )
	            {
	                if(s.charAt(j) == '0')
	                {
	                    str.append("01"); 
	                }
	                else
	                {
	                    str.append("10"); 
	                }
	            }
	            
	            s=str.toString();
	            str.delete(0,str.length());
	      }
	      System.out.println(s.charAt(k));
	    }
	}
}
