/*
Calculate the angle between hour hand and minute hand.

There can be two angles between hands, we need to print minimum of two. Also, we need to print floor of final result angle. 
For example, if the final angle is 10.61, we need to print 10.

Constraints:
1 ≤ T ≤ 100
1 ≤ h ≤ 12
1 ≤ m ≤ 60

Example:
Input
2
9 60
3 30

Output
90
75

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
            StringTokenizer tk1 = new StringTokenizer(br.readLine());
		    
		    float h=Float.parseFloat(tk1.nextToken()); 
		    float m=Float.parseFloat(tk1.nextToken()); 
		    
		    float hour_angle=0.0f,min_angle=0.0f;
		    
		    if(h==12)
		        h=0;
		    if(m==60)
		        m=0;
		        
		    min_angle=6*m;
		    hour_angle=0.5f*(h*60+m);
		    
		    if(Math.abs(min_angle-hour_angle)>
		    (360-Math.abs(min_angle-hour_angle)))
		        System.out.println((int)(360-Math.abs(min_angle-hour_angle)));
		    else
		        System.out.println((int)Math.abs(min_angle-hour_angle));
        }
	}
}

