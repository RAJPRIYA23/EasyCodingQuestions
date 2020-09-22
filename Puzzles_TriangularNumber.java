/*
Check whether the number is Triangular or not. A number is termed as triangular number if we can represent it in the form of triangular grid of points such that 
the points form an equilateral triangle and each row contains as many points as the row number, i.e., the first row has one point, second row has two points, 
third row has three points and so on. 
The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4).

Constraints:
1 <= T <= 100
1 <= N <= 107

Example:
Input:
5
3
4
6
55
345

Output:
1
0
1
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
        int t = Integer.parseInt(br.readLine()); 
        for(int i=1;i<=t;i++)
        {
            int n = Integer.parseInt(br.readLine()); 
            double temp=Math.sqrt(1+8*n);
            if(Math.floor(temp)==temp)
                System.out.println("1");
            else
                System.out.println("0");
        }
	}
}
