/*
Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.

Constraints:
1 <= T <= 100
1 <= |S1|, |S2| <= 104

Example:
Input:
2
Hello Bye
abc def

Output:
HBeylelo
adbecf
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
	        String[] str = br.readLine().trim().split(" ");
	        String str1="",str2="";
	        str1 = str[0];
	        if(str.length==2)
	            str2 = str[1];
	        StringBuffer string;
	        Cl_Merge a=new Cl_Merge();
	        string=a.func_merge(str1,str2);
	        System.out.println(string);
	    }
	}
}

class Cl_Merge
{
    StringBuffer func_merge(String str1, String str2)
    {
        int arr[]=new int[26];
        int length1=0,length2=0;
        StringBuffer string =new StringBuffer();
        Boolean tf=false;
        
        if(str1.length()<str2.length())
        {
            length1=str1.length();
            length2=str2.length();
            tf=true;
        }
        else
        {
            length1=str2.length();
            length2=str1.length();
            tf=false;
        }
            
        for(int i=0;i<length1;i++)
        {
            string.append(str1.charAt(i));
            string.append(str2.charAt(i));
        }
        
        for(int i=length1;i<length2;i++)
        {
            if(tf)
                string.append(str2.charAt(i));
            else
                string.append(str1.charAt(i));
        }
        
        return string;
    }
}
