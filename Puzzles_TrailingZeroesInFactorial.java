/*
For an integer n find number of trailing zeroes in n! . 

Constraints:
1 <= T <= 100
1 <= N <= 1000

Example:
Input:
1
9
Output:
1

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
		int t = Integer.parseInt(br.readLine()); 
        for(int i=1;i<=t;i++)
        {
            int n = Integer.parseInt(br.readLine()); 
            int cnt=0,temp=5,j=1;
            while(temp<=n)
            {
                j++;
                temp=(int)Math.pow(5,j);
            }
            j--;
            
            for(int k=1;k<=j;k++)
            {
                cnt=cnt+(n/(int)Math.pow(5,k));
            }
            System.out.println(cnt);
        }
	}
}
