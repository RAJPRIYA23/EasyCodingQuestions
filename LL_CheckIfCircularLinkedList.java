/*
Given a singly linked list, find if the linked list is circular or not. A linked list is called circular if it not NULL terminated
and all nodes are connected in the form of a cycle. An empty linked list is considered as circular.

Example:

Input:
LinkedList: 1->2->3->4->5
(the first and last node is connected,
i.e. 5 --> 1)
Output: 1

Your Task:
The task is to complete the function isCircular() which checks if the given linked list is circular or not. It should return true or false accordingly. 
(the driver code prints 1 if the returned values is true, otherwise 0)
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinklIst_Circular
{
	Node head;
	
	
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int l = sc.nextInt();
			
			sc.nextLine().trim().split(" ");
			String str[]= sc.nextLine().trim().split(" ");
            Node head = null, tail = null;
            head = new Node(Integer.parseInt(str[0]));
            tail = head;
            for(int i = 1; i < n ; i++)
            {
                tail.next = new Node(Integer.parseInt( str[i]));
                tail = tail.next;
            }
                
			
			if(l==1 && n>=1)
			{
				Node temp = head;
				while(temp.next != null)
				{
					temp = temp.next; 
				}
				temp.next = head;
			}
			
			GfG g = new GfG();
			boolean b = g.isCircular(head);
			if(b==true)
			System.out.println(1);
			else 
			System.out.println(0);
		t--;
		}
	}
}

// } Driver Code Ends


/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	    if(head == null)
	        return true;
	    
	    head.data = -(head.data);
	    Node temp = head.next;
	    
	    while(temp != null && temp.data > 0)
	        temp = temp.next;
	    
	    if(temp == null)
	        return false;
	    else
	        return true;
    }
}
