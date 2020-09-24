/*
Given a string S consisting only '0's and '1's,  print the last index of the '1' present in it.

Constraints:
1 <= T <= 110
1 <= |S| <= 106

Example:
Input:
2
00001
0
Output:
4
-1

Explanation:
Testcase 1: Last index of  1 in given string is 4.
Testcase 2: Since, 1 is not present, so output is -1.
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
	        String str = br.readLine().trim(); 
	        int i=0;
	        for(i= str.length()-1; i>= 0; i--)
	        {
	            if(str.charAt(i)=='1')
	            {
	                System.out.println(i);
	                break;
	            }
	        }
	        if(i == -1)
	            System.out.println("-1");
	    }
	}
}
