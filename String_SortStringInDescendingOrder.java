/*
Given a string S containing only lower case alphabets, the task is to sort it in lexigraphically-descending order.
Constraints:
1 <= T <= 100
1 <= |S| <= 105

Example:
Input:
2
geeks
for
Output:
skgee
rof
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
        short t = Short.parseShort(br.readLine()); 
        while(t-- >0)
	    {
	        String str = br.readLine();
	        StringBuffer string;
	        Cl_Sort a=new Cl_Sort();
	        string=a.func_sort(str);
	        System.out.println(string);
	    }
	}
}

class Cl_Sort
{
    StringBuffer func_sort(String str)
    {
        int arr[]=new int[26];
        int cnt=0;
        StringBuffer string =new StringBuffer();
        
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']++;
        }
        
        for(int i=25;i>=0;i--)
        {
            while(arr[i]-- > 0)
            {
                string.append((char)(i+97));
            }
        }
        return string;
    }
}
