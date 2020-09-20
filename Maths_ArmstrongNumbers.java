/*
For a given 3 digit number, find whether it is armstrong number or not. 
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
Return "Yes" if it is a armstrong number else return "No".
NOTE: 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371
*/

//-----------------------------------------------------------------------------------------------------------------------------------------

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
	        int n= sc.nextInt(); 
	        int temp1=n,temp2=n,count=0,sum=0;
	        while(temp1>0)
            {
                temp1=temp1/10;
                count++;
            }
            temp1=n;
            temp2=n;
	        while(temp1>0)
	        {
	           temp2=temp1%10;
	           sum=sum+(int) Math.pow(temp2,count);
	           temp1=temp1/10;
	        }
	        if(sum==n)
	        {
	           System.out.println("Yes"); 
	        }
	        else
	        {
	            System.out.println("No"); 
	        }
	    }
	}
}

