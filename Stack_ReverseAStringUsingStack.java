/*
An string of words is given, the task is to reverse the string using stack.
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function.

Constraints:
1 <= T <= 100
1 <= length of the string <= 100

Example:
Input:
2
GeeksQuiz
GeeksforGeeks
Output:
ziuQskeeG
skeeGrofskeeG
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            obj.reverse(sc.next());
        }
	}
}
// } Driver Code Ends



class Solution 
{
    
    int top;
	char arr[] = new char[100];
	
	Solution()
	{
		top = -1;
	}
	
    public void reverse(String str)
    {
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i < str.length(); i++)
        {
            push(str.charAt(i));
        }
        
        for(int i=0; i<str.length(); i++)
        {
            sb.append(pop());
        }
        
        str = sb.toString();
        
        System.out.println(str);
    }
	
    void push(char a)
	{
	    top++;
	    arr[top] = a;
	} 
	
	char pop()
	{
	    char popped = '0';
	    
        if(top != -1)
        {
            popped = arr[top];
            top--;
        }
           
        return popped;
    }
    


}
