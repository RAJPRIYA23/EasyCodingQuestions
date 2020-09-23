/*
In this problem, a String S is composed of lowercase alphabets and wildcard characters i.e. '?'. Here, '?' can be replaced by any of the lowercase alphabets. Now you have to classify the given String on the basis of following rules:

If there are more than 3 consonants together or more than 5 vowels together, the String is considered to be "BAD". A String is considered "GOOD" only if it is not “BAD”.

NOTE: String is considered as "BAD" if the above condition is satisfied even once. Else it is "GOOD" and the task is to make the string "BAD".

Constraints: 
1 <= T <= 100
1 <= |S| <= 100

Example:
Input:
2
aeioup??
bcdaeiou??
Output:
1
0
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
	        Cl_GoodBad a = new Cl_GoodBad();
	        
	        tf = a.func_goodbad(str);
	        
	        if(tf)
		        System.out.println("1");
		    else
		        System.out.println("0");
	    }
	}
}

class Cl_GoodBad
{
    Boolean func_goodbad(String str)
    {
        Boolean tf=true;
        short vowel=0, cons=0, ques_vowel=0, ques_cons=0;
        
        for(short i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='?')
            {
                ques_vowel++;
                ques_cons++;
                if(ques_vowel+vowel>5 || ques_cons+cons>3)
                {
                    tf=false;
                    break;
                }
            }
            
            else if( str.charAt(i)=='a' || str.charAt(i)=='e' ||
            str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
            {
                vowel++;
                if(ques_vowel+vowel>5)
                {
                    tf=false;
                    break;
                }
                cons=0;
                ques_cons=0;
            }
            
            else
            {
                cons++;
                if(ques_cons+cons>3)
                {
                    tf=false;
                    break; 
                }
                vowel=0;
                ques_vowel=0;
            }
        }
        
        return tf;
    }
}
