/*
Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S.

Constraints:
1 <= T <= 900
1 <= N <= 104

Example:
Input :
3
5  
hello
12
zxvczbtxyzvy
6
xxyyzz

Output :
h
c
-1
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
	        int n = Integer.parseInt(br.readLine().trim()); 
	        String str = br.readLine();
	        Boolean tf=false;
	        char letter ='a';
	        int arr[]=new int[26];
	        for(int i=0;i<n;i++)
	           arr[str.charAt(i)-'a']+=1;
	        for(int i=0;i<n;i++)
	        {
	            if(arr[str.charAt(i)-'a']==1)
	            {
	               letter=str.charAt(i); 
	               tf=true;
	               break;
	            }
	        }
	        if(tf)
                System.out.println(letter);
            else
                System.out.println("-1");
	    }
	}
}
