/*
Given a Cirular Linked List split it into two halves circular lists. If there are odd number of nodes in the given circular linked list 
then out of the resulting two halved lists, first list should have one node more than the second list.
The resultant lists should also be circular lists and not linear lists.

Constraints:
1<=T<=100
2<=N<=100

Example:
Input:
2
3
1 5 7
4
2 6 1 5

Output:
1 5
7
2 6
1 5

Explanation:
Testcase 2: Distributing the given circular linked list into two halves makes two linked list as 2, 6 and 1, 5.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


public class circular_LinkedList
{
    Node head, head1, head2;  // head of lisl
	//Node last = null;
	Node last = null;
  
    /* Linked list Node*/
   
                    
    /* Utility functions */
 
    /* Inserts a new Node at front of the list. */
     public void addToTheLast(Node node) 
	 {
		
		  if (head == null) 
		  {
			head = node;
			
		  } else 
		  {
			   Node temp = head;
			   while (temp.next != null)
			   temp = temp.next;

		       temp.next = node;
		  }
	 }
  /* Function to print linked list */
    void printList(Node node)
    {
        Node temp = node;
        if(node != null)
        {
			do{
           System.out.print(temp.data+" ");
           temp = temp.next;
			}while (temp != node);
        }  
        System.out.println();
    }
	
	void circular()
	{
		    last = head;
			while (last.next != null)
				last = last.next;
			last.next = head;
			//System.out.println(last);
	}
	
	 
 
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			circular_LinkedList llist = new circular_LinkedList();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
			
			
		     }
			 /*Node x = head;
			 while(x!=null)
			 {
				 System.out.print(x.data+" ");
				 x = x.next;
			 }*/
			llist.circular();
          //int k=sc.nextInt();
         gfg g = new gfg();
         //System.out.println(g.getCount(llist));
		 g.splitList(llist);
		 llist.printList(llist.head1);
		 llist.printList(llist.head2);
        //llist.printList();
		//llist.head = llist.reverse(llist.head);
		//llist.printList();
		
		
        t--;
    }
}
}// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg
{
	void splitList(circular_LinkedList list)
    {
        list.head1 = list.head;
        Node slow = list.head1, fast = list.head1.next, prev = list.head1;
        
        while(fast != list.head1 && fast.next != list.head1)
        {
            slow = slow.next;
            prev = fast;
            fast = fast.next.next;
        }
        
        list.head2 = slow.next;
        
        if(fast == list.head1)
            fast = prev.next;
            
        slow.next = list.head1;    
        fast.next = list.head2;
	}
}
