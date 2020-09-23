/*
Constraints:
1 ≤ T ≤ 300
1 ≤ |s| ≤ 106

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO

Explanation:
Testcase 1: Both the string have same characters with same frequency. So, both are anagrams.
Testcase 2: Characters in both the strings are not same, so they are not anagrams.
*/


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
	        String[] str = br.readLine().trim().split(" ");
	        String str1,str2;
	        str1=str[0];
	        str2=str[1];
	        Cl_Anagram a=new Cl_Anagram();
	        Boolean tf=a.func_anagram(str1,str2);
	        if(tf)
	            System.out.println("YES");
	        else 
	            System.out.println("NO");
	    }
	}
}

class Cl_Anagram
{
    Boolean func_anagram(String str1, String str2)
    {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        
        if(str1.length()!=str2.length())
            return false;
        else
        {
            for(int i=0;i<str1.length();i++)
            {
                arr1[str1.charAt(i)-'a']++;
                arr2[str2.charAt(i)-'a']++;
            }
            
            for(int i=0;i<26;i++)
            {
                if(arr1[i]!=arr2[i])
                    return false;
            }
        }
        return true; 
    }
}
