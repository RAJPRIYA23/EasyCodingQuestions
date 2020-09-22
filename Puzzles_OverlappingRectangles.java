/*
Given two rectangles, find if the given two rectangles overlap or not. A rectangle is denoted by providing the x and y co-ordinates of two points: 
the left top corner and the right bottom corner of the rectangle. Two rectangles sharing a side are considered overlapping.

Note : It may be assumed that the rectangles are parallel to the coordinate axis.

Constraints:
1 <= T <= 10
-104 <= x, y <= 104

Example:
Input:
2
0 10 10 0
5 5 15 0
0 2 1 1
-2 -3 0 2

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
        int t = Integer.parseInt(br.readLine()); 
        
        for(int i=1;i<=t;i++)
        {
            int left_x1,right_x1,top_y1,bottom_y1;
		    int left_x2,right_x2,top_y2,bottom_y2;
		    
		    StringTokenizer tk1 = new StringTokenizer(br.readLine());
		    
		    left_x1=Integer.parseInt(tk1.nextToken()); 
		    top_y1=Integer.parseInt(tk1.nextToken()); 
		    right_x1=Integer.parseInt(tk1.nextToken()); 
		    bottom_y1=Integer.parseInt(tk1.nextToken()); 
		    
		    StringTokenizer tk2 = new StringTokenizer(br.readLine());
		    
		    left_x2=Integer.parseInt(tk2.nextToken()); 
		    top_y2=Integer.parseInt(tk2.nextToken()); 
		    right_x2=Integer.parseInt(tk2.nextToken()); 
		    bottom_y2=Integer.parseInt(tk2.nextToken()); 
		    
		    
		    if (right_x1  < left_x2  || right_x2 < left_x1  || 
		        top_y1 < bottom_y2 || top_y2 < bottom_y1)
	            System.out.println("0");
		    else
		        System.out.println("1");
        }
	}
}

