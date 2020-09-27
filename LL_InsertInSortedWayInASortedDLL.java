/*
Given a sorted doubly linked list and an element X, your need to insert the element X into correct position in the sorted DLL.

Your Task:
You only need to complete the function sortedInsert() that takes head reference and x as arguments and returns the head of the modified list.
The printing and checking tasks are done by the driver code.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Node
{
    int data;
    Node next, prev;
    
    Node(int item)
    {
        data = item;
        next = prev = null;
    }
}

class Insert_Sorted_DLL
{
    public static boolean isChecked(Node head)
    {
        int lengthF=0;
        int lengthB=0;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            lengthF++;
        }
        
        while(temp.prev!=null)
        {
            temp=temp.prev;
            lengthB++;
        }
        
        return lengthF==lengthB? true:false;
    }
	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        
	        Node head=null, tail=null;
	        
	        for (int i = 0;i < n;i++)
	        {
	            int a = sc.nextInt();
	            if (head==null) 
	            {
	                head = new Node(a);
	                tail = head;
	            }
	            else
	            {
	                tail.next=new Node(a);
	                tail.next.prev=tail;
	                tail = tail.next;
	            }
	        }
	        
	        int x = sc.nextInt();
	        GfG gfg = new GfG();
	         head =  gfg.sortedInsert(head, x);
	         
	        if(isChecked(head))
	        printList(head);
	        else
	        System.out.print("The node has not been inserted correctly. Please fix the prev and next pointers");
	        System.out.println();
	    }
	}
	
	public static void printList(Node head)
	{
	    Node temp = head;
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	}
}
// } Driver Code Ends


/*class of the node of the DLL is as
class Node {
	int data;
    Node prev, next;
    Node(int item)
    {data = item;
        next = prev = null;
    }
}
*/
// function should insert a new node in sorted way in
// a sorted doubly linked list
class GfG
{
    public static Node sortedInsert(Node head, int x)
    {

        Node newnode  = new Node(x);
        
        if(head == null)
            return newnode;
            
        if(newnode.data < head.data)
        {
            newnode.next = head;
            head.prev = newnode;
            return newnode;
        }
         
        Node curr = head.next, prev = head;
        
        if(curr == null)
        {
            prev.next = newnode;
            newnode.prev = prev;
            return head;
        }
        
        while(curr != null && curr.next != null)
        {
            if(newnode.data < curr.data)
            {
                newnode.prev = prev;
                newnode.next = curr;
                prev.next = newnode;
                curr.prev = newnode;
                return head;
            }
            prev = curr;
            curr = curr.next;
        }
        
        if(newnode.data < curr.data)
        {
            newnode.prev = prev;
            newnode.next = curr;
            prev.next = newnode;
            curr.prev = newnode;
            return head;
        }
        
        curr.next = newnode;
        newnode.prev = curr;
        
        return head;
    }
}
