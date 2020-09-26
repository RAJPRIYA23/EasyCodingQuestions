/*
A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457 

Example 2:

Input:
LinkedList: 1->2->3
Output: 124 
Your Task:
Your task is to complete the function addOne() which takes the head of the linked list as the only argument and returns the head of the modified linked list. The driver code prints the number.
Note: The head represents the left-most digit of the number.
*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Sol obj = new Sol();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Sol
{
    public static Node addOne(Node head) 
    { 
        Node newnode = new Node(-1);
        Node temp = newnode;
        
        head = reverseList(head);
        
        Node temp1 = head;
        
        int arr[] = new int[2];
        
        int carry = 1;
        
        while(temp1 != null)
        {
            if(carry == 1)
            {
                arr = addition(temp1.data, carry);
                temp1.data = arr[0];
                carry = arr[1];
            }
               
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;
        }
        
        if(carry == 1)
        {
            Node extra = new Node(1);
            temp.next = extra;
            temp = temp.next;
        }
         
        newnode = newnode.next;
        
        newnode = reverseList(newnode);
         
        return newnode;
    }
    
    static Node reverseList(Node head)
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
    
    static int[] addition(int num, int carry)
    {
        int arr[] = new int[2];
        num = num + carry;
        
        if(num > 9)
        {
            num = num % 10;
            carry = 1;
        }
        
        else
            carry = 0;
        
        arr[0] = num;
        arr[1] = carry;
        
        return arr;
    }
}
