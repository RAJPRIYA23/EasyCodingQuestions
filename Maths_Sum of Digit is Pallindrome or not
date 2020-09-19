/*
Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.

Input:
N=56
Output:
1
Explanation:
The digit sum of 56 is 5+6=11.
Since, 11 is a palindrome number.Thus,
answer is YES.
*/

// ----------------------------------------------------------------------------------------------------------------------------------------------


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
		    int n= sc.nextInt(); 
		    int arr[]=new int[10];
		    int temp1=n,sum1=0,count=0;
		    while(n>0)
	        {
	           temp1=n%10;
	           sum1=sum1+temp1;
	           n=n/10;
	        }
	        while(sum1>0)
            {
                temp1=sum1%10;
                arr[count]=temp1;
                sum1=sum1/10;
                count++;
            }
	       
	        int left=0,right=count-1;
	        while(left<right)
	            {
	                if(arr[left]==arr[right])
	                {
	                    left++;
	                    right--;
	                }
	                else
	                    break;
	            }
	       if(left>=right)
	            System.out.println("YES");
	       else
	            System.out.println("NO");
		}
	}
}
