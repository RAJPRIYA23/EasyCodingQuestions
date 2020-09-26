/*
Implement a Stack using two queues q1 and q2.

Example 1:

Input:
push(2)
push(3)
pop()
push(4)
pop()
Output: 3 4
Explanation:
push(2) the stack will be {2}
push(3) the stack will be {2 3}
pop()   poped element will be 3 the 
        stack will be {2}
push(4) the stack will be {2 4}
pop()   poped element will be 4  
Example 2:

Input:
push(2)
pop()
pop()
push(3)
Output: 2 -1

Your Task:

Since this is a function problem, you don't need to take inputs. You are required to complete the two methods push() which takes an integer 'x' as input 
denoting the element to be pushed into the stack and pop() which returns the integer poped out from the stack(-1 if the stack is empty).
*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;

class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}

// } Driver Code Ends


class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    
    int pop()
    {
        if(q1.isEmpty())
            return -1;
            
        while(q1.size() != 1)
        { 
            q2.add(q1.remove());
        }
	    
	    Queue<Integer> tempq = new LinkedList<Integer>();
	    tempq = q1;
	    q1 = q2;
	    q2 = tempq;
	    
	    return q2.remove();
    }
	
   
    void push(int a)
    {
	    q1.add(a);
    }
}
