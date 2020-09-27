/*
Given a doubly linked list, rotate the linked list counter-clockwise by P nodes. Here P is a given positive integer and is smaller than the count of nodes(N) in a linked list.
Constraints:
1 <= T <= 100
2 <= N <= 100
1 <= P <= N

Example:
Input:
1
6 2
1 2 3 4 5 6

Output:
3 4 5 6 1 2

Explanation:
Testcase 1: Doubly linked list after rotating 2 nodes is: 3 4 5 6 1 2.
*/

//Initial Template for Java

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}

public class doubly_LL {
    
    static void display(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		       
		    //Entering the data
		    Node head = new Node(sc.nextInt());
		    Node curr = head;
		    
		    //Entering the rest of the list
		    for(int i=0; i<n-1; i++){
		        int d = sc.nextInt();
		        curr.next = new Node(d);
		        curr = curr.next;
		    }
            
            Gfg obj = new Gfg();
            display(obj.rotateP(head, p));
		}
	}

}
// } Driver Code Ends


//User function Template for Java

/*
class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}
*/

class Gfg 
{
    Node rotateP (Node head, int p)
    {
        Node curr = head, prev = head, newhead = head;
        int index = 1;
        
        while(curr!= null && curr.next != null )
        {
            if(index == p)
            {
                newhead  = curr.next;
                
                newhead.prev = null;
                curr.next = null;
                
                curr = newhead;
            }
            
            index++;
            prev = curr;
            curr = curr.next;
        }
        
        if(index  == p)
        {
            return head;
        }
        
        if(curr == null)
            curr = prev;
            
        curr.next = head;
        head.prev = curr;
        
        head = newhead;
        return head;
    }
}
