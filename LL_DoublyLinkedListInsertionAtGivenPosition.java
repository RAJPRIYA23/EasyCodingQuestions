/*
Given a doubly-linked list, a position p, and an integer x. The task is to add a new node with value x at the position just after pth node in the doubly linked list.

Example:

Input:
LinkedList: 2<->4<->5
p = 2, x = 6 
Output: 2 4 5 6
Explanation: p = 2, and x = 6. So, 6 is
inserted after p, i.e, at position 3
(0-based indexing).

Your Task:
The task is to complete the function addNode() which head reference, position and data to be inserted as the arguments, with no return type.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}

class DLinkedList
{
	
	Node newNode(Node head, int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
		    head = n;
		    return head;
		}
		head.next = n;
		n.prev = head;
		head = n;
		return head;
	}
	
	
	void printList(Node node)
	{
		Node temp = node;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		while(temp.prev != null)
		{
			temp = temp.prev;
		}
		
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DLinkedList DLL = new DLinkedList();
		int t = sc.nextInt();
		
		while(t>0)
		{
			Node temp;
			Node head = null;
			Node root = null;
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int x = sc.nextInt();
				head = DLL.newNode(head,x);
			    if(root == null)    root = head;
			}
			head = root;
			int pos = sc.nextInt();
			int data = sc.nextInt();
			
		    GfG g = new GfG();
		    g.addNode(head,pos,data);
			
			DLL.printList(head);
			while(head.next != null)
			{
				temp = head;
				head = head.next;
			}
		    t--;
		}
	}
}// } Driver Code Ends


/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    void addNode(Node head, int pos, int data)
	{
		Node curr = head, next = head;;
		int index = 0;
		
		while(curr!= null)
		{
		    if(pos == index)   
		    {
		        Node newnode = new Node(data);
		        
		        if(curr.next == null)
		        {
		            newnode.prev = curr;
		            curr.next = newnode;
		        }
		        
		        else
		        {
		            next = curr.next;
		            newnode.prev = curr;
		            newnode.next = next;
		            curr.next = newnode;
		            next.prev = newnode;
		            break;
		        }
		        
		    }
		    
            curr = curr.next;
            index++;
		}
	}
}
