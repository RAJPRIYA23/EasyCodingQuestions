/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

Example:

Input:
LinkedList: 1->2->3->4->5
Output: 5
Explanation: Count of nodes in the 
linked list is 5, which is its length.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class LinkedList{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
//            CountNodes g = new CountNodes();
            System.out.println(getCount(head));
        }
    }
   
    
    
    
 // } Driver Code Ends


/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/


    public static int getCount(Node head)
    {
        
        int n=0;
        Node temp = head;
        while(temp!=null)
        {
            n++;
            temp = temp.next;
        }
        return n;
    }
    

// { Driver Code Starts.
}

  // } Driver Code Ends
