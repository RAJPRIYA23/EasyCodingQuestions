/*
Design a data-structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() 
which should return minimum element from the SpecialStack. Your task is to complete all the functions, using stack data-Structure.

Example:
Input:
Stack: 18 19 29 15 16
Output: 15

Your Task:
Since this is a function problem, you don't need to take inputs. You just have to complete 5 functions, push() which takes an integer x as input 
and pushes it into the stack; pop() which pops out the topmost element from the stack; isEmpty() which returns true/false depending upon whether
the stack is empty or not; isFull() which takes the size of the stack as input and returns true/false depending upon whether the stack is full or not (depending upon the
given size); getMin() which returns the minimum element of the stack. 
Note: The out of the code will be the value returned by getMin() function.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG
{
	public void push(int a,Stack<Integer> s)
	{
	    if(isEmpty(s))
	    {
	        s.push(a);
	    }
	    
	    else
	    {
	        Integer temp = pop(s);
	        
	        if(temp < a)
	        {
	            s.push(a);
	            s.push(temp);
	        }
	        
	        else
	        {
	            s.push(temp);
	            s.push(a);
	        }
	    }
	}
	
	public int pop(Stack<Integer> s)
    {
        return(s.pop());
	}
	
	public int min(Stack<Integer> s)
    {
      return(s.pop());
	}
	
	public boolean isFull(Stack<Integer>s, int n)
    {
        
        if(s.size() == n)
            return true;

        return false;
	}
	
	public boolean isEmpty(Stack<Integer>s)
    {
        return s.isEmpty();
	}
	
}
