/*
Given a singly linked list of size N of integers. The task is to check if the given linked list is palindrome or not.

Example:

Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
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

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Palindrome g = new Palindrome();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}



// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        Boolean isPalndrom = true;
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast !=  null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node node1 = head;
        Node node2 = slow.next;

        slow.next = null;
        
        node2 = reverseList(node2);
        
        Node curr1 = node1, curr2 = node2; 
        
        while(curr2 != null)
        {
            if(curr1.data != curr2.data)
                return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return true;
        
    }
    
    
    Node reverseList(Node head)
    {
        Node curr=head, prev=null, next;
        
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}

