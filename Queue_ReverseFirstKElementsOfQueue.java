/*
Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Example 1:

Input:
5 3
1 2 3 4 5

Output: 
3 2 1 4 5

Explanation: 
After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.

Your Task:
Complete the provided function modifyQueue that takes queue and k as parameters and returns a modified queue. The printing is done automatically by the driver code.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Initial Template for Java

import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        
        //Taking input using class Scanner
        Scanner sc=new Scanner(System.in);
        
        //Taking total number of testcases
        int t=sc.nextInt();
        
        while(t-->0){
            //Taking count of total number of elements
            int n=sc.nextInt();
            
            //Taking count of total elements
            //that need to be reversed
            int k=sc.nextInt();
            
            //Creating a Queue
            Queue<Integer> q=new LinkedList<>();
            
            //adding all the elements to the Queue
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            
            //Creating an object of class GfG
            GfG g=new GfG();
            
            //calling modifyQueue of class GfG
            //and passing Queue and k as arguments
            //and storing the reuslt in a new Queue
            Queue<Integer> ans=g.modifyQueue(q,k);
            
            //Printing all the elements from the
            //new Queue and polling them out
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> que = new LinkedList<Integer>();
        
        for(int i = 0; i < k ; i++)
        {
            stack.push(q.remove());
        }
        
        while(!q.isEmpty())
        {
            que.add(q.remove());
        }
        
        while(!stack.isEmpty())
        {
            q.add(stack.pop());
        }
        
        while(!que.isEmpty())
        {
            q.add(que.remove());
        }
        
        return q;
        
    }
}
