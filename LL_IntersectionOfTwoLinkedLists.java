/*
Given two linked lists, the task is to complete the function findIntersection(), that returns the intersection of two linked lists. 
Each of the two linked list contains distinct node values.

Example:

Input:
LinkedList1: 9->6->4->2->3->8
LinkedList2: 1->2->8->6
Output: 6 2 8

Your Task:
You task is to complete the function findIntersection() which takes the heads of the 2 input linked lists as parameter and returns the head of intersection list.
Returned list will be automatically printed by driver code.
Note: The order of nodes in this list should be same as the order in which those particular nodes appear in input list 1.
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
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* structure of list Node:

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

*/

class Sol
{
    public static Node findIntersection(Node head1, Node head2)
    {
        Node newnode = new Node(-1);
        Node temp = newnode, temp1 = head1, temp2 = head2;
        
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        
        while(temp1 != null)
        {
            hs1.add(temp1.data);
            temp1 = temp1.next;
        }
        
        
        
        while(temp2 != null)
        {
            if(hs1.contains(temp2.data))
                hs2.add(temp2.data);
            temp2 = temp2.next;
        }
        
        
        
        temp1 = head1;
        
        while(temp1 != null)
        {
            if(hs2.contains(temp1.data))
            {
                temp.next = temp1;
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
        
        temp.next = null;
        
        newnode = newnode.next;
        return newnode;
        
    }
}
