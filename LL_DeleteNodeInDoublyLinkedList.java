/*
Given a doubly linked list and a position. The task is to delete a node from given position in a doubly linked list.

Example 1:

Input:
LinkedList = 1 <--> 3 <--> 4 
x = 3
Output: 1 3  
Explanation: After deleting the node at
position 3 (position starts from 1),
the linked list will be now as 1->3.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

//Initial Template for Java
import java.util.*;

class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
class Delete_Node_From_DLL
{
	Node head;
	Node tail;
	
	void addToTheLast(Node node)
	{
		if(head ==  null)
		{
			head = node;
			tail = node;
		}
		else
		{
			tail.next = node;
			tail.next.prev = tail;
			tail = tail.next;
		}
	}
	
	void printList(Node head)
	{	Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp =  temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Delete_Node_From_DLL list = new Delete_Node_From_DLL();
			
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			list.addToTheLast(head);
			
			for(int i=1;i<n;i++)
			{
				int a = sc.nextInt();
				list.addToTheLast(new Node(a));
			}
			a1 = sc.nextInt();
			GfG g = new GfG();
			//System.out.println(list.temp.data);
			Node ptr = g.deleteNode(list.head, a1);
			list.printList(ptr);
			t--;
		}
	}
}


                               // } Driver Code Ends


//User function Template for Java

/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class GfG
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
        
        if(head == null)
            return head;

        
        if(x == 1)
        {
            if(head.next != null)
            {
                head = head.next;
                head.prev = null;
            }
                    
            else
            {
                head = null;
            }
              
            return head;     
        }
        
        int index = 2;
        
        Node curr = head.next, next = curr.next, prev = head;
        
        while(curr != null && next != null)
        {
            if(index == x)
            {
                prev.next = next;
                next.prev = prev;
                return head;
            }
            index++;
            prev = curr; 
            curr = curr.next;
            next = next.next;
        }
        
        if(index == x)
        {
            curr.prev = null;
            prev.next = null;
        }
	    
	    return head;
    }
}
