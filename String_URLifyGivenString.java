/*
Write a method to replace all the spaces in a string S with ‘%20’. You may assume that the string has sufficient space (or allocated memory) at the end to hold the additional characters,

Note: The leading and trailing spaces should be trimmed off and not replaced by %20.

Constraints:
1 <= T <= 1000
1 <= |S|+ K <= 1000

Example:
Input:
2
Mr John Smith
13
Mr Benedict Cumberbatch  
25

Output:
"Mr%20John%20Smith"
"Mr%20Benedict%20Cumberbatch

Explanation:
Here in the second case 25 means that there are 25 characters taken into input. While the length of the string is 23 ,
it means that there are 2 extra spaces at the end which needs to be removed and is contained in input.
So the output should be those 23 characters with 2 extra spaces removed and spaces between word replaced with %20.
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
	        short k = Short.parseShort(br.readLine()); 
            StringBuffer string = new StringBuffer();
	        Cl_URLify a = new Cl_URLify();
	        
	        string = a.func_urlify(str);
	        System.out.println(string);
	    }
	}
}

class Cl_URLify
{
    StringBuffer func_urlify(String str)
    {
        StringBuffer string = new StringBuffer();
        short j=0;
        
        for(j=0;j<str.length();j++)
        {
            if(str.charAt(j)!=' ')
                break;
        }
        
        for(short i=j;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                string.append("%20");
            else
                string.append(str.charAt(i));
        }
        
        return string;
    }
}
