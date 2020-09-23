/*
Given a string S, write a program to title case every first letter of words in string.

Constraints: 
1 <= T <= 100
1 <= |S| <= 1000

Example:
Input:
1
I love programming
Output:
I Love Programming
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
	        String str = br.readLine();
	        StringBuilder string  = new StringBuilder(str);
	        Cl_Uppercase a=new Cl_Uppercase();
	        string=a.func_uppercase(string);
	        System.out.println(string);
	    }
	}
}

class Cl_Uppercase
{
    StringBuilder func_uppercase(StringBuilder string)
    {
        if(string.charAt(0)-97 >= 0)
            string.setCharAt(0,(char)(string.charAt(0)-32));
        char temp_char=string.charAt(0);
        for(int i=0;i<string.length();i++)
        {
            if(temp_char==' ' && string.charAt(i)!=' ' &&
                string.charAt(i)-97 >= 0)
                string.setCharAt(i,(char)(string.charAt(i)-32));
            temp_char=string.charAt(i);
        }
        return string;
    }
}
