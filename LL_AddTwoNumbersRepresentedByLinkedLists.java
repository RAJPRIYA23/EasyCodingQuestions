/*
Given two numbers represented by two linked lists of size N and M. The task is to return a sum list. The sum list is a linked list representation 
of the addition of two input numbers.

Example:

Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).

Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the new list.  
*/


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution
{
    static Node addLists(Node first, Node second)
    {
        Node newnode = new Node(0);
        Node temp = newnode;
        
        first = reverseList(first);
        second = reverseList(second);
        
        Node temp1 = first;
        Node temp2 = second;
        
        int arr[] = new int[2];
        
        int carry = 0;
        
        while(temp1!= null && temp2!= null)
        {
            arr = addition(temp1.data, temp2.data, carry);
            
            temp1.data = arr[0];
            carry = arr[1];
                
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
         while(temp1 != null)
         {
            if(carry == 1)
            {
                arr = addition(temp1.data, 0 , carry);
                temp1.data = arr[0];
                carry = arr[1];
            }
             
             temp.next = temp1;
             temp = temp.next;
             temp1 = temp1.next;
         }
         
         while(temp2 != null)
         {
            if(carry == 1)
            {
                arr = addition( 0 ,temp2.data, carry);
                temp2.data = arr[0];
                carry = arr[1];
            }
            
            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
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
    
    static int[] addition(int num1, int num2, int carry)
    {
        int arr[] = new int[2];
        num1 = num1 + num2 + carry;
        
        if(num1 > 9)
        {
            num1 = num1 % 10;
            carry = 1;
        }
        
        else
            carry = 0;
        
        arr[0] = num1;
        arr[1] = carry;
        
        return arr;
    }
    
}
