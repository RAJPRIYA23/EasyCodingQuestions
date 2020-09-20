/*
For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.
 
Example :

Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


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
	        int n=sc.nextInt();
	        int temp=(int)Math.sqrt(n);
	        if(n%2==0) 
            { 
                System.out.println("No"); 
            } 
            else
            {
                int j;
                for(j=3;j<=temp;j+=2) 
                { 
                    if(n%j==0) 
                    { 
                        System.out.println("No");
                        break;
                    } 
                }
                if(j>temp)
                {
                    System.out.println("Yes");
                }
            }
        }
	}
}
