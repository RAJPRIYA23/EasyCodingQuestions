/*
Jarvis is weak in computing palindromes for Alphanumeric characters.
While Ironman is busy fighting Thanos, he needs to activate sonic punch but Jarvis is stuck in computing palindromes.
You are given a string S containing alphanumeric characters. Find out whether the string is a palindrome or not.
If you are unable to solve it then it may result in the death of Iron Man.

Constraints:
1<=T<=100
1<=|S|<=100000
Note: Consider alphabets and numbers only for palindrome check. Ignore symbols and whitespaces.

Example:
Input:
2
I am :IronnorI Ma, i
Ab?/Ba

Output:
YES
YES
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
	        Boolean tf;
	        Cl_Ironman a = new Cl_Ironman();
	        
	        tf = a.func_ironman(str);
	        
	        if(tf)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
	    }
	}
}

class Cl_Ironman
{
    Boolean func_ironman(String str)
    {
        Boolean tf=false;
        StringBuffer string =new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>=48 && str.charAt(i)<=57 ) ||
	           (str.charAt(i)>=65 && str.charAt(i)<=90 )) 
	            string.append(str.charAt(i));
	            
	        else if((str.charAt(i)>=97 && str.charAt(i)<=122))
	        {
	            string.append((char)(str.charAt(i)-32));
	        }
        }
        int l=0, r= string.length()-1;
        
	    while(l<r)
	    {
	        if(string.charAt(l)==string.charAt(r))
	        {
	            l++;
	            r--;
	        }
	        else
	            break;
	    }
	    if(l>=r)
		    tf=true;
	
        return tf;
    }
}
