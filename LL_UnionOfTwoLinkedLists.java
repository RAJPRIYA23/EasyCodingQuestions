/*
Given two linked lists, your task is to complete the function makeUnion(), that returns the union of two linked lists. This union should include all the distinct elements only.

Example:
Input:
L1 = 9->6->4->2->3->8
L2 = 1->2->8->6->2
Output: 1 2 3 4 6 8 9

Your Task:
The task is to complete the function makeUnion() which makes the union of the given two lists and returns the head of the new list.

Note: The new list formed should be in non-decreasing order.
*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    Node newnode = new Node(-1);
        Node temp = newnode, temp1 = head1, temp2 = head2;
        
        Set<Integer> hs = new HashSet<>();
        
        while(temp1 != null)
        {
            hs.add(temp1.data);
            temp1 = temp1.next;
        }
        
        
        while(temp2 != null)
        {
            hs.add(temp2.data);
            temp2 = temp2.next;
        }
        
        TreeSet<Integer> ts = new TreeSet<>(hs); 
        
        for (Integer value : ts) 
        {
            Node dummyNode = new Node(value); 
            temp.next = dummyNode;
            temp = temp.next;
        }
       
        newnode = newnode.next;
        return newnode;
	}
}
