/*
Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the list (in-place) and return head of the merged list.
Note: It is strongly recommended to do merging in-place using O(1) extra space.

Example:

Input:
N = 4, M = 3 
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked
lists, we have merged list as 2, 3, 5,]
10, 15, 20, 40.

Your Task:
The task is to complete the function sortedMerge() which takes references to the heads of two linked lists as the arguments and returns the head of merged linked list.
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


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}
// } Driver Code Ends


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    Node sortedMerge(Node headA, Node headB)
    {
        Node firstList = headA, secondList = headB;
        
        Node newnode = new Node(-1);
        Node temp = newnode;
        
        while(firstList != null && secondList != null)
        {
            if(firstList.data < secondList.data)
            {
                temp.next = firstList;
                firstList = firstList.next;
            }
                
            else
            {
                temp.next = secondList;
                secondList = secondList.next;
            }
                
                temp = temp.next;   
        }
            
        while(firstList != null)
        {
            temp.next = firstList;
            firstList = firstList.next;
            temp = temp.next; 
        }
            
        while(secondList != null)
        {
            temp.next = secondList;
            secondList = secondList.next;
            temp = temp.next; 
        }
        
        return newnode.next;
    } 
}
