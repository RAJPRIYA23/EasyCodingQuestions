/*
Vaibhav likes to play with numbers and he has n numbers. One day he was placing the numbers on the playing board just to count that how many numbers he have. 
He was placing the numbers in increasing order i.e. from 1 to n. But when he was putting the numbers back into his bag, some numbers fell down onto the floor. 
He picked up all the numbers but one number, he couldn't find. 
Now he have to go somewhere urgently, so he asks you to find the missing number.

Constraints:
1 <= T <= 100
1 <= n <= 104
1 <= a[i] <= 104

Example:
Input:                    
2                                        
4                                        
1 4 3                           
5
2 5 3 1
Output:
2
4

Explanation:
For first test case
Vaibhav placed 4 integers but he picked up only 3 numbers. So missing number will be 2 as it will become 1,2,3,4.

For the second case
Vaibhav placed 5 integers on the board, but picked up only 4 integers, so the missing number will be 4 so that it will become 1,2,3,4,5.
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
        int t = Integer.parseInt(br.readLine().trim()); 
        
	    while(t-- >0)
	    {
	        int n = Integer.parseInt(br.readLine().trim()); 
	        int arr[] = new int[n]; 
	        String st[] = br.readLine().trim().split(" ");
	        long sum =0,tempsum=0;
	        for(int i=0 ; i<n-1 ; i++)
	        {
	            arr[i] = Integer.parseInt(st[i]);
	            sum = sum + arr[i];
	        }
	        tempsum=(n*(n+1))/2;
	        System.out.println(tempsum-sum);
	    }
	}
}
