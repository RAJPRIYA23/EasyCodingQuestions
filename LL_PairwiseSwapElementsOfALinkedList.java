/*
Given a singly linked list of size N. The task is to swap elements in the linked list pairwise.
For example, if the input list is 1 2 3 4, the resulting list after swaps will be 2 1 4 3.

Example:

Input:
LinkedList: 1->2->2->4->5->6->7->8
Output: 2 1 4 2 6 5 8 7
Explanation: After swapping each pair
considering (1,2), (2, 4), (5, 6).. so
on as pairs, we get 2, 1, 4, 2, 6, 5,
8, 7 as a new linked list.
Your Task:
The task is to complete the function pairWiseSwap() which takes the head node as the only argument and returns the modified head.
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
            
            Solution g = new Solution();
            head = g.pairwiseSwap(head);
            printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends




/* node class of the linked list

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

*/


class Solution 
{
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        Node temp = head;
        
        while(temp != null && temp.next!= null)
        {
            int tempval = temp.data;
            temp.data = temp.next.data;
            temp.next.data = tempval;
            temp = temp.next.next;
        }
        
        return head;
    }
}
