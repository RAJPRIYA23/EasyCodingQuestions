/*
Given a sorted singly linked list and a data, your task is to insert the data in the linked list in a sorted way i.e. order of the list doesn't change.

Example:

Input:
LinkedList: 25->36->47->58->69->80
data: 19
Output: 19 25 36 47 58 69 80

Your Task:
The task is to complete the function sortedInsert() which should insert the element in sorted Linked List and return the head of the linked list
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
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends




/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution
{
    Node sortedInsert(Node head1, int key)
    {
        Node node = new Node(key);
        
        if(key < head1.data)
        {
            node.next = head1;
            head1 = node;
            return head1;
        }
        
        Node temp = head1 , prev = head1;
        
        while(temp != null)
        {
            if(temp.data > key)
            {
                prev.next = node;
                node.next = temp;
                return head1;
            }
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = node;
        return head1;
    }
}
