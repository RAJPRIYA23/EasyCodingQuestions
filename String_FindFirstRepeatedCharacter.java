/*
Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index 
of second occurrence is smallest.S contains only lowercase letters.

Constraints:
1 <= T <= 100
1 <= |S| <=104

Example:
Input:
2
geeksforgeeks
hellogeeks

Output:
e
l
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
	        String str = br.readLine();
	        int arr[]=new int[26];
	        Boolean tf=false;
	        char letter='a';
	        for(int i=0;i<str.length();i++)
	        {
	            arr[str.charAt(i)-'a']+=1;
	            if(arr[str.charAt(i)-'a']==2)
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

