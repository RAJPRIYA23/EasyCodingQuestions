/*
Given a string S, Check if characters of the given string can be rearranged to form a palindrome. 
For example characters of “geeksogeeks” can be rearranged to form a palindrome “geeksoskeeg”, but characters of “geeksforgeeks” cannot be rearranged to form a palindrome.

Constraints:
1 <= T <= 100
1 <= |S| <= 1000

Example:
Input:
2
geeksogeeks
geeksforgeeks
Output:
Yes
No
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
	        String str= br.readLine();
	        Cl_AnaPal a=new Cl_AnaPal();
	        Boolean tf=a.func_anapal(str);
	        if(tf)
	            System.out.println("Yes");
	        else 
	            System.out.println("No");
	    }
	}
}

class Cl_AnaPal
{
    Boolean func_anapal(String str)
    {
        int arr[]=new int[26];
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]%2==0)
                continue;
            else
                cnt++;
        }
        if(cnt==0 || cnt==1)
            return true; 
        else
            return false;
    }
}
