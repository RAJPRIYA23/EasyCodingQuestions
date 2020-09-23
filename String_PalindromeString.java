/*
Given a string S, check if it is palindrome or not.

Constraints:
1 <= T <= 30
1 <= N <= 100

Example:
Input:
1
4
abba
Output:
Yes
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
	        short n = Short.parseShort(br.readLine());
	        String str = br.readLine();
	        short l=0, r= (short)(str.length()-1);
	        while(l<r)
	        {
	            if(str.charAt(l)==str.charAt(r))
	            {
	                l++;
	                r--;
	            }
	            else
	                break;
	        }
	        if(l>=r)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
	    }
	}
}
