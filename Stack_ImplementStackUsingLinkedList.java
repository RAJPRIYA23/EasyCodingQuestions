/*
Let's give it a try! You have a linked list and you have to implement the functionalities push and pop of stack using this given linked list. 
Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 

Example:

Input: 
push(2)
push(3)
pop()
push(4) 
pop()
Output: 3, 4
Explanation: 
push(2)    the stack will be {2}
push(3)    the stack will be {2 3}
pop()      poped element will be 3,
           the stack will be {2}
push(4)    the stack will be {2 4}
pop()      poped element will be 4

Your Task: You are required to complete two methods push() and pop(). The push() method takes one argument, an integer 'x' to be pushed into the stack and pop() which returns an integer present at the top and popped out from the stack.
If the stack is empty then return -1 from the pop() method.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}
// } Driver Code Ends


/*
The structure of the node of the stack is
class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
*/
class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) 
    {
        StackNode curr = new StackNode(a);
        
        if(top != null)
            curr.next = top;
            
        top = curr;
    }
    
    int pop() 
    {
        if(top == null)
            return -1;
        
        int popped = top.data;
        top = top. next;
        return popped;
    }
}
