/*
You have been given an alphanumeric string S, extract maximum numeric value from that string. Alphabets will only be in lower case.

Constraints:
1 <= T <= 100
2 <= |S| <= 200

Example:

Input:
3
100klh564abc365bg
abvhd9sdnkjdfs
abchsd0sdhs

Output:
564
9
0

Explanation:
Test Case 1: The maximum number found in the string is "564".  
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
	        String res;
	        Cl_Max a = new Cl_Max();
	        res = a.func_max(str);
	        System.out.println(res);
	    }
	}
}

class Cl_Max
{
    String func_max(String str)
    {
        StringBuffer string = new StringBuffer();
        String[] sarr = new String[210];
        String[] starr = new String[210];
        short len[]=new short[210];
        short start=0,end=0;
        String temp="";
        
        for(short i=0;i<str.length();i++)
        {
            if(str.charAt(i) < 97)
            {
                start=i;
                break;
            }
        }
        
        for(short i=(short)(str.length()-1);i>=0;i--)
        {
            if(str.charAt(i) < 97)
            {
                end=i;
                break;
            }
        }
        
        char prev='z';
        short max=-1,count=0;
        Boolean flag=false;
        if(start==end)
        {
            string.append(str.charAt(start));
            temp=string.toString();
        }
        else
        {
        for(short i=start;i<=end;i++)
        {
            if((str.charAt(i)>=97 && str.charAt(i)<=122))
            {
                if(prev<97)
                {
                sarr[count] = string.toString();
                len[count] = (short)sarr[count].length();
                if(len[count] > max)
                    max=len[count];
                count++;
                flag=false;
                string.delete(0,string.length());
                }
            }
            else
            {
                if(str.charAt(i)!='0')
                    flag=true;
                if(flag==true)
                    string.append(str.charAt(i));
            }
            prev=str.charAt(i);
        }
        
        sarr[count] = string.toString();
        len[count] = (short)sarr[count].length();
        if(len[count] > max)
                max=len[count];
        count++;

        
        short cnt=0;
        for(short i=0;i<count;i++)
        {
            if(len[i] == max)
            {
                starr[cnt]=sarr[i];
                cnt++;
            }
        }
        
        if(cnt==1)
            temp=starr[0];
        else
        {
            Arrays.sort(starr,0,cnt);
            temp=starr[cnt-1];
        }
        
    }
    if(temp.length() == 0 )
        return "0";
    else{
        return temp;
    }
    }
}
