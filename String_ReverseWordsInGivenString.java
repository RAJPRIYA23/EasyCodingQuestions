/*
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
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
	        String[] str = br.readLine().split("\\.");
	        
	        for(int i=str.length-1;i>=0;i--)
	        {
	            if(i!=0)
	                System.out.print(str[i]+".");	   
	            else
	                System.out.print(str[i]);
	        }
	        System.out.println();
	    }
	}
}
