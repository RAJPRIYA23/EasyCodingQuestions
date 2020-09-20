/*
Given two positive integers A and B, find GCD of A and B.

Example :

Input: A = 3, B = 6
Output: 3
Explanation: GCD of 3 and 6 is 3
*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------


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
            int a= sc.nextInt();
            int b= sc.nextInt();
            int temp=0;
            while((a%b)!=0)
            {
                temp=a%b;
                a=b;
                b=temp;
            }
            System.out.println(b);
        }
	}
}
