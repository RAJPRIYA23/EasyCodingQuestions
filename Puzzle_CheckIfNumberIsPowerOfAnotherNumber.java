/*
Check if a number is power of another number

Example:

Input:
X = 2, Y = 8

Output:
1
Explanation:
2^3 is equal to 8.
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
            int j,x,y;
            StringTokenizer tk = new StringTokenizer(br.readLine());
            x=Integer.parseInt(tk.nextToken()); 
            y=Integer.parseInt(tk.nextToken());
            if(x==1)
            {
                if(y==1)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
            else
            {
                while(y%x==0)
                {
                    y=y/x;
                }
                if(y==1)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
            
        }
	}
}
