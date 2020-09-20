/*
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106

Example:
Input:
2
5
10
Output:
10
17
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args) throws IOException
	{
	      BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
      
        Map<Integer, Integer> list1 = new TreeMap<Integer, Integer>();
        Map<Integer, Long> list2 = new TreeMap<Integer, Long>();
        for(int i=0;i<t;i++)
	      {
	          list1.put(Integer.parseInt(br.readLine()),i);
	      }
	    int init_num=2;
	    long sum=0;
	    for (Map.Entry<Integer, Integer> entry : list1.entrySet()) 
        { 
	        int n=entry.getKey();
	        for(int k=init_num;k<=n;k++)
	        {
	            int temp=(int)Math.sqrt(k);
	            if(k%2==0 && k!=2) 
                { 
                    continue;
                } 
                else
                {
                    int j;
                    for(j=3;j<=temp;j+=2) 
                    { 
                        if(k%j==0) 
                        { 
                        break;
                        } 
                    }
                    if(j>temp)
                    {
                        sum=sum+k;
                    }
                }
	        }
	        init_num=n+1;
	        list2.put(entry.getValue(),sum);
	    }
	    for (Map.Entry<Integer, Long> entry : list2.entrySet()) 
        {
            System.out.println(entry.getValue());
        }
	}
}
