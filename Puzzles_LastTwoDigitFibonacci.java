/*
Given a number N. Find the last two digits of the Nth fibonacci number.
Note: If the last two digits are 02, return 2.

Example 1:

Input:
N = 13
Output:
33
Explanation:
The 13th Fibonacci number is 233.
So last two digits are 3 and 3.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
           
            long n = sc.nextLong();
            long j, k=0;
            int a=0, b=1,temp=0,cnt=0;
            String str;
            k = n % 300;
            for(j=1;j<=k;j++)
            {
                a=a%100;
                temp= b;
                b = (a+b)%100;
                a = temp;
            }
            str ="1"+Integer.toString(a);
            temp=Integer.parseInt(str);
            while(temp>0)
            {
                temp=temp/10;
                cnt++;
            }
            if(cnt==2)
            {
               System.out.println("0"+ a);
            }
            else
                System.out.println(a);
        }
	}
}
