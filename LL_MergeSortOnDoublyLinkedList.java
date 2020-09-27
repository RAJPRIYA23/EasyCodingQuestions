/*
Given Pointer/Reference to the head of a doubly linked list of N nodes, the task is to Sort the given doubly linked list using Merge Sort 
in both non-decreasing and non-increasing order.

Example:

Input:
N = 8
value[] = {7,3,5,2,6,4,1,8}
Output:
1 2 3 4 5 6 7 8
8 7 6 5 4 3 2 1
Explanation: After sorting the given
linked list in both ways, resultant
matrix will be as given in the first
two line of output, where first line
is the output for non-decreasing
order and next line is for non-
increasing order.

Your Task:
The task is to complete the function sortDoubly() which sorts the doubly linked list. The printing is done automatically by the driver code.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.util.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int key)
    {
        data = key;
        next = prev = null;
    }
}

class Driverclass
{
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int a1 = sc.nextInt();
	        Node head = new Node(a1);
	        Node temp = head;
	        
	        for (int i = 1;i < n;i++)
	        {
	            int a = sc.nextInt();
	            Node n1 = new Node(a);
	            n1.prev = temp;
	            temp.next = n1;
	            temp = n1;
	        }
	        
	        head = new LinkedList().sortDoubly(head);
	        printList(head);
	    }
	}
	public static void printList(Node node)
	{
	    Node temp = node;
	    while(node != null)
	    {
	        System.out.print(node.data + " ");
	        temp = node;
	        node = node.next;
	    }
	    System.out.println();
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	    System.out.println();
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/
class LinkedList
{
    static Node sortDoubly(Node head)
    {
        if(head == null || head.next == null) 
            return head;
        
        Node middle = getMiddle(head); 
        Node middleNext = middle.next;
        middle.next.prev = null; 
        middle.next = null;
        
        Node left_head = sortDoubly(head);
        Node right_head = sortDoubly(middleNext); 

        return merge(left_head, right_head); 
    }
    
    public static Node getMiddle(Node head)
    {
        if(head == null) 
        return head;
    
        Node slow = head, fast = head;
    
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static Node merge(Node a, Node b)
    {
        Node dummyHead = new Node(-1);
        Node current = dummyHead;
        
        for(current  = dummyHead; a != null && b != null; current = current.next)
        {
            if(a.data <= b.data) 
            {
                current.next = a; 
                a.prev = current;
                a = a.next; 
            }
            else
            { 
                current.next = b;
                b.prev = current;
                b = b.next; 
            }
        
        }
        
        while(a != null)
        {
            current.next = a; 
            a.prev = current;
            a = a.next; 
            current = current.next;
        }
        
        while(b != null)
        {
            current.next = b; 
            b.prev = current;
            b = b.next; 
            current = current.next;
        }

        dummyHead = dummyHead.next;
        dummyHead.prev = null;
        return dummyHead;
    }
    
}
