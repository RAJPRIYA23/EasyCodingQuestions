/*
Given a singly linked list, the task is to rearrange it in a way that all odd position nodes are together and all even positions node are together.
Assume the first element to be at position 1 followed by second element at position 2 and so on.

Example 1:

Input:
LinkedList: 1->2->3->4
Output: 1 3 2 4
Example 2:

Input:
LinkedList: 1->2->3->4->5
Output: 1 3 5 2 4
Your Task:
The task is to complete the function rearrangeEvenOdd() which rearranges the nodes in the linked list as required and return the head of the linked list.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            head = new gfg().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class gfg
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns new head of linked List.
    Node rearrangeEvenOdd(Node head1)
    {
        Node head2 = head1.next;
        
        Node temp1 = head1;
        Node temp2 = head2;
        
        while(temp2 != null && temp1 !=null)
        {
            if(temp2.next == null)
                break;
            temp1.next = temp2.next;
            temp1 = temp2.next;
            
            if(temp1.next == null)
                break;
            temp2.next = temp1.next;
            temp2 = temp1.next;
            
        }
        
        temp1.next = null;
        if(temp2 !=null)
            temp2.next = null;
        
        temp1 = head1;
        while(temp1.next != null)
        {
            temp1 = temp1.next;
        }
        temp1.next = head2;
        
        return head1;
    }
}
