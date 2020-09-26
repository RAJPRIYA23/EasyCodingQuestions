/*
Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.

Example:

Input:
N = 5
value[]  = {3,5,2,4,1}
Output: 1 2 3 4 5
Explanation: After sorting the given
linked list, the resultant matrix
will be 1->2->3->4->5.

Your Task:
For Java: The task is to complete the function mergeSort() and return the node which can be used to print the sorted linked list.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class LinkedList
{
    static Node mergeSort(Node head)
    {
        if(head == null || head.next == null) 
        return head;
        
        Node middle = getMiddle(head); 
        Node middleNext = middle.next;
        middle.next = null; 
        
        Node left_head = mergeSort(head);
        Node right_head = mergeSort(middleNext); 

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
                a = a.next; 
            }
            else
            { 
                current.next = b;
                b = b.next; 
            }
        
        }
        
        while(a != null)
        {
            current.next = a; 
            a = a.next; 
            current = current.next;
        }
        
        while(b != null)
        {
            current.next = b; 
            b = b.next; 
            current = current.next;
        }

        return dummyHead.next;
    }

}

