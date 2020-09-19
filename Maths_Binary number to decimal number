/*
Given a Binary Number B, find its decimal equivalent.
 
Example:

Input: B = 10001000
Output: 136
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args)
	{
	    Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();  
		for(int i=1;i<=t;i++)
		{
		    long n= sc.nextLong();  
		    long temp=0;
		    int count=0;
		    double sum=0;
		    while(n>0)
		    {
		        temp=n%10;
		        if(temp==1)
		        {
		            sum=sum+Math.pow(2,count); 
		        }
		        count++;
		        n=n/10;
		    }
		   System.out.println((long)sum); 
		}
	}
}
