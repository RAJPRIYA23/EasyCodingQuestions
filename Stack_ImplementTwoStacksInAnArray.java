/*
Your task is to implement  2 stacks in one array efficiently .

Example 1:

Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()
Output:
3 4 -1
Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 
from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 
from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence -1 .

Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided functions. You are required to complete the 4 methods push1, push2
which takes one argument an integer 'x' to be pushed into the stack one and two and pop1, pop2 which returns the integer poped out from stack one and two 
(if no integer is present in the array return -1)
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class TwoStack
{
	
	int size;
	int top1,top2;
	//int arr[] = new int[size];
	int arr[] = new int[100]; 
	
	TwoStack()
	{
		int n =100;
		size = n;
		//arr[] = new int[n];
		top1 = -1;
		top2 = size;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			TwoStack sq = new TwoStack();
			
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				Stacks g = new Stacks();
				
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a,sq);
					else if(stack_no ==2)
					 g.push2(a,sq);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1(sq)+" ");
					else if(stack_no==2)
					System.out.print(g.pop2(sq)+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}

// } Driver Code Ends


/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
    // sq is the object of class TwoStack

    /* The method push to push element into the stack 2 */
    
    void push1(int x, TwoStack sq)
    {
        sq.top1++;
	    sq.arr[sq.top1] = x;
    }

    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        sq.top2--;
	    sq.arr[sq.top2] = x;
    }

    /* The method pop to pop element from the stack 1 */
    //Return the popped element
    int pop1(TwoStack sq)
    {
        if(sq.top1 == -1)
            return -1;
        int popped = sq.arr[sq.top1];
        sq.top1--;
        return popped;
    }

    /* The method pop to pop element from the stack 2 */
    //Return the popper element
    int pop2(TwoStack sq)
    {
        if(sq.top2 == sq.size)
            return -1;
        int popped = sq.arr[sq.top2];
        sq.top2++;
        return popped;
    }
}

