/*
Given four different points in space. Find whether these points can form a square or not.

Example:
Input:
1
20 10 10 20 20 20 10 10
Output:
Yes
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
            int x0_cnt=0;
            int xn0_cnt=0;
            int y0_cnt=0;
            int yn0_cnt=0;
            float x_arr[]=new float[4];
            float y_arr[]=new float[4];
            float x1=0.0f, x2=0.0f, y1=0.0f, y2=0.0f;
            int j;
            StringTokenizer tk = new StringTokenizer(br.readLine());
        
            for(j=0;j<4;j++)
            {
                x_arr[j]=Float.parseFloat(tk.nextToken()); 
                y_arr[j]=Float.parseFloat(tk.nextToken()); 
            }
            for(j=0;j<3;j++)
            {
                if(x_arr[j+1]!=x_arr[j]); 
                {
                    x1=x_arr[j+1];
                    x2=x_arr[j];
                }
                if(y_arr[j+1]!=y_arr[j]); 
                {
                    y1=y_arr[j+1];
                    y2=y_arr[j];
                }  
            }
            for(j=0;j<4;j++)
            {
                if(x_arr[j]==x1)
                    x0_cnt=x0_cnt+1;
                if(y_arr[j]==y1)
                    yn0_cnt=yn0_cnt+1;
                if(x_arr[j]==x2)
                    xn0_cnt=xn0_cnt+1;
                if(y_arr[j]==y2)
                    y0_cnt=y0_cnt+1;
            }
            
            if(x0_cnt==2 && yn0_cnt==2 && xn0_cnt==2 && y0_cnt==2)
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
